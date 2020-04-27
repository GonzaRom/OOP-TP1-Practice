<<<<<<< HEAD
package com.utn;

import com.utn.Persons.Employee;
import com.utn.Proyects.ConstructionSite;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Employee> employees;
    private ArrayList<ConstructionSite> constructionSites;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.constructionSites = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setConstructionSite(ArrayList<ConstructionSite> constructionSites) {
        this.constructionSites = constructionSites;
    }

    public void addConstructionSite(ConstructionSite constructionSite) {
        this.constructionSites.add(constructionSite);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public ConstructionSite getConstructionSite(int i) {
       if (i < 0 || i > constructionSites.size()-1) return null;
        else
            return constructionSites.get(i);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<ConstructionSite> getConstructionSites() {
        return constructionSites;
    }

    public String printConstructionSites() {
        if (constructionSites.isEmpty()) {
            return "E R R O R no construction sites assigned to the company";
        } else {
            StringBuilder stringConstructionSites = new StringBuilder();
            for (ConstructionSite currentSite : constructionSites) {
                stringConstructionSites.append(currentSite.toString());
            }
            return "Construction Sites:" + stringConstructionSites.toString();
        }
    }

}
=======
package com.utn;

import com.utn.Employees.*;
import com.utn.Proyects.*;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Employee> employees;
    private ArrayList<ConstructionSite> constructionSites;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.constructionSites = new ArrayList<>();
    }

    ///Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void setConstructionSite(ArrayList<ConstructionSite> constructionSites) {
        this.constructionSites = constructionSites;
    }

    public void addConstructionSite(ConstructionSite constructionSite) {
        this.constructionSites.add(constructionSite);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<ConstructionSite> getConstructionSites() {
        return constructionSites;
    }
    ///

    public ConstructionSite getConstructionSite(int i) {
        if (i < 0 || i > constructionSites.size() - 1) return null;
        else
            return constructionSites.get(i);
    }

    ///Return a String with all the details of the construction site
    public String printConstructionSitesFull() {
        if (constructionSites.isEmpty()) {
            return "E R R O R no construction sites assigned to the company";
        } else {
            StringBuilder stringConstructionSites = new StringBuilder();
            for (ConstructionSite currentSite : constructionSites) {
                stringConstructionSites.append(currentSite.toString());
                stringConstructionSites.append("\n");
            }
            return "Construction Sites:" + stringConstructionSites.toString();
        }
    }

    ///Return a String with all the construction site in order to chose one
    public String printConstructionSites() {
        if (constructionSites.isEmpty()) return "E R R O R empty list of employees";
        else {
            StringBuilder stringConstructionSites = new StringBuilder();
            for (int i = 0; i < constructionSites.size(); i++) {
                ConstructionSite currentSite = constructionSites.get(i);
                stringConstructionSites.append(i);
                stringConstructionSites.append(". Type: ");
                stringConstructionSites.append(currentSite.getClass().getSimpleName());
                stringConstructionSites.append("\tAddress:");
                stringConstructionSites.append(currentSite.getAddress());
                stringConstructionSites.append("\n");
            }
            return stringConstructionSites.toString();
        }
    }

    ///Return a String with a list of the Employees to chose one
    public String printEmployees() {
        if (employees.isEmpty()) return "E R R O R empty list of employees";
        else {
            StringBuilder stringEmployees = new StringBuilder();
            for (int i = 0; i < employees.size(); i++) {
                Employee employee = employees.get(i);
                stringEmployees.append(i);
                stringEmployees.append(". Rol:");
                stringEmployees.append(employee.getClass().getSimpleName());
                stringEmployees.append(" \tName:");
                stringEmployees.append(employee.getName());
                stringEmployees.append("\n");
            }
            return stringEmployees.toString();
        }
    }

    ///Return a String with the correct Work message depending of the type of Employee
    public String printWorkAnyEmployee(int pos) {
        Employee employee = employees.get(pos);
        String work = (employee.getClass() == Architect.class) ? ((Architect) employee).createDrawing() :
                (employee.getClass() == Worker.class) ? ((Worker) employee).work() : ((ConstructForeman) employee).work();
        return "\n" + work;
    }

    ///Return a String with all the details of ANY employee
    public String printAnyEmployee(int pos) {
        Employee employee = employees.get(pos);
        String employeeToString = (employee.getClass() == Architect.class) ? ((Architect) employee).toString() :
                (employee.getClass() == Worker.class) ? ((Worker) employee).toString() : ((ConstructForeman) employee).toString();
        return "\n" + employeeToString;
    }

    ///Return a string with type, address and estimate cost of all the construction sites
    public String printConstSiteWithCost() {
        if (constructionSites.isEmpty()) return "E R R O R empty list of employees";
        else {
            StringBuilder stringConstructionSites = new StringBuilder();
            for (int i = 0; i < constructionSites.size(); i++) {
                ConstructionSite currentSite = constructionSites.get(i);
                stringConstructionSites.append(i);
                stringConstructionSites.append(". Type: ");
                stringConstructionSites.append(currentSite.getClass().getSimpleName());
                stringConstructionSites.append("\tAddress:");
                stringConstructionSites.append(currentSite.getAddress());
                stringConstructionSites.append("\tEstimate Cost:");
                stringConstructionSites.append(currentSite.getEstimateProjectCost());
                stringConstructionSites.append("\n");
            }
            return stringConstructionSites.toString();
        }
    }

    public String toString(){
        return "Company name: "+getName()+
                "\nNumber of Employees: "+employees.size()+
                "\nNumber of Construction Sites: "+constructionSites.size();
    }
}
>>>>>>> UTN Real State Developments S.A.
