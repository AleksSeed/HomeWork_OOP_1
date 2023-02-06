package transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand; // Марка
    private final String model; // Модель
    private double engineVolume; //Объем двигателя
    private T driver;
    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private final List<Mechanic> mechanic = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    public abstract void printType();

    public abstract void startMoving();

    public abstract void stopMoving();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume;
    }

    public List<Mechanic> getMechanic () { return mechanic; }

    public void addMechanic (Mechanic mechanic){ mechanic.add(mechanic); }

    public abstract void diagnosedPass() throws TransportTypeExeption;

    public abstract String repair();

    public abstract void service();

}

