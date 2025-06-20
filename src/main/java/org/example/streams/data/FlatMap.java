package org.example.streams.data;

import java.util.Collection;
import java.util.List;

public class FlatMap {

    public static void main(String[] args) {

        System.out.println("Student courses : "+printStudentCourses());

    }

    public static List<String> printStudentCourses() {

        return Student.generateDummyStudents()
                .stream()
                .map(Student::getEnrolledCourses) //Stream<List<String>>
                .flatMap(Collection::stream)
                .toList();

    }
}
