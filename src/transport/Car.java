package transport;


public class Car extends Transport<DriverB>{
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        WAGON("Универсал"),
        OFF_ROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String BodyType;

        BodyType(String bodyType){
            setBodyType(bodyType);
        }

        private String getBodyType(String bodyType) {
            return this.BodyType;
        }

        private void setBodyType(String bodyType) {
            this.BodyType = BodyType;
        }
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по ТС недостаточно");
        } else {
            System.out.println("Легковой автомобиль : " + getBrand() + ", марка : " + getModel() + ", " + bodyType);
        }
    }


    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " остановился");
    }

    @Override
    public void bestTimeCircle() {
        int minTimeLap = 3;
        int maxTimeLap = 5;
        int bestTimeLap = (int) (minTimeLap + (maxTimeLap - minTimeLap)* Math.random());
        System.out.println("Лучшее время круга автомобиля " + getBrand() + " :" + bestTimeLap);
    }

    @Override
    public void maximumSpeed() {
        int minSpeed = 100;
        int maxSpeed = 240;
        int bestSpeed = (int) (minSpeed + (maxSpeed - minSpeed)* Math.random());
        System.out.println("Максимальная скорость автомобиля " + getBrand() + " :" + bestSpeed);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");
    }

    @Override
    public String toString() {
        return super.toString() + ", " + bodyType.toString();
    }

    @Override
    public boolean DiagnosedPass() throws TransportTypeExeption { return false; }
}