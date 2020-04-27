package com.utn.Proyects;

public class Hotel extends Comercial {
    private int numberOfFloors;

    public Hotel(String name, String address, double sizeOnMt2, int estimateProjectTime, double costPerMt2, int numberOfFloors) {
        super(name, address, sizeOnMt2, estimateProjectTime, costPerMt2);
        this.numberOfFloors = numberOfFloors;
    }

    ///Setter and Getter
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    ///to String method
    public String toString() {
        return "\nConstruction Site:" +
                ", Type = " + getClass().getSimpleName() +
                ", Address =" + address +
                ", Estimate Project Cost =$" + estimateProjectCost +
                ", Size =" + sizeOnMt2 + "mt2" +
                ", Estimate Project Time = " + estimateProjectTime + "days" +
                ", Cost per mt2 =$" + costPerMt2 +
                ", Name Site =" + super.name +
                ", Number of floors =" + numberOfFloors;
    }
}
