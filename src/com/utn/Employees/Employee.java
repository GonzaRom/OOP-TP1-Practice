package com.utn.Employees;

public abstract class Employee {
    protected String name;
    protected String dni;
    protected int phone;
    protected double costPerDay;

    public Employee() {
    }

    public Employee(String name, String dni, int phone) {
        this.dni = dni;
        this.phone = phone;
        this.name = name;
    }

    ///Setters and Getters
    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public int getPhone() {
        return phone;
    }

    public double getCostPerDay() {
        return costPerDay;
    }
    ///


    ///Depending on the type of employee the cost per day
    public abstract double employeeCost();

    ///to String method
    public String toString() {
        return "Employee:" +
                " rol = " + getClass().getSimpleName() +
                ", name = " + name +
                ", dni = " + dni +
                ", phone = " + phone +
                ", costPerDay = $" + costPerDay;
    }

}
