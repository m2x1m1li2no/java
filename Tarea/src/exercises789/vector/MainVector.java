package exercises789.vector;
import java.util.Vector;

public class MainVector {
    public static void main(String[] args) {
        Vector <Integer> vector = new Vector(5, 1);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(1);
        vector.remove(2);

        System.out.println(vector);
//        System.out.println("size: " + vector.size() + "\ncapacity: " + vector.capacity());
//        for( int i = 0; i < vector.size(); i++){
//            System.out.println("value: " + vector.get(i) + " -> position: " + i + "\n");
//        }
//
// Utilizo tripToSize() para reducir la capacidad de mi vector en el tamaño que fue utilizado y asi liberar memoria.
//        vector.trimToSize();
    }
}
