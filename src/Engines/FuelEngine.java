package Engines;

public class FuelEngine extends Engine implements Fuelable {

    public FuelEngine(int engineWeight, int engineHorsepower, String engineBrand) {
        super(engineWeight, engineHorsepower, engineBrand);
    }

    @Override
    public boolean hasFuelEmissions() {
        return true;
    }

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
}
