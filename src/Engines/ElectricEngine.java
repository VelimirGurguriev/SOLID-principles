package Engines;

public class ElectricEngine extends Engine implements Electricable {

    public ElectricEngine(int engineWeight, int engineHorsepower, String engineBrand) {
        super(engineWeight, engineHorsepower, engineBrand);
    }

    @Override
    public boolean hasFuelEmissions() {
        return false;
    }

    @Override
    public void turnOn() {
        System.out.println("Engine turned on with electrical power");
    }

    @Override
    public void turnOff() {
        System.out.println("Engine turned off by stopping electrical power supply");
    }

    @Override
    public void recharge() {
        System.out.println("Engine battery needs to recharge with electricity");
    }
}
