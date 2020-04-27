package com.utn.Persons;

public class ConstructForeman extends Employee implements Work {
    protected int age;

    public ConstructForeman(String name, String dni, int phone, int age) {
        super(name, dni, phone);
        super.costPerDay = employeeCost();
        this.age = age;
    }

    public double employeeCost() {
        return 1800.00;
    }

    ///Message from the Construct Foreman when is working
    public String work() {
        return "I'm a construction foreman and I'm supervising the construction";
    }

    ///Interface getter and setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    ///to String method
    public String toString() {
        return super.toString() + ", age = " + age;
    }
}
