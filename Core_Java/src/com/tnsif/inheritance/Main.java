package com.tnsif.inheritance;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1);


        Student s2 = new Student(101, "Sachin", "Mandya", "PES", 2027);
        System.out.println(s2);


        Student s3 = new Student("PES", 2026);
        System.out.println(s3);


        Person p1 = new Person();
        System.out.println(p1);
    }
}