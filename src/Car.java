public class Car {
    String brand;            //марка
    Integer productionYear;  //год производства
    String model;            //модель
    double engineVolume;     //объем двигателя в литрах
    String color;            //цвет кузова
    String productionCountry;//страна сборки

    public void Car(){
    }

    //конструктор
    public Car(String brand, Integer productionYear, String model, Double engineVolume, String color, String productionCountry){
        this.brand = brand;
        this.productionYear = productionYear;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionCountry = productionCountry;

        if (this.model == "" || this.model == null) { this.model = "-default-"; }
        if (this.brand == "" || this.brand == null) { this.brand = "-default-"; }
        if (this.productionCountry == "" || this.productionCountry == null) { this.productionCountry = "-default-"; }
        if (this.engineVolume <= 0) { this.engineVolume = 1.5d; }
        if (this.color == "" || this.color == null) { this.color = "белый"; }
        if (this.productionYear <=0) { this.productionYear = 2000; }
    }

    public Car() {
     }

    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public Integer getProductionYear() { return productionYear; }

    public void setProductionYear(Integer year) { this.productionYear = year; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public double getEngineVolume() { return engineVolume; }

    public void setEngineVolume(Double engineVolume) { this.engineVolume = engineVolume; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getProductionCountry() { return productionCountry; }

    public void setProductionCountry(String country) { this.productionCountry = country; }

    @Override
    public String toString() {
        return "Автомобиль марки = " + brand + " " + model + ", " + productionYear + " года выпуска. " +
                " Объем двигателя = " + engineVolume + "л., цвет кузова = " + color + ", страна производства = " + productionCountry + ".";
    }
}
