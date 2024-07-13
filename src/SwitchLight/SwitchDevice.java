package SwitchLight;

public class SwitchDevice {
    private Switchable device;
    private boolean isOn;

    public SwitchDevice(Switchable device) {
        this.device = device;
        this.isOn = false;
    }

    public void operate() {
        if (isOn) {
            device.turnOff();
        } else {
            device.turnOn();
        }
        isOn = !isOn;
    }
}
