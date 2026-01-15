package lesson5.transportmanagement;

public class Bicycle implements Transport {
    private final double ratePerKm = 0.2;
    private final double speed = 20.0;

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
        return "Bicycle " +
                "\nRate per km: $" + ratePerKm +
                "\nSpeed: " + speed + " km/h";
    }
}
