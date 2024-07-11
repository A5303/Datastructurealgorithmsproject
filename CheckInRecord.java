import java.time.LocalDateTime;

public class CheckInRecord {
    String employeeId;
    LocalDateTime checkInTime;
    LocalDateTime checkOutTime;

    public CheckInRecord(String employeeId, LocalDateTime checkInTime) {
        this.employeeId = employeeId;
        this.checkInTime = checkInTime;
        this.checkOutTime = null;
    }

    public void setCheckOutTime(LocalDateTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Check-In Time: " + checkInTime + ", Check-Out Time: " + (checkOutTime != null ? checkOutTime : "Not Checked Out");
    }
}
