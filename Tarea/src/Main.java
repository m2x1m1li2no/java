package com.example;

public class Main {

    public static void main(String[] args) {
        String theString = "the String";
        int theNumber = 5;
        double theDouble = 5.55;
        long theLong = 1123456789;
        boolean theBoolean = true;

        System.out.println(theBoolean);
        System.out.println(theDouble);
        System.out.println(theNumber);
        System.out.println(theLong);

        //homework: function plus tax
        double plusTax = getIva(55.5);
        System.out.println("The final price with tax is: " + plusTax);
    }
    static double getIva(double price){
        return (price * 0.21) + price;
    }
}
