package com.university;

public class Weekend extends Student {

    private String jobTitle;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void addDetails(String name, String address, String sex, int year, String specialization, String jobtitle) {
        this.setName(name);
        this.setAddress(address);
        this.setSex(sex);
        this.setYear(year);
        this.setSpecialization(specialization);
        this.jobTitle = jobtitle;
    }

    public void showDetails() {
        System.out.println("Student Name " + this.getName());
        System.out.println("Student Address " + this.getAddress());
        System.out.println("Gender " + this.getSex());
        System.out.println("Student Year " + this.getYear());
        System.out.println("Student Specialization " + this.getSpecialization());
        System.out.println("Student Job title " + this.jobTitle);
    }
}
