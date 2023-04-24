package nl.hhs;

public class Lamp implements ISwitchable {

    public void activate () {
        System.out.println ("Lamp gaat aan");
    }

    public void deactivate () {
        System.out.println ("Lamp gaat uit");
    }
}
