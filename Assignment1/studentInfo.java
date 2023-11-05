package com.demo.que1;

import java.util.Scanner;

public class studentInfo{

    int studentId;
    String name;
    int M1;
    int M2;
    int M3;

    public studentInfo() {
        super();
    }

    public studentInfo(int studentId, String name, int M1, int M2, int M3) {
        this.studentId = studentId;
        this.name = name;
        this.M1 = M1;
        this.M2 = M2;
        this.M3 = M3;
    }

    public static void acceptData(studentInfo si) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student id:");
        si.studentId = sc.nextInt();
        System.out.println("Enter the name:");
        si.name = sc.next();
        System.out.println("Enter the marks of M1:");
        si.M1 = sc.nextInt();
        System.out.println("Enter the marks of M2:");
        si.M2 = sc.nextInt();
        System.out.println("Enter the marks of M3:");
        si.M3 = sc.nextInt();
    }

    public static void displayData(studentInfo si) {
        System.out.println("Student ID: " + si.studentId);
        System.out.println("Name: " + si.name);
        System.out.println("Marks in M1: " + si.M1);
        System.out.println("Marks in M2: " + si.M2);
        System.out.println("Marks in M3: " + si.M3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students you want to store info:");
        int size = sc.nextInt();

        studentInfo[] students = new studentInfo[size];

        for (int i = 0; i < size; i++) {
            students[i] = new studentInfo();
            acceptData(students[i]);
            displayData(students[i]);
        }
    }
}