package transport;

public abstract class Transport<T extends Driver> implements Competing {
    /*
    private String brand;            //марка
    private String model;            //модель
    private Integer productionYear;  //год производства
    private String productionCountry;//страна сборки
    private final String body;
    private int capacity;
    private Boolean conditioner;

    public Bus(String brand, String model, Integer productionYear, String color,
               String productionCountry, String body, int capacity, boolean conditioner,int maxSpeed){
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;

        this.body = body;
        this.capacity = capacity;
        this.conditioner = conditioner;
    }


    public String getBody() { return body; }

    public int getCapacity() { return capacity; }

    public Boolean getConditioner() { return conditioner; }

    @Override
    public String getBrand() { return brand; }

    @Override
    public String getModel() { return model; }

    @Override
    public Integer getProductionYear() { return productionYear; }

    @Override
    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public String toString() {
        return "Автомобиль марки = " + brand + " " + model +  ", " + productionYear + " года выпуска. " + "Cтрана сборки = " + productionCountry +
                ", цвет = " + color + ", максимальная скорость = " + maxSpeed + ", кузов = " + body + ", вместимость салона = " + capacity + ", кондиционер в салоне = " + conditioner;
    }
}*/

    private final String brand; // Марка
    private final String model; // Модель
    private double engineVolume; //Объем двигателя
    private T driver;
    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;

    public Transport(String brand, String model, double engineVolume, T driver) {
        if(brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if(model == null || model.isBlank() || model.isEmpty()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

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
        if(engineVolume <= 0) {
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
}

