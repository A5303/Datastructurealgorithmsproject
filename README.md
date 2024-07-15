# Datastructurealgorithmsproject
# Office Check-In Management System

This project is an Office Check-In Management System that simulates a real-world office environment where employees check in and out of the office. The system keeps track of employee check-ins and check-outs and provides various functionalities to manage and view this data.

## Features

- **Add Employees**: Add new employees to the system.
- **Check-In**: Employees can check in to the office.
- **Check-Out**: Employees can check out of the office.
- **Undo Last Check-In**: Undo the most recent check-in.
- **Display All Records**: Display all check-in and check-out records.
- **Display Employee Records**: Display records for a specific employee.
- **Check-In Queue**: Add employees to a check-in queue and process the queue.

## Data Structures Used

- **ArrayList**: Used to store the list of employees.
- **HashMap**: Used to map employee IDs to their current check-in records.
- **LinkedList**: Used to store the history of all check-in records.
- **Stack**: Used to store recent check-ins for easy undo functionality.
- **Queue**: Used to manage a queue of employees waiting to check in.

## Project Structure

- `Employee.java`: Class representing an employee with an ID and name.
- `CheckInRecord.java`: Class representing a check-in record with employee ID, check-in time, and check-out time.
- `OfficeCheckInSystem.java`: Main class that manages employees, check-ins, check-outs, and other functionalities.
- `Main.java`: Entry point of the application that demonstrates the usage of the OfficeCheckInSystem.

## How to Run the Project

1. **Set Up the Project:**
   - Open NetBeans IDE.
   - Go to `File > New Project`.
   - Select `Java` from the Categories list and `Java Application` from the Projects list. Click `Next`.
   - Name your project (e.g., `OfficeCheckInManagementSystem`). Choose a location for your project.
   - Ensure `Create Main Class` is checked. You can name it `Main` or something relevant. Click `Finish`.

2. **Add the Classes:**
   - Create three new Java classes: `Employee`, `CheckInRecord`, and `OfficeCheckInSystem`.
   - Copy the corresponding code for each class from the provided source code.

3. **Replace the Main Class:**
   - Open the `Main.java` file.
   - Replace the contents with the provided `Main` class source code.

4. **Build and Run the Project:**
   - Save all the files.
   - Right-click on the project in the Projects pane and select `Build`.
   - After the build is successful, right-click on the project again and select `Run`.
