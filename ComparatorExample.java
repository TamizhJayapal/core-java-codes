package com.object.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "MyClass{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static class AgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student obj1, Student obj2) {
            return obj1.getId() - obj2.getId();
        }
    }

public Main() {}

public static void main(String[] args) {
// Create a list of MyClass objects
        List<Student> myObjects = new ArrayList<>();
        myObjects.add(new Student(2, "B"));
        myObjects.add(new Student(1, "A"));
        myObjects.add(new Student(3, "C"));

        // Sort the list using the custom comparator
        Collections.sort(myObjects, new AgeComparator());

        // Print the sorted list
        for (Student obj : myObjects) {
            System.out.println(obj);
        }
}

}
