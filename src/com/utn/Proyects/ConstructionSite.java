package com.utn.Proyects;

import com.utn.Persons.Architect;
import com.utn.Persons.ConstructForeman;
import com.utn.Persons.Employee;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSizeOnMt2() {
        return sizeOnMt2;
    }

    public void setSizeOnMt2(double sizeOnMt2) {
        this.sizeOnMt2 = sizeOnMt2;
    }

    public int getEstimateProjectTime() {
        return estimateProjectTime;
    }

    public void setEstimateProjectTime(int estimateProjectTime) {
        this.estimateProjectTime = estimateProjectTime;
    }

    public double getCostPerMt2() {
        return costPerMt2;
    }

    public void setCostPerMt2(double costPerMt2) {
        this.costPerMt2 = costPerMt2;
    }

    public double getEstimateProjectCost() {
        this.setEstimateProjectCost(); return estimateProjectCost;
    }

    public ArrayList<Employee> getEmployees() {return employees; }
    ////

    ///Try to add NEW employee in the list of employees
    private int tryAddNewEmployee(Employee employee) {
        if (!employees.isEmpty()) {
            int countConstructForeman = 0;
            /// Traverse the list count
            for (Employee emp : employees) {
                if (emp.getClass() == Architect.class && Architect.class == employee.getClass()) { ///Only One Architect per Construction Site
                    return 1;                                           ///Return E R R O R
                }
                else if (emp.getClass() == ConstructForeman.class && employee.getClass() == emp.getClass()) {
                    if (countConstructForeman < 2) {                     ///Max of 3 construct foreman per Construction Site
                        ++countConstructForeman;                         ///less than the max? increase the counter
                    } else return 2;                                    ///more than 3? Return E R R O R
                }
            }
        }
        employees.add(employee);                                      ///All good? add the employee
        return 0;
    }

    public String addNewEmployee(Employee employee) {
        int flag = tryAddNewEmployee(employee);
        String message = "\0";
        switch (flag) {
            case 1 -> message = "There may be only one Architect per Construction Site.";
            case 2 -> message = "There may be a maximum of three Construct Foreman per Construction Site.";
            case 0 -> message = "Successful";
        }
        return message;
    }

    ///Get site surface cost
    public double getSiteSurfaceCost() {
        return this.costPerMt2 * this.sizeOnMt2;                ///I prefer to use "this." so I can know straight away
                                                                ///when is a inner attribute.
    }

    ///Set Estimate Project Cost
    public void setEstimateProjectCost() {
        double empPerDayCost = 0;
        ///Use employee to traverse all the employees list and calculate the cost/day for each employee
        for (Employee employee : employees) {
            double costPerDay=employee.getCostPerDay();
            empPerDayCost += costPerDay * estimateProjectTime;
        }
        ///Get cost of the total surface and sum to the total of employees per day cost
        estimateProjectCost = empPerDayCost + getSiteSurfaceCost();
    }


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
        return "\nConstruction Site:" +
                ", Type = " + getClass().getSimpleName() +
                ", Address =" + address +", Estimate Project Cost =$" + getEstimateProjectCost()+
                ", Size =" + sizeOnMt2 + "mt2" +
                ", Estimate Project Time = " + estimateProjectTime + "days" +
                ", Cost per mt2 =$" + costPerMt2;
    }
}
