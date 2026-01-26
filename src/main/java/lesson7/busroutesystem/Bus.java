package lesson7.busroutesystem;

import java.util.*;

public class Bus {
    static final int CAP = 5;

    List<Passenger> passengers = new ArrayList<>();
    Random r = new Random();

    void dropPassengers() {
        if (passengers.isEmpty()) return;

        int dropCount = r.nextInt(2) + 1; // gives 1 or 2
        for (int i = 0; i < dropCount; i++) {
            Passenger p = passengers.remove(r.nextInt(passengers.size()));
            System.out.println(p.name + " dropped off the bus.");
        }
    }

    void pickPassengers(Stop stop) {
        while (passengers.size() < CAP && !stop.waitingPassengers.isEmpty()) {
            Passenger p = stop.waitingPassengers.poll();
            if (p == null) break;

            passengers.add(p);
            System.out.println(p.name + " picked by bus.");
        }
    }

}
