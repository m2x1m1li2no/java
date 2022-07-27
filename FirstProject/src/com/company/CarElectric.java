package com.company;

public class CarElectric extends Car{

    String battery;

    public CarElectric(String battery){
        super("white", "Falcon", "Ford", 1234.56, 6.1);
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "CarElectric{" +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", battery='" + battery + '\'' +
                '}';
    }
}
