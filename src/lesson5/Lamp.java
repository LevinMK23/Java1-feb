package lesson5;

public class Lamp {

    private boolean on;

    public Lamp() {
        on = false;
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }
}
