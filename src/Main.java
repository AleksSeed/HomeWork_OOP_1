import transport.*;

public class Main {
    public static void main(String[] args) {
/*        System.out.println("Задание 1");
        Car car1 = new Car("Lada", 2014, "Granta", "желтый", "Россия", "седан", 180);
        Car car2 = new Car("Audi", 2020, "A8 50 L TDI quattro", "черный", "Германия", "седан", 240);
        Car car3 = new Car("BMW", 2021, "Z8", "черный", "Германия", "родстер", 200);
        Car car4 = new Car("Kia", 2018, "Sportage 4-го поколения", "красный", "Южная Корея", "внедорожник", 180);
        Car car5 = new Car("Hyundai", 2016, "Avante", "оранжевый", "Южная Корея", "седан", 180);

        System.out.println(car1 + "\n" + car2 + "\n" + car3 + "\n" + car4 + "\n" + car5 + "\n");

        System.out.println("Задание 2");
        Bus paz = new Bus("ПАЗ", "4230 «Аврора»", 2007, "белый","Россия" , "bus", 60, false, 110);
        Bus liaz = new Bus("ЛИАЗ", "529265", 2015, "синий", "Россия", "bus", 80, true, 140);
        Bus kavz = new Bus("КАвЗ", "4270", 2002, "красный", "Россия",  "bus", 60, false, 90);

        System.out.println(paz + "\n" + liaz + "\n" + kavz);*/

        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Водитель категории B №" + i, false, i);
            Car car = new Car("Лада_" + i, "Веста Sport ", 1.8, driverB);

            DriverC driverC = new DriverC("Водитель категории C №" + i, true, i + 4);
            Bus bus = new Bus("КАвЗ_" + i, "4235 «Аврора»", 4.43, driverC);

            DriverD driverD = new DriverD("Водитель категории D №" + i, true, i + 5);
            Truck truck = new Truck("КАМАЗ_" + i, "4925", 17.241, driverD);

            System.out.println();
            System.out.println(car);
            car.pitStop();
            car.bestTimeCircle();
            car.maximumSpeed();

            System.out.println();
            System.out.println(bus);
            bus.pitStop();
            bus.bestTimeCircle();
            bus.maximumSpeed();

            System.out.println();
            System.out.println(truck);
            truck.pitStop();
            truck.bestTimeCircle();
            truck.maximumSpeed();

            System.out.println("\n*** Заезды ***");
            printInfoCompeting(car);
            printInfoCompeting(bus);
            printInfoCompeting(truck);
        }
    }

    private static void printInfoCompeting(Transport<?> transport){
        if (transport.getDriver().isDriversLicense()) {
            System.out.println("водитель " + transport.getDriver().getFullName() +
                    " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
        } else {
            System.out.println("водитель " + transport.getDriver().getFullName() +
                    " не может управлять автомобилем " + transport.getBrand() + " и не будет участвовать в заезде");
        }
    }


}