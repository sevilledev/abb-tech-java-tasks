package lesson7.carrentalmanagement;

import java.time.LocalDateTime;

public class RentalRecord {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public RentalRecord(LocalDateTime startTime, LocalDateTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Rented at: " + startTime + ", Returned at: " + endTime;
    }
}
