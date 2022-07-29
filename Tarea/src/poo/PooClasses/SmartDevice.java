package poo.PooClasses;

public class SmartDevice {

    //Attributes
    String maker;
    String model;
    int price;
    boolean waterResist;
    double weight;
    int bright;
    Appearance appearance;

    //Constructors

    public SmartDevice(){}

    public SmartDevice(String maker, String model, int price, boolean waterResist, double weight, int bright, Appearance appearance ){
        this.maker = maker;
        this.model = model;
        this.price = price;
        this.waterResist = waterResist;
        this.weight = weight;
        this.bright = 0;
        this.appearance = appearance;
    }

    //Methods
    public void bright (int quantity){
        bright += quantity;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", waterResist=" + waterResist +
                ", weight=" + weight +
                ", bright=" + bright +
                ", appearance=" + appearance +
                '}';
    }
}