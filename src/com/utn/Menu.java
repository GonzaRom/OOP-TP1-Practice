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
}