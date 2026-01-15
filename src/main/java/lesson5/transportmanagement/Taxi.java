package lesson5.transportmanagement;

public class Taxi implements Transport {
    private final double ratePerKm = 1.0;
    private final double speed = 80.0;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return calculateFare(distance) * passengers;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Taxi " +
                "\nRate per km: $" + ratePerKm +
                "\nSpeed: " + speed + " km/h";
    }
}
