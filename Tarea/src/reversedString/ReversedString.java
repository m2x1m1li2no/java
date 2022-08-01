package reversedString;

public class ReversedString {
    public static void main(String[] args) {

        String message = "a b c d e f g ";
        StringBuilder space = new StringBuilder();
        System.out.println("The original String: " + message + "\n");
        reservedStringMethod("a b c d e f g", space);
    }
    
    public static void reservedStringMethod(String message, StringBuilder space) {
        char character;
        for (int i = 0; i < message.length(); i++) {
            character= message.charAt(i);
            space.insert(0, character);
        }
        System.out.println("The reversed String: " + space);
    }
}

