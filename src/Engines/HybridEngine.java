package Engines;

public class HybridEngine extends Engine implements Fuelable, Electricable {
    private String engineSource;

    public HybridEngine(int engineWeight, int engineHorsepower, String engineBrand, String engineSource) {
        super(engineWeight, engineHorsepower, engineBrand);
        this.engineSource = engineSource;
    }

    @Override
    public boolean hasFuelEmissions() {
        return true;
    }

    public void switchSource() {
        if (engineSource.equalsIgnoreCase("fuel")) {
            this.engineSource = "electric";
        } else if (engineSource.equalsIgnoreCase("electric")) {
            this.engineSource = "fuel";
        }
    }

    public String getEngineSource() {
        return engineSource;
    }

    // Methods for the fuel properties of the hybrid engine
    @Override
    public void start() {
        System.out.println("Engine started using fuel and spark plugs");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped by cutting fuel and ignition system");
    }

    @Override
    public void changeOil() {
        System.out.println("Engine needs oil change");
    }

    @Override
    public void refuel() {
        System.out.println("Engine needs refueling");
    }

    @Override
    public void changeSparkPlugs() {
        System.out.println("Spark plugs need to be changed");
    }

    // Methods for the electric properties of the hybrid engine
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
