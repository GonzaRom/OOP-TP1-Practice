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
