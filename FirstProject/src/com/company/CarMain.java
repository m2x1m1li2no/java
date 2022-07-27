package com.company;

import java.lang.reflect.Array;

public class CarMain {
    public static void main(String[] args) {

        Car myCar = new CarElectric ("not found");

        Car mySecondCar = new HibridCar("not found");

        myCar.velocidad = 100;

        mySecondCar.velocidad = 80;

        CarElectric carElectric = new CarElectric("charging");

        HibridCar cocheHibrido = new HibridCar("super car");

        System.out.println(myCar);
        System.out.println(mySecondCar);
        System.out.println(carElectric);
        System.out.println(cocheHibrido);



    }


}
