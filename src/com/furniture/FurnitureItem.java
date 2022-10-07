package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String colour;
    private String furnitureUsage;
    private double price;
    static final int discount =5;

    public FurnitureItem(){
    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {

        this.furnitureCode = furnitureCode;
    }

    public void setFurnitureType(String furnitureType) {

        this.furnitureType = furnitureType;
    }

    public String getFurnitureType() {

        return furnitureType;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getGradeOfFurniture() {

        return gradeOfFurniture;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }

    public String getColour() {

        return colour;
    }

    public void setFurnitureUsage(String furnitureUsage) {

        this.furnitureUsage = furnitureUsage;
    }

    public String getFurnitureUsage() {

        return furnitureUsage;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public double getPrice() {

        return price;
    }

    public float  calculateDiscount() {

        if(gradeOfFurniture.equalsIgnoreCase("grade1") && furnitureUsage.equalsIgnoreCase("outdoor"))
            price = price-(price * discount/100);


        return (float)price;
    }
}
