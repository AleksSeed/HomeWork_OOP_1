package transport;

public class Transport {
    private String brand;            //марка
    private String model;            //модель
    private Integer productionYear;  //год производства
    private String productionCountry;//страна сборки
    public String color;            //цвет кузова
    public int maxSpeed;     //Максимальная скорость передвижения

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public Integer getProductionYear() { return productionYear; }
    public String getProductionCountry() { return productionCountry; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }


    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed){
        if (brand == null || brand == ""){
            System.out.println("Данные по марке не указаны!");
        }else{
            this.brand = brand;
        }
        if (model == null || model == ""){
            System.out.println("Данные по модели не указаны!");
        }else {
            this.model = model;
        }
        if(productionYear > 0) {
            this.productionYear = productionYear;
        } else {
            System.out.println("Год изготовления для " + brand + " " + model + " указан не верно!");
        }
        if (productionCountry == null || productionCountry == ""){
            System.out.println("Данные по стране изготовителю для " + brand + " " + model + " указаны не верно!");
        }else {
            this.productionCountry = productionCountry;
        }
        this.setMaxSpeed(maxSpeed);    //косяк тут
        this.setColor(color);
    }

    @Override
    public String toString() {
        return "Автомобиль марки = " + brand + " " + model +  ", " + productionYear + " года выпуска. " + "Cтрана сборки = " + productionCountry +
                ", цвет = " + color + ", максимальная скорость = " + maxSpeed;
    }
}
