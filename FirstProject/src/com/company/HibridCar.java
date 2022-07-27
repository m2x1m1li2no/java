package com.company;

public class HibridCar extends Car{
    String category;
    public HibridCar(String category ){
        super("blue", "racing car", "Ford", 1500.78, 4.5);
        this.category = category;
    }


    @Override
    public String toString() {
        return "HibridCar{" +
                "category='" + category + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
