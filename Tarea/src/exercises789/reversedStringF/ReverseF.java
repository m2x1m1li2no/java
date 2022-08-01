package exercises789.reversedStringF;

public class ReverseF {
    public static void main(String[] args) {

        StringBuilder build = new StringBuilder();
        reverse("Hello world", build);
    }

    public static void reverse(String text, StringBuilder build) {
        char characters;
        for (int i = 0; i < text.length(); i++) {
            characters = text.charAt(i);
            build.insert(0, characters);
        }
        System.out.println("The original String: " + text + "\n");
        System.out.println("The reversed String: " + build);
    }
}
