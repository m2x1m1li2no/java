package exercises789.inputOutput;

import java.util.Scanner;

public class PlayingWithJava {
    public static void main(String[] args) {
        playWithJava();
    }

    public static void playWithJava() {

        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess my magic number ! between 0 and 10: ");

        int number1 = scanner.nextInt();
        int magicNumber = 5;

        if (number1 == magicNumber){
            System.out.print("*** You win ! ***\n");
        } else if (number1 > 10 || number1 < 0 ) {
            System.out.print("Bad choice! number incorrect.\n");
            playWithJava();
        } else {
            System.out.println("Better luck next time.");}
        }
        catch (Exception e){
            System.out.println("That's not a valid option, sorry !" + " => " + e.getMessage());
        } finally {
            System.out.println("\nThanks for play with Java !");
        }


    }
}
