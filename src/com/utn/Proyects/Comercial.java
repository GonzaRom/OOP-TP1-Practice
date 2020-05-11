package com.utn.Proyects;

public class Comercial extends ConstructionSite {
    private String typeOfBusiness;
    protected String name;

    public Comercial(String typeOfBusiness,String address, double sizeOnMt2, int estimateProjectTime, double costPerMt2, String name) {
        super(address, sizeOnMt2, estimateProjectTime, costPerMt2);
        this.typeOfBusiness = typeOfBusiness;
        this.name = name;
    }

    ///Constructor overload for Hotel class
    public Comercial(String name,String address, double sizeOnMt2, int estimateProjectTime, double costPerMt2) {
        super(address, sizeOnMt2, estimateProjectTime, costPerMt2);
        this.name = name;
    }

    ///to String method
    public String toString() {
        return super.toString()+", Name Site ="+name+
                ", Type of Business ="+typeOfBusiness;
    }

}
