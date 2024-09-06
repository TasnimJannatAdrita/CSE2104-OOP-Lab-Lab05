/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persondetailslab05;

public class PersonDetailsLab05 {

    // Properties of the Person class
    private String name;
    private int age;
    private String gender;
    private String address;

    // Class variable
    private static int personCount = 0;

    // Constructor with all properties
    public PersonDetailsLab05(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        personCount++;
    }

    // Constructor with some properties (uses default values for gender and address)
    public PersonDetailsLab05(String name, int age) {
        this(name, age, "Not Specified", "Not Specified"); // Calls another constructor using 'this'
    }

    // Default constructor (uses default values for all properties)
    public PersonDetailsLab05() {
        this("Unknown", 0, "Not Specified", "Not Specified"); // Calls another constructor using 'this'
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + 
                           ", Gender: " + this.gender + ", Address: " + this.address);
    }

    // Overloaded method to display details with a specific format
    public void displayDetails(String format) {
        if ("brief".equalsIgnoreCase(format)) {
            System.out.println("Name: " + this.name + ", Age: " + this.age);
        } else if ("detailed".equalsIgnoreCase(format)) {
            this.displayDetails(); // Calls the main displayDetails method
        } else {
            System.out.println("Unknown format");
        }
    }

    // Method to update the address
    public void updateAddress(String newAddress) {
        this.address = newAddress; // Uses 'this' to refer to the instance variable
    }

    // Overloaded method to update the address with optional notification
    public void updateAddress(String newAddress, boolean notify) {
        this.address = newAddress;
        if (notify) {
            System.out.println("Address updated to: " + newAddress);
        }
    }

    // Static method to get the total number of persons created
    public static void displayTotalPersons() {
        System.out.println("Total number of persons: " + personCount);
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Creating instances of Person using different constructors
        PersonDetailsLab05 person1 = new PersonDetailsLab05("Sana Mir", 30, "Female", "Pakistan");
        PersonDetailsLab05 person2 = new PersonDetailsLab05("Ashleigh Gardner", 28);
        PersonDetailsLab05 person3 = new PersonDetailsLab05();

        // Displaying person details
        System.out.println("Person 1:");
        person1.displayDetails();
        System.out.println("\nPerson 2:");
        person2.displayDetails();
        System.out.println("\nPerson 3:");
        person3.displayDetails();

        // Updating and displaying address
        person2.updateAddress("Astralia", true);
        System.out.println("\nUpdated Person 2:");
        person2.displayDetails("brief");

        // Displaying the total number of persons
        PersonDetailsLab05.displayTotalPersons();
    }
}
