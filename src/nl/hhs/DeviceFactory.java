package nl.hhs;

import java.util.Scanner;

public class DeviceFactory {
    public static ISwitchable getDevice () {

        Scanner scanner = new Scanner(System.in);
        System.out.print ("Kies een l(amp) of een v(entilator:");
        String device = scanner.nextLine ();

        if (device.equals ("l")) {
            return new Lamp ();
        }
        else {
            return new Ventilator ();
        }
    }
}
