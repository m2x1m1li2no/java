package poo.PooMainClass;

import poo.PooClasses.Appearance;
import poo.PooClasses.SmartDevice;
import poo.PooHeredity.SmartPhone;
import poo.PooHeredity.SmartWatch;

public class pooMainClass {
    public static void main(String[] args) {

        Appearance samsungPhone = new Appearance("Deep Ocean", "Big", "Amoled");
        Appearance appleWatch = new Appearance("dark blue", "small", "amoled");
        Appearance superNokiaPlus = new Appearance("deep green","6.9 inch","super amoled");
        Appearance appleWatchSE = new Appearance("pink", "1.2 inch", "crystal");

        // class + identify = new Class
        SmartDevice smartPhoneSamsung = new SmartDevice(
                "Samsung",
                "Note 9",
                900,
                true,
                155.5,
                0,
                samsungPhone);
                smartPhoneSamsung.bright(550);
        System.out.println(smartPhoneSamsung);

        SmartDevice smartWatchApple = new SmartDevice(
                "Apple",
                "Apple Watch",
                1200,
                false,
                55.0,
                0,
                appleWatch);
                smartWatchApple.bright(300);
        System.out.println(smartWatchApple);

        SmartPhone cellPhoneNokia = new SmartPhone(
                "Nokia",
                "Super Nokia Plus",
                560,
                true,
                135.5,
                450,
                superNokiaPlus,
                2,
                6.9);
        System.out.println(cellPhoneNokia);

        SmartWatch smartAppleWatchSE = new SmartWatch(
                "Apple",
                "SE",
                150,
                true,
                45.5,
                350,
                appleWatchSE,
                "Hearth rate",
                true,
                true);
        System.out.println(smartAppleWatchSE);

    }
}