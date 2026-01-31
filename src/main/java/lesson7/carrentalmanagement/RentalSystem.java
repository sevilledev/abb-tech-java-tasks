package lesson7.carrentalmanagement;

import java.time.*;
import java.util.*;

public class RentalSystem {
    Set<Car> cars = new HashSet<>();
    Set<Car> availableCars = new HashSet<>();

    Map<Customer, Car> activeRentals = new HashMap<>();
    Map<Car, LocalDateTime> rentStartTimes = new HashMap<>();
    Map<Car, List<String>> rentalHistory = new HashMap<>();

    public void addCar(Car car) {
        cars.add(car);
        availableCars.add(car);
    }

    public void rentCar(Customer c, Car car) {
        if (availableCars.contains(car)) {
            availableCars.remove(car);
            activeRentals.put(c, car);
            rentStartTimes.put(car, LocalDateTime.now());
        } else {
            System.out.println("\nCar is not available for rent.");
        }
    }

    public void returnCar(Customer c) {
        if (activeRentals.containsKey(c)) {
            Car car = activeRentals.remove(c);

            LocalDateTime startTime = rentStartTimes.remove(car);
            LocalDateTime endTime = LocalDateTime.now().plusHours(2); // Simulate a 2-hour rental period

            Duration d = Duration.between(startTime, endTime);
            long days = d.toDays();
            long hours = d.toHours() % 24;

            String record = "rented at: " + startTime + ", returned at: " + startTime;

            availableCars.add(car);
            rentalHistory.computeIfAbsent(car, k -> new ArrayList<>()).add(record);

            System.out.println("\n" + c.getName() + " returned " + car.getBrand() + " after " + days + " days and " + hours + " hours.");
        } else {
            System.out.println("\nCustomer has no active rentals.");
        }
    }

    public void printActiveRentals() {
        System.out.println("\nActive Rentals:");
        activeRentals.forEach((c, car) -> {
            System.out.println(c.getName() + " -> " + car.getBrand() + " (rented at " + rentStartTimes.get(car) + ")");
        });
    }

    public void printAvailableCars() {
        System.out.println("\nAvailable cars:");
        availableCars.forEach(System.out::println);
    }

    public void printRentalHistory() {
        System.out.println("\nRental History:");
        rentalHistory.forEach((c, history) -> {
            System.out.println("Car " + c.getBrand() + " was last " + history.get(history.size() - 1));
        });
    }
}
