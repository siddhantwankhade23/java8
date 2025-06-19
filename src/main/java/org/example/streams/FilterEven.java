package org.example.streams;


import org.example.streams.data.RandomIntegers;
import org.example.streams.data.Student;

import java.util.List;

public class FilterEven {
    public static void main(String[] args) {

        List<Integer> integerList = RandomIntegers.getRandomIntegers();
        System.out.print("All Numbers : ");
        integerList.forEach(num -> System.out.print(num + " "));

        System.out.println();

        List<Integer> evenInts = integerList.stream().filter(num -> num % 2 == 0).toList();
        System.out.print("Even Numbers : ");
        evenInts.forEach(num -> System.out.print(num + " "));

    }
}
