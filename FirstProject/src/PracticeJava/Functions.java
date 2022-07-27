package PracticeJava;

public class Functions {

    public static void main(String[] args) {
        returnVoid();
        returnName("Maximiliano");
        String hello = returnsHello("Maximiliano");
        System.out.println(hello);
    }

    private static void returnVoid() {
        System.out.println("I am a function that returns: a void");
    }

    private static void returnName(String name) {
        System.out.println("Hola " + name + "!");
    }

    private static String returnsHello (String name) {
        return "Hello! " + name;
    }
}