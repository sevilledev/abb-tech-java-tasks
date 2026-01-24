package lesson7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    String name;
    LocalDate birthDate;
    LocalDateTime creationDate;

    public User(String name, LocalDate birthDate, LocalDateTime creationDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", creationDate=" + creationDate +
                '}';
    }
}
