public class OfficeCheckInManagementSystem {
    public static void main(String[] args) {
        OfficeCheckInSystem system = new OfficeCheckInSystem();

        // Adding employees
        system.addEmployee("101", "Alice");
        system.addEmployee("102", "Bob");
        system.addEmployee("103", "Charlie");

        // Display all employees
        System.out.println("Employees:");
        system.displayEmployees();

        // Employees check in
        system.checkIn("101");
        system.checkIn("102");

        // Display all records
        System.out.println("\nAll Check-In Records:");
        system.displayAllRecords();

        // Employees check out
        system.checkOut("101");

        // Display all records
        System.out.println("\nAll Check-In Records after check-out:");
        system.displayAllRecords();

        // Display records for a specific employee
        System.out.println("\nRecords for Employee ID 101:");
        system.displayEmployeeRecords("101");

        // Add employees to check-in queue
        system.addToCheckInQueue("103");
        system.addToCheckInQueue("102");

        // Process check-in queue
        system.processCheckInQueue();

        // Display all records after processing check-in queue
        System.out.println("\nAll Check-In Records after processing check-in queue:");
        system.displayAllRecords();

        // Undo last check-in
        system.undoLastCheckIn();

        // Display all records after undoing last check-in
        System.out.println("\nAll Check-In Records after undoing last check-in:");
        system.displayAllRecords();
    }
}
