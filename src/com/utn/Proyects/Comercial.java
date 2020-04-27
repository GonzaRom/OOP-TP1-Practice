package com.utn.Proyects;

public class Comercial extends ConstructionSite {
    private String typeOfBusiness;
    protected String name;

    public Comercial(String typeOfBusiness,String address, double sizeOnMt2, int estimateProjectTime, double costPerMt2, String name) {
        super(address, sizeOnMt2, estimateProjectTime, costPerMt2);
        this.typeOfBusiness = typeOfBusiness;
        this.name = name;
    }

    ///Constructors overload
    public Comercial(String name,String address, double sizeOnMt2, int estimateProjectTime, double costPerMt2) {
        super(address, sizeOnMt2, estimateProjectTime, costPerMt2);
        this.name = name;
    }

    ///Setters and Getters
    public String getTypeOfBusiness() {
        return typeOfBusiness;
    }

    public void setTypeOfBusiness(String typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ///to String method
    public String toString() {
        return super.toString()+", Name Site ="+name+
                ", Type of Business ="+typeOfBusiness;
    }

}
