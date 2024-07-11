import java.util.*;
import java.time.LocalDateTime;

public class OfficeCheckInSystem {
    private List<Employee> employees; // List of employees
    private HashMap<String, CheckInRecord> checkInMap; // Map of current check-in records by employee ID
    private LinkedList<CheckInRecord> history; // History of all check-in and check-out records
    private Stack<CheckInRecord> recentCheckIns; // Stack for recent check-ins for undo functionality
    private Queue<Employee> checkInQueue; // Queue for employees waiting to check in

    public OfficeCheckInSystem() {
        employees = new ArrayList<>();
        checkInMap = new HashMap<>();
        history = new LinkedList<>();
        recentCheckIns = new Stack<>();
        checkInQueue = new LinkedList<>();
    }

    public void addEmployee(String id, String name) {
        employees.add(new Employee(id, name));
    }

    public void checkIn(String employeeId) {
        LocalDateTime now = LocalDateTime.now();
        CheckInRecord record = new CheckInRecord(employeeId, now);
        checkInMap.put(employeeId, record);
        history.add(record);
        recentCheckIns.push(record);
    }

    public void checkOut(String employeeId) {
        LocalDateTime now = LocalDateTime.now();
        CheckInRecord record = checkInMap.get(employeeId);
        if (record != null) {
            record.setCheckOutTime(now);
            checkInMap.remove(employeeId);
        } else {
            System.out.println("No check-in record found for employee ID: " + employeeId);
        }
    }

    public void undoLastCheckIn() {
        if (!recentCheckIns.isEmpty()) {
            CheckInRecord lastCheckIn = recentCheckIns.pop();
            checkInMap.remove(lastCheckIn.employeeId);
            history.remove(lastCheckIn);
            System.out.println("Undo check-in for employee ID: " + lastCheckIn.employeeId);
        } else {
            System.out.println("No recent check-ins to undo.");
        }
    }

    public void displayAllRecords() {
        for (CheckInRecord record : history) {
            System.out.println(record);
        }
    }

    public void displayEmployeeRecords(String employeeId) {
        for (CheckInRecord record : history) {
            if (record.employeeId.equals(employeeId)) {
                System.out.println(record);
            }
        }
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void addToCheckInQueue(String employeeId) {
        for (Employee employee : employees) {
            if (employee.id.equals(employeeId)) {
                checkInQueue.add(employee);
                System.out.println("Added to check-in queue: " + employee);
                return;
            }
        }
        System.out.println("Employee not found: " + employeeId);
    }

    public void processCheckInQueue() {
        while (!checkInQueue.isEmpty()) {
            Employee employee = checkInQueue.poll();
            checkIn(employee.id);
            System.out.println("Checked in: " + employee);
        }
    }
}

