package exercises789.arrayList_Int;

import java.util.ArrayList;

public class MainArrayList_int {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList2 = new ArrayList<>(10);

        for (int i = 1; i <= 10; i++) {
            if (arrayList2.size() < 10) {
                arrayList2.add(i);
            }
        }
        System.out.println("Adding numbers from 1 to 10: " + arrayList2);

        for (int i = 0; i <= arrayList2.size(); i++) {
            if (arrayList2.get(i) % 2 == 0) {
                arrayList2.remove(arrayList2.get(i));
            }
        }

        System.out.println("\nPrinting the Array without pair numbers:" + arrayList2);
    }
}