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
    }
}
