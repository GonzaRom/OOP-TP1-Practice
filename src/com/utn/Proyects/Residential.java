package com.utn.Proyects;

public class Residential extends ConstructionSite {
    private int numberOfRooms;


    public Residential(String address, double sizeOnMt2, int estimateProjectTime, double costPerMt2, int numberOfRooms) {
        super(address, sizeOnMt2, estimateProjectTime, costPerMt2);
        this.numberOfRooms = numberOfRooms;
    }

    ///to String Method
    public String toString() {
        return super.toString() + ", Number of floors =" + numberOfRooms;
    }

}
