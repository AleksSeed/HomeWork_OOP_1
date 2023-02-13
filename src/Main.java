import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Mechanic> mechanic = new HashSet<>();
        Set<String> drivers = new HashSet<>();


        Mechanic mechanic1 = new Mechanic("Вася Пупкин", "Fix Service");
        mechanic.add(mechanic1);
        Mechanic mechanic2 = new Mechanic("Пертушка Шлангов", "Ремонт и покраска");
        mechanic.add(mechanic2);
        Mechanic mechanic3 = new Mechanic("Мишаня Шуруповерт", "Шурик и ко");
        mechanic.add(mechanic3);

        Map<String, String> mechanicMap = new HashMap<String, String>();

         for (int i = 1; i <= 3; i++) {
            Driver driverB = new DriverB("Водитель категории B №" + i, true, i);
            Car car = new Car("Лада_" + i, "Веста Sport", 1.8, (DriverB) driverB, Car.BodyType.SEDAN);

            Driver driverD = new DriverD("Водитель категории D №" + i, true, i + 5);
            Truck truck = new Truck("КАМАЗ_" + i, "4925", 17.241, (DriverD) driverD, Truck.WeightTruck.N2);

            Driver driverC = new DriverC("Водитель категории C №" + i, true, i + 4);
            Bus bus = new Bus("КАвЗ_" + i, "4235 «Аврора»", 4.43, (DriverC) driverC, Bus.Capasity.LARGE);

            System.out.println();
           // System.out.println(car);
            car.pitStop();
            car.bestTimeCircle();
            car.maximumSpeed();
            car.repair();
            car.service();
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

             mechanicMap.put(car.getBrand(), mechanic1.toString());
             mechanicMap.put(bus.getBrand(), mechanic2.toString());
             mechanicMap.put(truck.getBrand(), mechanic3.toString());
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


 Давай попробуем в сете хранить не просто имена механиков, а самих механиков. И так же проверим на практике,
 как поведет себя сет при добавлении механика, который уже есть в сете.
 */

