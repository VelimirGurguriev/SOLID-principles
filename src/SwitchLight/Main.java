package SwitchLight;

public class Main {
    public static void main(String[] args) {
        Switchable bulb = new Bulb();
        SwitchDevice bulbSwitch = new SwitchDevice(bulb);
        bulbSwitch.operate();
        bulbSwitch.operate();

        Switchable tv = new TV();
        SwitchDevice tvSwitch = new SwitchDevice(tv);
        tvSwitch.operate();
        tvSwitch.operate();
    }
}
