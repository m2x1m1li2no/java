package exercises789.arrayUniBidi;

public class MainArray {
    public static void main(String[] args) {
        String [] arrString = {
                "H",
                "e",
                "l",
                "l",
                "o"
        };

        for ( String letter : arrString) {
            System.out.println("letter: " + letter);
        }


//        int [][] arrInt = new int [2][4];
        int [][] arrInt = {
                {1, 2, 3, 4},
                {100, 200, 300, 400}
        };

        for (int i = 0; i < arrInt.length; i++){
            System.out.println("+---------+---------+---------+");

            for (int j = 0; j < arrInt[1].length; j++){
                System.out.println("value of i: " + i + " ->" + " value of j: " + j);
//                System.out.println(arrInt[i][j]);
            }
        }

    }
}
