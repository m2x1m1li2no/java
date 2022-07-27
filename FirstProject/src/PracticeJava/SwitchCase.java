package PracticeJava;

public class SwitchCase {
    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather){
            case "sunny":
                System.out.println("The weather is sunny !");
                break;
            case "warm":
                System.out.println("the weather is warm !");
                break;
            default:
                System.out.println("Value not fund");
        }

    }

}
