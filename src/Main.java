import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Mechanic mechanic1 = new Mechanic("Вася Пупкин", "Fix Service");
        Mechanic mechanic2 = new Mechanic("Пертушка Шлангов", "Ремонт и покраска");
        Mechanic mechanic3 = new Mechanic("Мишаня Шуруповерт", "Шурик и ко");

        Map<String, String> mechanicMap = new HashMap<String, String>();

        Set<String> drivers = new HashSet<>();

         for (int i = 1; i <= 3; i++) {
            DriverB driverB = new DriverB("Водитель категории B №" + i, true, i);
            Car car = new Car("Лада_" + i, "Веста Sport", 1.8, driverB, Car.BodyType.SEDAN);

            DriverD driverD = new DriverD("Водитель категории D №" + i, true, i + 5);
            Truck truck = new Truck("КАМАЗ_" + i, "4925", 17.241, driverD, Truck.WeightTruck.N2);

            DriverC driverC = new DriverC("Водитель категории C №" + i, true, i + 4);
            Bus bus = new Bus("КАвЗ_" + i, "4235 «Аврора»", 4.43, driverC, Bus.Capasity.LARGE);

            System.out.println();
           // System.out.println(car);
            car.pitStop();
            car.bestTimeCircle();
            car.maximumSpeed();
            car.repair();
            car.service();
            car.addMechanic(mechanic1);
            drivers.add(driverB.getFullName());
             try {
                 car.diagnosedPass();
             } catch (TransportTypeExeption e) {
                 System.out.println(e.getMessage());
             }

            System.out.println();
            System.out.println(bus);
            bus.pitStop();
            bus.bestTimeCircle();
            bus.maximumSpeed();
            bus.addMechanic(mechanic2);
            drivers.add(driverC.getFullName());
             try {
                 bus.diagnosedPass();
             } catch (TransportTypeExeption e) {
                 System.out.println(e.getMessage());
             }

            System.out.println();
            System.out.println(truck);
            truck.pitStop();
            truck.bestTimeCircle();
            truck.maximumSpeed();
            truck.repair();
            truck.service();
            truck.addMechanic(mechanic3);
            drivers.add(driverD.getFullName());
             try {
                 truck.diagnosedPass();
             } catch (TransportTypeExeption e) {
                 System.out.println(e.getMessage());
             }

            System.out.println("\n*** Заезды ***");
            printInfoCompeting(car);
            printInfoCompeting(bus);
            printInfoCompeting(truck);

            ServiceStation serviceStation = new ServiceStation();
            serviceStation.addCar(car);
            serviceStation.addTruck(truck);
           // serviceStation.maintenance();    //удаление транспорта из очереди

             mechanicMap.put(car.getBrand(), mechanic1.getFio());
             mechanicMap.put(bus.getBrand(), mechanic2.getFio());
             mechanicMap.put(truck.getBrand(), mechanic3.getFio());

             };

        System.out.println("\nСписок механиков: ");
        mechanicMap.forEach((t, m) -> {
            System.out.println(t + ";  " + m);
         });

        System.out.println("\nСписок водителей: ");

        Iterator<String> driver = drivers.iterator();
        while (driver.hasNext()){
            System.out.println(driver.next());
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
/**Создайте множество (в реализации HashSet ), состоящее из водителей, таким образом, чтобы, в случае добавления одного и того же водителя в базу данных два раза,
 * в консоль информация выводилась без повторов.
 *
 Затем выведите всех водителей в консоль с помощью итератора.

 Критерии оценки
 Использована реализация HashSet для создания множества.
 В консоль выводится информация о водителях без повтора.
 Создан итератор.
 Все водители выведены в консоль с помощью итератора.
 */
