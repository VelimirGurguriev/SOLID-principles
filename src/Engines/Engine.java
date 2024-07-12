package Engines;

public abstract class Engine {
    private int engineWeight;
    private int engineHorsepower;
    private String engineBrand;

    public Engine(int engineWeight, int engineHorsepower, String engineBrand) {
        this.engineWeight = engineWeight;
        this.engineHorsepower = engineHorsepower;
        this.engineBrand = engineBrand;
    }

    public abstract boolean hasFuelEmissions();

    public int getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(int engineWeight) {
        this.engineWeight = engineWeight;
    }

    public int getEngineHorsepower() {
        return engineHorsepower;
    }

    public void setEngineHorsepower(int engineHorsepower) {
        this.engineHorsepower = engineHorsepower;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }
}
