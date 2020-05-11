package com.utn.Employees;

public class Worker extends ConstructForeman implements Work {

    public Worker(String name, String dni, int phone, int age) {
        super(name, dni, phone, age);
        super.costPerDay = employeeCost();
    }

    ///Set Employee Cost
    public double employeeCost() {
        return 1500.00;
    }

    ///Message from the Worker when is working
    public String work() {
        return "I'm a worker and I build";
    }

    ///Setter and Getter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
