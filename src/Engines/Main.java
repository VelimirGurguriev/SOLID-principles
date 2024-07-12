package Engines;

public class Main {
    public static void main(String[] args) {
        // testing fuel engine implementation
        FuelEngine fuelEngine = new FuelEngine(500, 150, "VW");
        fuelEngine.start();
        fuelEngine.stop();
        fuelEngine.refuel();
        System.out.println("Engine fuel emissions: " + fuelEngine.hasFuelEmissions());
        fuelEngine.changeOil();
        fuelEngine.changeSparkPlugs();
        System.out.println("----------------------------");

        // testing electric engine implementation
        ElectricEngine electricEngine = new ElectricEngine(250, 150, "Tesla");
        electricEngine.turnOn();
        electricEngine.turnOff();
        electricEngine.recharge();
        System.out.println("Engine fuel emissions: " + electricEngine.hasFuelEmissions());
        System.out.println("----------------------------");

        // testing hybrid engine implementation
        HybridEngine hybridEngine = new HybridEngine(450, 150,
                "BMW", "fuel");
        System.out.println("Engine source: " + hybridEngine.getEngineSource());
        hybridEngine.start();
        hybridEngine.stop();
        hybridEngine.refuel();
        hybridEngine.changeOil();
        hybridEngine.changeSparkPlugs();
        // testing electric properties
        hybridEngine.switchSource();
        System.out.println("Engine source: " + hybridEngine.getEngineSource());
        hybridEngine.turnOn();
        hybridEngine.turnOff();
        hybridEngine.recharge();
        System.out.println("Engine fuel emissions: " + hybridEngine.hasFuelEmissions());
        System.out.println("----------------------------");
    }
}
