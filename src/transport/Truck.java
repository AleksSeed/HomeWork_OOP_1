package transport;

public class Truck extends Transport<DriverD> {
    private WeightTruck weightTruck;

    public Truck(String brand, String model, double engineVolume, DriverD driver, WeightTruck weightTruck) {
        super(brand, model, engineVolume, driver);
        this.weightTruck = weightTruck;
    }

    @Override
    public void printType() {
        if (weightTruck == null) {
            System.out.println("Данных по ТС недостаточно");
        } else {
            System.out.println(weightTruck);
        }
    }

    public enum WeightTruck {
        N1(0d, 3.5d),
        N2(3.5d, 12d),
        N3(12d, null);

        private Double weightFrom;
        private Double weightTo;

        WeightTruck(Double weightFrom, Double weightTo) {
            setWeightFrom(weightFrom);
            setWeightTo(weightTo);
        }

        public Double getWeightFrom() {
            return weightFrom;
        }

        public void setWeightFrom(Double weightFrom) {
            this.weightFrom = weightFrom;
        }

        public Double getWeightTo() {
            return weightTo;
        }

        public void setWeightTo(Double weightTo) {
            this.weightTo = weightTo;
        }


    @Override
    public String toString() {
        String from = (getWeightFrom() == null) ? "" : "от " + getWeightFrom() + " тонн";
        String to = (getWeightTo() == null) ? "" : " до " + getWeightTo() + " тонн";
        return "Грузоподъемность : " + from + to;
    }

}






    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " остановился");
    }

    @Override
    public void bestTimeCircle() {
        int minTimeLap = 4;
        int maxTimeLap = 7;
        int bestTimeLap = (int) (minTimeLap + (maxTimeLap - minTimeLap)* Math.random());
        System.out.println("Лучшее время круга грузового автомобиля " + getBrand() + " :" + bestTimeLap);
    }

    @Override
    public void maximumSpeed() {
        int minSpeed = 80;
        int maxSpeed = 180;
        int bestSpeed = (int) (minSpeed + (maxSpeed - minSpeed)* Math.random());
        System.out.println("Максимальная скорость грузового автомобиля " + getBrand() + " :" + bestSpeed);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " закончил движение");
    }

    @Override
    public String toString() { return super.toString() + " " + weightTruck.toString(); }

}