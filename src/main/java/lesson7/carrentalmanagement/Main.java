package lesson7.carrentalmanagement;

public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        Car car1 = new Car(1, "Toyota", "Camry", 2020);
        Car car2 = new Car(2, "Honda", "Civic", 2019);
        Car car3 = new Car(3, "Ford", "Mustang", 2021);

        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        Customer customer1 = new Customer(1, "Alice", "A1234567");
        Customer customer2 = new Customer(2, "Bob", "B7654321");

        rentalSystem.rentCar(customer1, car1);
        rentalSystem.rentCar(customer2, car2);

        rentalSystem.printActiveRentals();
        rentalSystem.printAvailableCars();

        rentalSystem.returnCar(customer1);
        rentalSystem.returnCar(customer2);

        rentalSystem.printRentalHistory();
        rentalSystem.printAvailableCars();
    }
}
