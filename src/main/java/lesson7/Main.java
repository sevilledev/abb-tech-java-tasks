package lesson7;

import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        Stats<Integer> intStats = new Stats<>(nums);
        System.out.println("Average of integers: " + intStats.average());

        Double[] dnums = {1.5, 2.5, 3.5, 4.5};
        Stats<Double> doubleStats = new Stats<>(dnums);
        System.out.println("Average of doubles: " + doubleStats.average());

        LocalDate birthDate = LocalDate.of(1990, 5, 15);
        User user = new User("Alice", birthDate, LocalDateTime.now());
        System.out.println(user);


        List<User> users = new ArrayList<>();
        users.add(new User("Bob", LocalDate.of(1995, 3, 20), LocalDateTime.now()));
        users.add(new User("Charlie", LocalDate.of(2002, 7, 10), LocalDateTime.now()));

        List<User> list = users.stream().filter(u -> u.name.startsWith("B")).toList();

        System.out.println("Users name starts with B: " + list);
    }
}
