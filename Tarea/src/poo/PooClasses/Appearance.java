package poo.PooClasses;

public class Appearance {
    String color;
    String size;
    String screen;

    public Appearance(String color, String size, String screen) {
        this.color = color;
        this.size = size;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Appearance{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
