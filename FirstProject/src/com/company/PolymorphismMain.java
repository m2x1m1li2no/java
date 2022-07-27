package com.company;

public class PolymorphismMain {
    public static void main(String[] args) {

        Car PolymorphismCar = new HibridCar("Hybrid Honda");

        if (PolymorphismCar instanceof CarElectric) {
            System.out.println("instancia de CarElectric");
        } else if (PolymorphismCar instanceof Car){
            System.out.println("instancia de Car");
        } else {
            System.out.println("not found");
        }


    }

}
