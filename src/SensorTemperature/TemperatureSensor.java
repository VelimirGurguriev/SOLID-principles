package SensorTemperature;

public class TemperatureSensor implements Sensorable {
    @Override
    public double getTemperature() {
        return 25;
    }
}
