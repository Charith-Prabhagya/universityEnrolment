package com.university;

public class Weekday extends Student {

    private String freeDay;

    public String getFreeDay() {
        return freeDay;
    }

    public void setFreeDay(String freeDay) {
        this.freeDay = freeDay;
    }

    public void addDetails(String name, String address, String sex, int year, String specialization, String freeDay) {
        this.setName(name);
        this.setAddress(address);
        this.setSex(sex);
        this.setYear(year);
        this.setSpecialization(specialization);
        this.freeDay = freeDay;
    }

    public void showDetails() {
        System.out.println("Student Name " + this.getName());
        System.out.println("Student Address " + this.getAddress());
        System.out.println("Gender " + this.getSex());
        System.out.println("Student Year " + this.getYear());
        System.out.println("Student Specialization " + this.getSpecialization());
        System.out.println("Student Freeday " + this.freeDay);
    }
}
