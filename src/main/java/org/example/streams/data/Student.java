package org.example.streams.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {

    private String name;
    private int age;
    private double marks;

    /**
     * Constructor for the Student class.
     * Initializes a new Student object with the given name, age, and marks.
     *
     * @param name The name of the student.
     * @param age The age of the student.
     * @param marks The marks obtained by the student.
     */
    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // --- Getter methods to access the private instance variables ---

    /**
     * Returns the name of the student.
     * @return The student's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of the student.
     * @return The student's age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the marks of the student.
     * @return The student's marks.
     */
    public double getMarks() {
        return marks;
    }

    // --- Setter methods to modify the private instance variables (optional, but good practice) ---

    /**
     * Sets the name of the student.
     * @param name The new name for the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the age of the student.
     * @param age The new age for the student.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the marks of the student.
     * @param marks The new marks for the student.
     */
    public void setMarks(double marks) {
        this.marks = marks;
    }

    /**
     * Overrides the toString method to provide a string representation of the Student object.
     * This is useful for printing student details directly.
     * @return A string containing the student's name, age, and marks.
     */
    @Override
    public String toString() {
        return "Student [Name: " + name + ", Age: " + age + ", Marks: " + String.format("%.2f", marks) + "]";
    }

    /**
     * Static method to generate and return a list of 10 dummy Student objects.
     * Each dummy student will have a generated name, a random age, and random marks.
     *
     * @return An ArrayList containing 10 dummy Student objects.
     */
    public static List<Student> generateDummyStudents() {
        List<Student> dummyStudents = new ArrayList<>();
        Random random = new Random();

        String[] firstNames = {"Alice", "Bob", "Charlie", "Diana", "Eve", "Frank", "Grace", "Heidi", "Ivan", "Judy"};
        String[] lastNames = {"Smith", "Jones", "Williams", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson"};

        for (int i = 0; i < 10; i++) {
            // Generate a random name by combining a first and last name
            String name = firstNames[random.nextInt(firstNames.length)] + " " + lastNames[random.nextInt(lastNames.length)];
            // Generate a random age between 18 and 25
            int age = 18 + random.nextInt(8); // 25 - 18 + 1 = 8
            // Generate random marks between 50.0 and 100.0 (inclusive)
            double marks = 50.0 + (random.nextDouble() * 50.0); // 50.0 + (0.0 to <1.0 * 50.0)

            // Create a new Student object with the generated data
            Student student = new Student(name, age, marks);
            // Add the student object to the list
            dummyStudents.add(student);
        }
        return dummyStudents;
    }
}
