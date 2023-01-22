package transport;


public class Car extends Transport<DriverB>{
/*
    private final String body;

    public Car(String brand, Integer productionYear, String model, String color,
               String productionCountry, String body, int maxSpeed){
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.body = body;
    }

    public String getBody() { return body; }
*/

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
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
        return super.toString() + " - легковой автомобиль";
    }
}