public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Car car01 = new Car();
        car01.setBrand("Lada");
        car01.setModel("Granta");
        car01.setProductionYear(2015);
        car01.setEngineVolume(1.7d);
        car01.setColor("желтый");
        car01.setProductionCountry("Россия");
        System.out.println(car01.toString());

        Car car02 = new Car();
        car02.setBrand("Audi");
        car02.setModel("A8 50 L TDI quattro");
        car02.setProductionYear(2020);
        car02.setEngineVolume(3.0d);
        car02.setColor("черный");
        car02.setProductionCountry("Германия");
        System.out.println(car02.toString());

        Car car03 = new Car();
        car03.setBrand("BMW");
        car03.setModel("Z8");
        car03.setProductionYear(2021);
        car03.setEngineVolume(3.0d);
        car03.setColor("черный");
        car03.setProductionCountry("Германия");
        System.out.println(car03.toString());

        Car car04 = new Car();
        car04.setBrand("Kia");
        car04.setModel("Sportage 4-го поколения");
        car04.setProductionYear(2018);
        car04.setEngineVolume(2.4d);
        car04.setColor("красный");
        car04.setProductionCountry("Южная Корея");
        System.out.println(car04.toString());

        Car car05 = new Car();
        car05.setBrand("Hyundai");
        car05.setModel("Avante");
        car05.setProductionYear(2016);
        car05.setEngineVolume(1.6d);
        car05.setColor("оранжевый");
        car05.setProductionCountry("Южная Корея");
        System.out.println(car05.toString());



        System.out.println("\nЗадание 2");  //конструктор
        Car car1 = new Car("Lada", 2015, "Granta", 1.7d, "желтый", "Россия");
        Car car2 = new Car("Audi", 2020, "A8 50 L TDI quattro", 3.0d, "черный", "Германия");
        Car car3 = new Car("BMW", 2021, "Z8", 3.0d, "черный", "Германия");
        Car car4 = new Car("Kia", 2018, "Sportage 4-го поколения", 2.4d, "красный", "Южная Корея");
        Car car5 = new Car("Hyundai", 2016, "Avante", 1.6d, "оранжевый", "Южная Корея");
        System.out.println(car1 + "\n" + car2 + "\n" + car3 + "\n" + car4 + "\n" + car5);



        System.out.println("\nЗадание 3");
        Car car10 = new Car("", 2015, "Granta", 1.7d, "желтый", "Россия");
        Car car20 = new Car("Audi", 2020, "", 3.0d, "черный", "Германия");
        Car car30 = new Car("BMW", 0, "Z8", -3.0d, "черный", "Германия");
        Car car40 = new Car("Kia", 2018, "Sportage 4-го поколения", 0d, "красный", "");
        Car car50 = new Car("Hyundai", 2016, "Avante", 1.6d, "", "Южная Корея");
        System.out.println(car10 + "\n" + car20 + "\n" + car30 + "\n" + car40 + "\n" + car50);
    }
}