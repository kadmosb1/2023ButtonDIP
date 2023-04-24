package nl.hhs;

public class Ventilator implements ISwitchable {

    public void activate () {
        System.out.println ("Ventilator gaat aan.");
    }

    public void deactivate () {
        System.out.println ("Ventilator gaat uit.");
    }
}
