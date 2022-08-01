package exercises789.arrayList_String;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainArrayList_string {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");

        System.out.println("arrayList: " + arrayList1);

        LinkedList<String> linkedList1 = new LinkedList<>(arrayList1);
        System.out.println("\nlinkedList: " + linkedList1);

        System.out.println("-----+-----+-----+-----+");

        for (String a : arrayList1){
            System.out.println(a);
        }

        System.out.println("-----+-----+-----+-----+");

        for (String l : linkedList1){
            System.out.println(l);
        }

    }
}
