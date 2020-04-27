<<<<<<< HEAD
package com.utn;

import com.utn.Persons.*;
import com.utn.Proyects.*;

import java.util.ArrayList;

public class Menu {


    public Menu() {
    }

    public void PrintHeader(String cabecera) {
        int i;
        System.out.print("\u25fc");
        for (i = 0; i < cabecera.length(); i++) {
            System.out.print("\u25fc");
        }
        System.out.print("\u25fc\n");
        System.out.printf("%s%25s%5s\n", "\u25fc", cabecera, "\u25fc");
        System.out.print("\u25fc");
        for (i = 0; i < cabecera.length(); i++) {
            System.out.print("\u25fc");
        }
        System.out.print("\u25fc");
    }

    public void printMenu1() {
        this.PrintHeader("CONSTRUCTION SOFTWARE");
        System.out.println("\n1. Create employee");
        System.out.println("2. Create construction site");
        System.out.println("3. Create company");
        System.out.println("0. Exit");
    }

    public void printMenu2() {
        this.PrintHeader("CONSTRUCTION SOFTWARE");
        System.out.println("\n1. Send employees to work");
        System.out.println("2. Assign employees to the Company");
        System.out.println("3. Assign employees in to the Construction Site");
        System.out.println("4. Assign Construction Site to Company");
        System.out.println("5. Show employees form a Site");
        System.out.println("6. Print all the construction sites of the Company");
        System.out.println("0. Exit");
    }

    public void printEmployees(ArrayList<Employee> employees) {
        if (employees.isEmpty()) System.out.println("E R R O R empty list of employees");
        else {
            for (int i = 0; i < employees.size(); i++) {
                Employee employee = employees.get(i);
                System.out.println(i + ". Rol:" + employee.getClass().getSimpleName() + " Name:" + employee.getName());
            }
        }
    }

    public void printWorkAnyEmployee(Employee employee) {
        String work = (employee.getClass() == Architect.class) ? ((Architect) employee).createDrawing() :
                (employee.getClass() == Worker.class) ? ((Worker) employee).work() : ((ConstructForeman) employee).work();
        System.out.println("\n" + work);
    }

    public void printConstructionSites(ArrayList<ConstructionSite> constructionSites) {
        if (constructionSites.isEmpty()) System.out.println("E R R O R empty list of employees");
        else {
            for (int i = 0; i < constructionSites.size(); i++) {
                ConstructionSite currentSite = constructionSites.get(i);
                System.out.println(i + ". Type:" + currentSite.getClass().getSimpleName() + " Address:" + currentSite.getAddress() + "\n");
            }
        }
    }








    /*
    public void printMenuEmployee() {
        this.imprimirCabecera("CONSTRUCTION SOFTWARE");
        System.out.println("\n1. Create Architect");
        System.out.println("2. Create Worker");
        System.out.println("3. Create Construct Foreman");
        System.out.println("0. Return");
    }

    public void printMenuConstSite() {
        this.imprimirCabecera("CONSTRUCTION SOFTWARE");
        System.out.println("\n1. Create Residential site ");
        System.out.println("2. Create Commercial site");
        System.out.println("3. Create Hotel site");
        System.out.println("0. Return");
    }

    public void printSubMenuEmployee() {
        this.imprimirCabecera("CONSTRUCTION SOFTWARE");
        System.out.println("\n1. Employee Info ");
        System.out.println("2. Send to work");
        System.out.println("0. Return");
    }

    public void printSubMenuConstSite() {
        System.out.println("\n1. Construction site Info");
        System.out.println("2. Assign employees");
        System.out.println("3. Estimated cost of the project");
        System.out.println("4. Employees assigned");
        System.out.println("0. Return");
    }

    public void printMenuCompany() {
        this.imprimirCabecera("CONSTRUCTION SOFTWARE");
        System.out.println("\n1. Company Info");
        System.out.println("2. Construction Sites");
        System.out.println("3. Employees");
        System.out.println("0. Return");
    }

    public void menuEmployee() {
        Scanner scanner = new Scanner(System.in);
        this.printMenuEmployee();
        int op = Integer.parseInt(scanner.next());
        switch (op) {
            case 1 -> {
                Architect a1 = new Architect("Ismael", "339953778", 549233446);

                this.SubMenuEmployee(a1);
            }
            case 2 -> {
                Worker w1 = new Worker("Carl", "3022344", 549556621, 32);
                this.SubMenuEmployee(w1);
            }
            case 3 -> {
                ConstructForeman f1 = new ConstructForeman("Roberto", "B121223", 54915469, 55);
                this.SubMenuEmployee(f1);
            }
            default -> System.out.println("Not a valid option");
        }
    }

    public void SubMenuEmployee(Employee employee) {
        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            this.printSubMenuEmployee();
            op = Integer.parseInt(scanner.next());
            switch (op) {
                case 1 -> {
                    String info = (employee.getClass() == Architect.class) ?
                            ((Architect) employee).toString() : ((Worker) employee).toString();
                    System.out.println(info);
                }
                case 2 -> {
                    String work = (employee.getClass() == Architect.class) ? ((Architect) employee).createDrawing() :
                            (employee.getClass() == Worker.class) ? ((Worker) employee).work() : ((ConstructForeman) employee).work();
                    System.out.println(work);
                }
                default -> System.out.println("Not a valid option");
            }
        } while (op != 0);
    }

    public void menuConstructionSite() {
        Scanner scanner = new Scanner(System.in);
        this.printMenuConstSite();
        int op = Integer.parseInt(scanner.next());
        switch (op) {
            case 1 -> {
                Residential r1 = new Residential("Colon 5354", 200, 1500, 50000, 2);
                this.SubMenuConstSite(r1);
            }
            case 2 -> {
                Hotel h1 = new Hotel("Ritz", "las vegas 223", 500, 2000, 150000, 4);
                this.SubMenuConstSite(h1);
            }
            case 3 -> {
                Comercial c1 = new Comercial("Drugstore", "Thailand 330", 20, 350, 200000, "7 eleven");
                this.SubMenuConstSite(c1);
            }
            default -> System.out.println("Not a valid option");
        }
    }

    public void SubMenuConstSite(ConstructionSite constSite) {
        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            this.printSubMenuConstSite();
            op = Integer.parseInt(scanner.next());
            switch (op) {
                case 1 -> {
                    String info = (constSite.getClass() == Residential.class) ? ((Residential) constSite).toString() :
                            (constSite.getClass() == Comercial.class) ? ((Comercial) constSite).toString() : ((Hotel) constSite).toString();
                    System.out.println(info);
                }
                case 2 -> {

                }

                default -> System.out.println("Not a valid option");
            }
        } while (op != 0);
    }*/
=======
package com.utn;

public class Menu {

    public Menu() {
    }

    public void PrintHeader(String cabecera) {
        int i;
        System.out.print("\u25fc");
        for (i = 0; i < cabecera.length(); i++) {
            System.out.print("\u25fc");
        }
        System.out.print("\u25fc\n");
        System.out.printf("%s%25s%5s\n", "\u25fc", cabecera, "\u25fc");
        System.out.print("\u25fc");
        for (i = 0; i < cabecera.length(); i++) {
            System.out.print("\u25fc");
        }
        System.out.print("\u25fc");
    }

    public void printMenu2() {
        this.PrintHeader("CONSTRUCTION SOFTWARE");
        System.out.println("\n1. Send employees to work");
        System.out.println("2. Employees details");
        System.out.println("3. Assign Construction Site to Company");
        System.out.println("4. Assign employees in to the Construction Site");
        System.out.println("5. Show employees from a Site");
        System.out.println("6. Print all the construction sites of the Company");
        System.out.println("7. Show Company Info");
        System.out.println("0. Exit");
    }
>>>>>>> UTN Real State Developments S.A.
}