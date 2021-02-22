package lesson5;

import java.util.ArrayList;
import java.util.List;

public class LampChain {

    private List<Lamp> chain;

    public LampChain() {
        chain = new ArrayList<>();
    }

    public void on() {
        for (Lamp lamp : chain) {
            lamp.on();
        }
    }

    public void off() {
        for (Lamp lamp : chain) {
            lamp.off();
        }
    }

    public void on(int index) {
        chain.get(index).on();
    }

    public void off(int index) {
        chain.get(index).off();
    }

    public void addLamp() {
        chain.add(new Lamp());
    }

    public boolean check() {
        boolean flag = true;
        for (Lamp lamp : chain) {
            flag &= lamp.isOn();
        }
        return flag;
    }
}
