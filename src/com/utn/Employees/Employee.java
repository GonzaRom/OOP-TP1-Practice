<<<<<<< HEAD:src/com/utn/Persons/Employee.java
package com.utn.Persons;

public abstract class Employee {
    protected String name;
    protected String dni;
    protected int phone;
    protected double costPerDay;

    public Employee() {
        super();
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

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

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
=======
package com.utn.Employees;

public abstract class Employee {
    protected String name;
    protected String dni;
    protected int phone;
    protected double costPerDay;

    public Employee() {}

    public Employee(String name, String dni, int phone) {
        this.dni = dni;
        this.phone = phone;
        this.name = name;
    }

    ///Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
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
>>>>>>> UTN Real State Developments S.A.:src/com/utn/Employees/Employee.java
