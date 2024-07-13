package SensorTemperature;

public class Main {
    public static void main(String[] args) {
        Sensorable temperatureSensor = new TemperatureSensor();
        WeatherReport temperatureReport = new WeatherReport(temperatureSensor);
        System.out.println(temperatureReport.report());
    }
}
