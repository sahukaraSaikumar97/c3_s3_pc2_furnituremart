package com.furniture;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem object =new FurnitureItem();

        object.setFurnitureCode(555);
        object.setFurnitureType("tables");
        object.setColour("red");
        object.setFurnitureUsage("outdoor");
        object.setPrice(100.0);
        object.setGradeOfFurniture("grade1");

        float result = object.calculateDiscount();
        System.out.println("furniture code = " + object.getFurnitureCode());
        System.out.println("furnitureType = " + object.getFurnitureType());
        System.out.println("colour = " + object.getColour());
        System.out.println("Usage = " + object.getFurnitureUsage());
        System.out.println("Grade = " + object.getGradeOfFurniture());
        System.out.println("Final Price = " + result);
    }
}
