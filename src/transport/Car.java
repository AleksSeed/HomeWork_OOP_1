package transport;

public class Car {
    final String brand;            //марка
    final Integer productionYear;  //год производства
    final String model;            //модель
    final Key key;                 //Ключ
    public double engineVolume;    //объем двигателя в литрах
    public String color;           //цвет кузова
    final String productionCountry;//страна сборки

    public String kpp;             //коробка передач
    final String body;             //кузов
    public String number;          //регистрационный номер
    final int capasity;            //Количество мест
    public boolean rubber;         //«Летняя» или «Зимняя резина»

    public void Car(){
    }

    //конструктор
    public Car(String brand, Integer productionYear, String model, Double engineVolume, String color,
               String productionCountry,String kpp, String body,
               String number, Integer capasity, Boolean rubber, Key key){
        this.brand = brand;
        this.productionYear = productionYear;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionCountry = productionCountry;

        this.kpp = kpp;
        this.body = body;
        this.number = number;
        this.capasity = capasity;
        this.rubber = rubber;
        this.key = key;
    }

    public String getBrand() { return brand; }
    public Integer getProductionYear() { return productionYear; }
    public String getModel() { return model; }
    public String getProductionCountry() { return productionCountry; }
    public String getBody() { return body; }
    public int getCapasity() { return capasity; }

    public double getEngineVolume() { return engineVolume; }
    public void setEngineVolume(Double engineVolume) { this.engineVolume = engineVolume; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getKpp() { return kpp; }
    public void setKpp(String kpp) { this.kpp = kpp; }
    public boolean getRubber() { return rubber; }
    public void setRubber(boolean rubber) { this.rubber = rubber; }


    public void replaceTires(int month){
        if (month < 4 || month > 10) {
            setRubber(true);
           System.out.println(brand + " " + model + " Резина заменена на зимнюю.");
        } else {
            setRubber(false);
            System.out.println(brand + " " +  model + " Резина заменена на летнюю.");
        }
    }

    @Override
    public String toString() {
        return "Автомобиль марки = " + brand + " " + model + ", " + productionYear + " года выпуска. " +
                " Объем двигателя = " + engineVolume + "л., цвет кузова = " + color + ", страна производства = " + productionCountry +
                ".\n     Коробка передач = " + kpp + ", кузов   = " + body + ", номер = " + number + ", количество мест = " + capasity +
                ", зимняя резина = " + rubber + key;
    }

    public void check(){
        if (kpp == "" || kpp == null){
            System.out.println("Данные по КПП для " + brand + " " + model + " не верны или неполные.");
        }else if (body == "" || body == null){
            System.out.println("Данные по кузову для " + brand + " " + model + " не верны или неполные.");
        }else if (number == "" || number == null) {
            System.out.println("Данные по рег. номеру для " + brand + " " + model + " не верны или неполные.");
        }else if (capasity < 1) {
            System.out.println("Данные по вместимости для " + brand + " " + model + " не верны или неполные.");
        }
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteEngineStart, boolean withoutKeyAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteStartEngine() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return withoutKeyAccess;
        }

        @Override
        public String toString() {
            return ", удаленный запуск двигателя: " + remoteEngineStart + ", бесключевой доступ: " + withoutKeyAccess;
        }
    }
}
