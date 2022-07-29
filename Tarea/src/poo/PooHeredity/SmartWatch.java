package poo.PooHeredity;

import poo.PooClasses.Appearance;
import poo.PooClasses.SmartDevice;

public class SmartWatch extends SmartDevice {
    String monitor;
    boolean calls;
    boolean GPS;

    public SmartWatch(String maker,
                      String model,
                      int price,
                      boolean waterResist,
                      double weight,
                      int bright,
                      Appearance appearance,
                      String monitor,
                      boolean calls,
                      boolean GPS) {
        super(maker, model, price, waterResist, weight, bright, appearance);
        this.monitor = monitor;
        this.calls = calls;
        this.GPS = GPS;
    }
}
