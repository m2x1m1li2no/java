package PracticeJava;

public class While {

    public static void main(String[] args) {
        int count = 1;
        while(count <= 10){
            System.out.println("I'm the while: " + count);
            count++;
        }

        int i = 1;
        while (i < 5){
            System.out.println( i + " Es menor o igual a 5 !");
            i++;
            if (i == 3)
                System.out.println("Continua el while");
        }

        int j = 1;
        while (j < 5){
            System.out.println( j + " Es menor a 5 !");

            if (j == 4) {
                break;
            } else if (j ==3) {
                System.out.println("J es igual a 3 !");
            }
            j++;
        }
    }
}
