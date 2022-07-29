package poo.PooHeredity;

import poo.PooClasses.Appearance;
import poo.PooClasses.SmartDevice;

public class SmartPhone extends SmartDevice {
    int buttons;
    double proportions;

    public SmartPhone(String maker,
                      String model,
                      int price,
                      boolean waterResist,
                      double weight,
                      int bright,
                      Appearance appearance,
                      int buttons,
                      double proportions) {
        super(maker, model, price, waterResist, weight, bright, appearance);
        this.buttons = buttons;
        this.proportions = proportions;
    }
}
