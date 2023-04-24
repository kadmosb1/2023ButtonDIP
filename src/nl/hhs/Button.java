package nl.hhs;

import java.util.Scanner;

public class Button {

    private String state = "off";
    private ISwitchable device = DeviceFactory.getDevice ();

    private void switchOnOff () {

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Geef enter of e(xit).");
        String invoer = scanner.nextLine ();

        while (!invoer.equals ("e")) {

            if (state.equals("off")) {
                device.activate();
                state = "on";
            } else {
                device.deactivate();
                state = "off";
            }

            invoer = scanner.nextLine ();
        }
    }

    public static void main(String[] args) {
        new Button ().switchOnOff();
    }
}
