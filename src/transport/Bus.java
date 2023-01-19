package transport;

public class Bus extends Transport{

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
}