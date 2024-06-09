public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 2020, 15000, 500);
        Truck truck = new Truck("Ford", "Ranger", 2024, 20000, 1000, 10);

        System.out.println(car);
        System.out.println(truck);
    }
}