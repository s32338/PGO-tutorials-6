public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 15000, 500);
        Truck truck = new Truck("Volvo", "FH", 2019, 20000, 800, 10);

        System.out.println(car);
        System.out.println(truck);
    }
}