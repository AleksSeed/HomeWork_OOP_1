import transport.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Водитель категории B №" + i, false, i);
            Car car = new Car("Лада_" + i, "Веста Sport ", 1.8, driverB, Car.BodyType.SEDAN);

            DriverD driverD = new DriverD("Водитель категории D №" + i, true, i + 5);
            Truck truck = new Truck("КАМАЗ_" + i, "4925", 17.241, driverD, Truck.WeightTruck.N2);

            DriverC driverC = new DriverC("Водитель категории C №" + i, true, i + 4);
            Bus bus = new Bus("КАвЗ_" + i, "4235 «Аврора»", 4.43, driverC, Bus.Capasity.LARGE);

            System.out.println();
            //System.out.println(car);
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


            System.out.println("\n====== Данные по ТО ======");
            checkTransport(car, truck, bus);

            Arrays.stream(new Transport[]{car, bus, truck}).forEach(t -> {
                System.out.println(t.getDriver());
                t.printType();
                System.out.println(t);
                try {
                    t.DiagnosedPass();
                } catch (UnsupportedOperationException e) {
                    System.out.println("Операция не поддерживается - " + e.getMessage());
                }
                System.out.println();
            });
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

  /**Добавьте в класс Transport метод «Пройти диагностику».

     Переопределите данный метод для классов «Легковые автомобили» и «Грузовые автомобили» — объекты данных типов могут проходить диагностику.
     Объекты класса «Автобусы» диагностику проходить не должны. При выполнении этого метода у автобуса должно выводиться сообщение о том, что автобусам проходить
     диагностику не нужно. Для  этого создайте собственное проверяемое исключение TransportTypeException. Конкретную информацию о причине возникновения исключения
     следует передать в объекте исключения в виде строки.

     В методе main вызовите метод «Пройти диагностику» для объектов каждого типа транспорта.*/


  public static void checkTransport(Transport... transports) throws TransportTypeExeption {
      int count = 0;
      for (Transport transport : transports) {
          if (!transport.DiagnosedPass()) {
              try {
                  throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + " не прошел ТО!");
              } catch (RuntimeException e) {
                  System.out.println(e.getMessage());
              }
          }
      }
  }

}