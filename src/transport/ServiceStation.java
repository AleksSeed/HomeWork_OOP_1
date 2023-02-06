package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private  final Queue<Transport> transportQueue = new ArrayDeque<>();

    private void add (Transport transport) {     // добавление очереди
        transportQueue.offer(transport);
    }

    public void addCar(Car car) {         // добавление автомобилей
        add(car);
    }

    public void addTruck (Truck truck) {    // добавление грузовиков
        add(truck);
    }

   /* public void maintenance() {
        if (!transportQueue.isEmpty()) {
            Transport transport = transportQueue.poll(); // удаление транспорта из очереди
            // обслуживание транспорта
            transport.service();
        }
    }*/
}