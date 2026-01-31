package lesson7.busroutesystem;

public class Main {
    public static void main(String[] args) {
        // Dayanacaqlar
        Stop stop1 = new Stop("Stop 1");
        Stop stop2 = new Stop("Stop 2");
        Stop stop3 = new Stop("Stop 3");

        // Dayanacaqlara sərnişin əlavə et
        stop1.getPassenger(new Passenger("Aysel", true));
        stop1.getPassenger(new Passenger("Rauf", false));
        stop1.getPassenger(new Passenger("Ali", false));

        stop2.getPassenger(new Passenger("Nigar", true));
        stop2.getPassenger(new Passenger("Samir", true));
        stop2.getPassenger(new Passenger("Murad", false));

        stop3.getPassenger(new Passenger("Sevinc", true));
        stop3.getPassenger(new Passenger("Leyla", false));
        stop3.getPassenger(new Passenger("Tural", false));

        Bus bus = new Bus();

        // Stop 1
        System.out.println("\nStop 1 reached.");
        bus.dropPassengers();
        bus.pickPassengers(stop1);
        System.out.println("Bus now: " + bus.passengers);
        System.out.println("Stop 1 remaining: " + stop1.waitingPassengers);

        // Stop 2
        System.out.println("\nStop 2 reached.");
        bus.dropPassengers();
        bus.pickPassengers(stop2);
        System.out.println("Bus now: " + bus.passengers);
        System.out.println("Stop 2 remaining: " + stop2.waitingPassengers);

        // Stop 3
        System.out.println("\nStop 3 reached.");
        bus.dropPassengers();
        bus.pickPassengers(stop3);
        System.out.println("Bus now: " + bus.passengers);
        System.out.println("Stop 3 remaining: " + stop3.waitingPassengers);

        System.out.println("\nSimulation finished.");
        System.out.println("Final passengers in bus: " + bus.passengers);
    }
}
