package transport;

public class Bus extends Transport<DriverC> {
    private Capasity capasity;

    public Bus(String brand, String model, double engineVolume, DriverC driver, Capasity capasity) {
        super(brand, model, engineVolume, driver);
        this.capasity = capasity;
    }

    public enum Capasity {
        EXTRA_SMALL(0, 10),
        SMALL(10, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);

        public int getCapasityFrom() { return capasityFrom; }
        public void setCapasityFrom(int capasityFrom) {
            this.capasityFrom = capasityFrom;
        }
        public int getCapasityTo() {
            return capasityTo;
        }
        public void setCapasityTo(int capasityTo) {
            this.capasityTo = capasityTo;
        }
        private int capasityFrom;
        private int capasityTo;

        Capasity(int capasityFrom, int capasityTo) {
            setCapasityFrom(capasityFrom);
            setCapasity(capasityTo);
        }

        private void setCapasity(int capasityTo) {
            this.capasityTo = capasityTo;
        }

        @Override
        public String toString() {
            String from = (getCapacityFrom() <= 0) ? "" : "от " + getCapacityFrom() + " мест";
            String to = (getCapacityTo() <= 0) ? "" : (" до " + getCapacityTo() + " мест");
            return "Вместимость : " + from + to;
        }

        private int getCapacityFrom() {
            return capasityFrom;
        }
        private int getCapacityTo() {
            return capasityTo;
        }
    }

    @Override
    public void printType() {
        if (capasity == null) {
            System.out.println("Данных по ТС недостаточно");
        } else {
            System.out.println(capasity);
        }
    }

    @Override
        public void pitStop() {
            System.out.println("Автобус " + getBrand() + " остановился");
        }

        @Override
        public void bestTimeCircle() {
            int minTimeLap = 5;
            int maxTimeLap = 9;
            int bestTimeLap = (int) (minTimeLap + (maxTimeLap - minTimeLap)* Math.random());
            System.out.println("Лучшее время круга автобуса " + getBrand() + " :" + bestTimeLap);
        }

        @Override
        public void maximumSpeed() {
            int minSpeed = 60;
            int maxSpeed = 140;
            int bestSpeed = (int) (minSpeed + (maxSpeed - minSpeed)* Math.random());
            System.out.println("Максимальная скорость автобуса " + getBrand() + " :" + bestSpeed);
        }

        @Override
        public void startMoving() {
            System.out.println("Автобус " + getBrand() + " начал движение");
        }

        @Override
        public void stopMoving() {
            System.out.println("Автобус " + getBrand() + " закончил движение");
        }

        @Override
        public String toString() {
            return super.toString() + " " + capasity.toString();
        }

    @Override
    public void diagnosedPass() throws TransportTypeExeption {
        System.out.println("Автобусы не проходят TO!");
    }

    @Override
    public String repair() { return null; }

    @Override
    public void service() {}
}