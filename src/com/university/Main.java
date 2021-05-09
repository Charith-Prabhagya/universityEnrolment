package com.university;

public class Main {

    public static void main(String[] args) {
        Weekend student1 = new Weekend();
        student1.addDetails("Jane", "Malabe", "F", 1990, "DS", "QA");
        String studentId1 = student1.generateId();
        student1.showDetails();
        System.out.println("Student Id " + studentId1);
        System.out.println();

        Weekday student2 = new Weekday();
        student2.addDetails("Jim", "Kaluthara", "M", 1991, "SE", "Tuesday");
        String studentId2 = student2.generateId();
        student2.showDetails();
        System.out.println("Student Id " + studentId2);
        System.out.println();

        Enroll sem1 = new Enroll();
        sem1.enrollStudent(studentId1, "IT");
        sem1.enrollStudent(studentId2, "SE");
        System.out.println("\n\nEnrolled student details");
        sem1.displayEnrolledStudents();

        Specialization spe = new Specialization();
        spe.addSpecialization("SE", 2.75);
        spe.addSpecialization("DS", 3.5);
        System.out.println("\n\nSpecialization Details");
        spe.displaySpecialization();

    }
}


