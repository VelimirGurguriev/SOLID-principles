package Engines;

public interface Fuelable {
    void start();
    boolean hasFuelEmissions();
    void changeOil();
    void refuel();
    void changeSparkPlugs();
}
