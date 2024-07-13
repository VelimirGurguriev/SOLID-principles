package SensorTemperature;

public class WeatherReport {
    private Sensorable sensor;

    public WeatherReport(Sensorable sensor) {
        this.sensor = sensor;
    }

    public String report() {
        return "Current temperature: " + sensor.getTemperature();
    }
}
