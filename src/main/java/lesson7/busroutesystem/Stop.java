package lesson7.busroutesystem;

import java.util.*;

public class Stop {
    static final int MAX_SIZE = 10;

    String name;
    PriorityQueue<Passenger> waitingPassengers;

    public Stop(String name) {
        this.name = name;
        this.waitingPassengers = new PriorityQueue<>((p1, p2) -> Boolean.compare(p2.isPriority, p1.isPriority));
    }

    void getPassenger(Passenger ps) {
        if (waitingPassengers.size() < MAX_SIZE) {
            waitingPassengers.offer(ps);
        } else {
            System.out.println("Stop " + name + " is full. Cannot add passenger " + ps.name);
        }
    }
}
