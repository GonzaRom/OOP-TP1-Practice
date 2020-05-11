package com.utn.Proyects;

public class Hotel extends Comercial {
    private int numberOfFloors;

    public Hotel(String name, String address, double sizeOnMt2, int estimateProjectTime, double costPerMt2, int numberOfFloors) {
        super(name, address, sizeOnMt2, estimateProjectTime, costPerMt2);
        this.numberOfFloors = numberOfFloors;
    }

    ///to String method
    public String toString() {
        return "\nType = " + getClass().getSimpleName() +
                ", Address =" + address +
                ", Name Site =" + super.name +
                ", Estimate Project Cost =$" + estimateProjectCost +
                ", Number of floors =" + numberOfFloors;
    }
}
