package SwitchLight;

public class Bulb implements Switchable {
    private boolean isOn;

    public Bulb() {
        this.isOn = false;
    }

    public boolean getState() {
        return isOn;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }
}
