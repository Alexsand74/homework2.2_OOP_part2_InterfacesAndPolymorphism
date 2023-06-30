public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
// Методы использующие перегрузку по сигнатуре
        System.out.println("   station.checkOverload(транспортное средство) ");
        station.checkOverload(car);
        station.checkOverload(car2);
        station.checkOverload(bicycle);
        station.checkOverload(bicycle2);
        station.checkOverload(truck);
        station.checkOverload(truck2);
        System.out.println();

// Методы использующие переопределение
        System.out.println("   транспортное средство.check() ");
        car.check();
        car2.check();
        truck.check();
        truck2.check();
        bicycle.check();
        bicycle2.check();
        System.out.println();
        System.out.println("   station.check(транспортное средство) ");
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
        station.check(bicycle);
        station.check(bicycle);

    }
}