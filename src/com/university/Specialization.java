package com.university;

import java.util.HashMap;
import java.util.Map;

public class Specialization {
    Map<String, Double> sp = new HashMap<>();

    public void addSpecialization(String specialization, Double gpaValue) {
        sp.put(specialization, gpaValue);
    }

    public void displaySpecialization() {
        sp.entrySet().forEach(s -> {
            System.out.println(s.getKey() + " : " + s.getValue());
        });
    }
}
