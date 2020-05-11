package com.utn.Proyects;

import com.utn.Employees.*;

import java.util.ArrayList;


public class ConstructionSite {
    protected String address;
    protected double sizeOnMt2;
    protected int estimateProjectTime;
    protected double costPerMt2;
    protected ArrayList<Employee> employees;
    protected double estimateProjectCost;

    public ConstructionSite(String address, double sizeOnMt2, int estimateProjectTime, double costPerMt2) {
        this.address = address;
        this.sizeOnMt2 = sizeOnMt2;
        this.estimateProjectTime = estimateProjectTime;
        this.costPerMt2 = costPerMt2;
        employees = new ArrayList<>();
    }

    ///Setters and Getters
    public String getAddress() {
        return address;
    }


    public double getEstimateProjectCost() {
        this.setEstimateProjectCost();
        return estimateProjectCost;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    ////

    ///Try to add NEW employee in the list of employees
    private int tryAddNewEmployee(Employee employee) {
        if (!employees.isEmpty()) {
            int countConstructForeman = 0;
            /// Traverse the list and count
            for (Employee emp : employees) {
                if (emp.getClass() == Architect.class
                        && Architect.class == employee.getClass()) { ///Only One Architect per Construction Site
                    return 1;                                           ///Return E R R O R
                } else if (emp.getClass() == ConstructForeman.class && employee.getClass() == emp.getClass()) {
                    if (countConstructForeman < 2) {                     ///Max of 3 construct foreman per Construction Site
                        ++countConstructForeman;                         ///less than the max? increase the counter
                    } else return -1;                                    ///more than 3? Return E R R O R
                }
            }
        }
        employees.add(employee);                                      ///All good? add the employee
        return 0;
    }

    ///Add new Employee to the Site, Is not possible? Return why
    public String addNewEmployee(Employee employee) {
        int flag = tryAddNewEmployee(employee);
        String message = "\0";
        switch (flag) {
            case 1 -> message = "There may be only one Architect per Construction Site.";
            case -1 -> message = "There may be a maximum of three Construct Foreman per Construction Site.";
            case 0 -> message = "Successful";
        }
        return message;
    }

    ///Get site surface cost
    public double getSiteSurfaceCost() {
        return this.costPerMt2 * this.sizeOnMt2;
        ///I prefer to use "this." so I can know straight away
        ///when is a inner attribute.
    }

    ///Set Estimate Project Cost
    public void setEstimateProjectCost() {
        double empPerDayCost = 0;
        int countArch = 0;
        int countConstForeman = 0;
        int countWorker = 0;
        ///Use employee to traverse all the employees list and calculate the cost/day for each employee
        for (Employee employee : employees) {
            //get the cost per day for each employee
            double costPerDay = employee.getCostPerDay();
            empPerDayCost += costPerDay * estimateProjectTime;

            if (Architect.class == employee.getClass()) ++countArch;
            else if (employee.getClass() == ConstructForeman.class) ++countConstForeman;
            else if (employee.getClass() == Worker.class) ++countWorker;
        }
        ///Only 1 Architect per site, At least one max three Construct Foreman per Site and at least 2 Workers///
        if (countArch == 1 && countConstForeman <= 3 && countConstForeman >= 1 && countWorker >= 2) {
            ///If all good. Get cost of the total surface and sum to the total of employees per day cost
            estimateProjectCost = empPerDayCost + getSiteSurfaceCost();
        } else estimateProjectCost = 0;
    }

    ///Print all the employees from the current site
    public String printEmployeesPerSite() {
        if (employees == null) {
            return "E R R O R construction site not exist.";
        } else if (employees.isEmpty()) {
            return "No employees added to the site";
        } else {
            StringBuilder stringOfEmployees = new StringBuilder();
            for (Employee employee : employees) {
                stringOfEmployees.append(employee.getClass().getSimpleName());
                stringOfEmployees.append("\tname: ");
                stringOfEmployees.append(employee.getName());
                stringOfEmployees.append("  dni: ");
                stringOfEmployees.append(employee.getDni());
                stringOfEmployees.append("\n");
            }
            return "Employees for the " + this.getClass().getSimpleName() + ":\n" + stringOfEmployees.toString();
        }
    }

    ///to String method
    public String toString() {
        return "\nType = " + getClass().getSimpleName() +
                ", Address =" + address + ", Estimate Project Cost =$" + getEstimateProjectCost() +
                ", Size =" + sizeOnMt2 + "mt2";
    }
}
