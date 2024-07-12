package Engines;

public class Main {
    public static void main(String[] args) {
        // testing fuel engine implementation
        FuelEngine fuelEngine = new FuelEngine(500, 150, "VW");
        fuelEngine.start();
        fuelEngine.stop();
        fuelEngine.refuel();
        fuelEngine.changeOil();
        fuelEngine.hasFuelEmissions();
        fuelEngine.changeSparkPlugs();
        System.out.println("----------------------------");
    }
}
