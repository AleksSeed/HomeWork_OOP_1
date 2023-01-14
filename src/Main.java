import transport.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        Car car1 = new Car("Lada", 2015, "Granta", 1.7d, "желтый", "Россия",
                "автоматическая", "седан", "y341op 60rus", 5, false, new Car.Key(false,false));
        Car car2 = new Car("Audi", 2020, "A8 50 L TDI quattro", 3.0d, "черный", "Германия",
                "автоматическая", "седан", "y341op 60rus", 5, true, new Car.Key(true,true));
        Car car3 = new Car("BMW", 2021, "Z8", 3.0d, "черный", "Германия",
                null, "седан", "y341op 60rus", 5, false, new Car.Key(true,true));
        Car car4 = new Car("Kia", 2018, "Sportage 4-го поколения", 2.4d, "красный", "Южная Корея",
                "автоматическая", "седан", null, 5, true, new Car.Key(true,false));
        Car car5 = new Car("Hyundai", 2016, "Avante", 1.6d, "оранжевый", "Южная Корея",
                "автоматическая", "седан", "y341op 60rus", 0, false, new Car.Key(false,false));

        /** Замена резины */
            car1.replaceTires(1);
        //    car2.replaceTires(10);
        //    car3.replaceTires(12);
        //    car4.replaceTires(5);
        //    car5.replaceTires(3);

        System.out.println("\n" + car1 + "\n" + car2 + "\n" + car3 + "\n" + car4 + "\n" + car5);


        /** Проверка данных */
        System.out.println();
        car1.check();
        car2.check();
        car3.check();
        car4.check();
        car5.check();
    }
}