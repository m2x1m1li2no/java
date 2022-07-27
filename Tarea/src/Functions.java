package com.example;

public class Functions {

    public static void main(String[] args) {
        //function: no return
        menu();

        //function: with return
        String menu = getMenu();

        //function: with parameter & return
        String myName = "Carlos";
        String myLastName = "Gardel";
        String hi = sayHi(myName, myLastName);
        System.out.println(hi);

        //function: return a number
        int result = suma(50, 55);
        System.out.println(result);
        // overcharge
        int result2 = suma(5,70,15);
        System.out.println(result2);

        //homework: function plus tax
        double plusTax = getIva(55.5);
        System.out.println("The final price with tax is: " + plusTax);

        }

    static void menu() {
        String food = "eggs & cheese";
        String drinks = "coke or water";
        System.out.println(food);
        System.out.println(drinks);
    }

    static String getMenu(){
        return "The menu";
    }

    static String sayHi(String name, String lastName){
        return "Hi! " + name + " " + lastName + ", how're u ?";
    }

    static int suma(int number1, int number2){
        return number1 + number2;
    }

    static int suma(int number1, int number2, int number3){
        return number1 + number2;
    }

    static double getIva(double price){
        return (price * 0.21) + price;
    }

}
