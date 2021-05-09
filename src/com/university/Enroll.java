package com.university;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Enroll {
    Map<String, String> enroll = new HashMap<>();

    public void enrollStudent(String studentId, String specialization) {
        enroll.put(studentId, specialization);
    }

    public void displayEnrolledStudents() {
        enroll.entrySet().forEach(student -> {
            System.out.println(student.getKey() + " : " + student.getValue());
        });
    }
}
