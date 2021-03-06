package com.utn.Employees;

import java.util.UUID;

public class Architect extends Employee {
    private final String registrationNumber;

    public Architect(String name, String dni, int phone) {
        super(name, dni, phone);
        super.costPerDay = employeeCost();
        this.registrationNumber = UUID.randomUUID().toString().replace("-", "").substring(0, 10);
        //Get a random UUID , transform it to String, reduce it to 5 character long
        //and replace the " - " symbol in order to get a clean alphanumeric ID
    }

    ///Setters and Getters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    ///Set Employee Cost
    public double employeeCost() {
        return 2000.00;
    }

    ///Message from the Architect
    public String createDrawing() {
        return "I am an Architect and I'm creating my next drawing";
    }

    //toString method
    public String toString() {
        return super.toString() + ", registration number = " + registrationNumber;
    }
}
