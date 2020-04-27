<<<<<<< HEAD:src/com/utn/Persons/Worker.java
package com.utn.Persons;

public class Worker extends ConstructForeman implements Work {

    public Worker(String name, String dni, int phone, int age) {
        super(name, dni, phone, age);
        super.costPerDay = employeeCost();
    }

    public double employeeCost() { return 1500.00; }

    ///Message from the Worker when is working
    public String work() {
        return "I'm a worker and I build";
    }

    ///to String method
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
=======
package com.utn.Employees;

public class Worker extends ConstructForeman implements Work {

    public Worker(String name, String dni, int phone, int age) {
        super(name, dni, phone, age);
        super.costPerDay = employeeCost();
    }

    ///Set Employee Cost
    public double employeeCost() { return 1500.00; }

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
>>>>>>> UTN Real State Developments S.A.:src/com/utn/Employees/Worker.java
