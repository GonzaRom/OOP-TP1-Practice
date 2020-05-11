package com.utn;

import com.utn.Employees.*;
import com.utn.Proyects.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<ConstructionSite> constructionSites = new ArrayList<>();

        ///Employees::
        Worker w1 = new Worker("Carl", "3022344", 549556621, 32);
        employees.add(w1);
        Worker w2 = new Worker("Bob", "B556211", 54921345, 25);
        employees.add(w2);
        Worker w3 = new Worker("Ana", "31355642", 549121235, 60);
        employees.add(w3);
        Architect a1 = new Architect("Ismael", "339953778", 549233446);
        employees.add(a1);
        Architect a2 = new Architect("Elvio", "249953778", 549533446);
        employees.add(a2);
        ConstructForeman f1 = new ConstructForeman("Roberto", "B121223", 54915469, 55);
        employees.add(f1);
        ConstructForeman f2 = new ConstructForeman("Marito", "A1212BB2", 54955611, 21);
        employees.add(f2);
        ConstructForeman f3 = new ConstructForeman("Tony", "58442211", 64512331, 56);
        employees.add(f3);
        ConstructForeman f4 = new ConstructForeman("Gonzalo", "D5441133", 549599482, 31);
        employees.add(f4);

        /**************************Construction Sites:*********************************/
        Residential r1 = new Residential("Colon 5354", 200, 200, 300, 2);
        constructionSites.add(r1);
        Hotel h1 = new Hotel("Ritz", "las vegas 223", 500, 300, 1500, 2);
        constructionSites.add(h1);
        Comercial c1 = new Comercial("Drugstore", "Thailand 330", 20, 100, 5000, "7 eleven");
        constructionSites.add(c1);

        /******************************Company:*************************************/
        Company com1 = new Company("UTN Real Estate Developments S.A.");

        ///All the employees have been assign to the Company
        com1.setEmployees(employees);

        System.out.println(com1.printEmployees());
        System.out.println("Insert the number of a employee for send to work:");
        System.out.println(com1.printWorkAnyEmployee(4));
        System.out.println(com1.printWorkAnyEmployee(2));
        System.out.println(com1.printWorkAnyEmployee(1));

        System.out.println(com1.printEmployees());
        System.out.println(com1.printAnyEmployee(6));

        com1.setConstructionSite(constructionSites);
        System.out.println("All the construction sites have been assign to the Company");

        System.out.println(com1.printConstructionSites());
        System.out.println("Select a construction site to assign employees:\n");
        for (Employee emp : employees)
            System.out.println(constructionSites.get(2).addNewEmployee(emp));
        System.out.println(com1.printConstructionSites());
        System.out.println(com1.getConstructionSite(1).printEmployeesPerSite());
        System.out.println(com1.printConstructionSitesFull());
        System.out.println(com1.toString());
        System.out.println("Thanks for all. Have a good one!");

    }}
