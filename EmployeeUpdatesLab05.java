/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeupdateslab05;

public class EmployeeUpdatesLab05 {

    // Properties
    private String name;
    private int id;
    private double salary;
    private String designation;

    // Constructor with all properties
    public EmployeeUpdatesLab05(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    // Constructor with some properties (uses default values for others)
    public EmployeeUpdatesLab05(String name, int id) {
        this(name, id, 0.0, "Pending"); // Calls the other constructor using 'this'
    }

    // Default constructor (uses default values for all properties)
    public EmployeeUpdatesLab05() {
        this("Unknown", 0, 0.0, "Pending"); // Calls the other constructor using 'this'
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + this.name + ", ID: " + this.id + 
                           ", Salary: $" + this.salary + ", Designation: " + this.designation);
    }

    // Overloaded method to display details with a specific format
    public void displayDetails(String format) {
        if ("brief".equalsIgnoreCase(format)) {
            System.out.println("Name: " + this.name + ", ID: " + this.id);
        } else if ("detailed".equalsIgnoreCase(format)) {
            this.displayDetails(); // Calls the main displayDetails method
        } else {
            System.out.println("Unknown format");
        }
    }

    // Method to update salary
    public void updateSalary(double newSalary) {
        this.salary = newSalary; // Uses 'this' to refer to the instance variable
    }

    // Overloaded method to update salary with additional increment
    public void updateSalary(double newSalary, boolean increment) {
        if (increment) {
            this.salary += newSalary; // Increment salary by newSalary
        } else {
            this.salary = newSalary; // Set salary to newSalary
        }
        System.out.println("Updated Salary: $" + this.salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating instances of Employee using different constructors
        EmployeeUpdatesLab05 emp1 = new EmployeeUpdatesLab05("Mr.Aziz", 101, 75000.00, "Software Engineer");
        EmployeeUpdatesLab05 emp2 = new EmployeeUpdatesLab05("Md. Shawon", 102);
        EmployeeUpdatesLab05 emp3 = new EmployeeUpdatesLab05();

        // Displaying employee details
        System.out.println("Employee 1:");
        emp1.displayDetails();
        System.out.println("\nEmployee 2:");
        emp2.displayDetails();
        System.out.println("\nEmployee 3:");
        emp3.displayDetails();

        // Updating and displaying salary
        emp2.updateSalary(90000.00, true); // Increment salary
        System.out.println("\nUpdated Employee 2:");
        emp2.displayDetails("brief");

        emp1.updateSalary(3000.00, false); // Set salary to new value
        System.out.println("\nUpdated Employee 1:");
        emp1.displayDetails("detailed");
    }
}

