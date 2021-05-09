package com.university;

import java.util.Random;

public class Student {

    public String generateId() {
        try {
            Random random = new Random();
            String id = "IT" + String.format("%04d", random.nextInt(10000));
            if (!id.matches("(\\D*\\d){2,}")) {
                throw new InvalidIdException();
            }
            return id;
        } catch (InvalidIdException ex) {
            System.err.print(ex);
        }
        return null;
    }

    private String studentId;
    private String name;
    private String address;
    private String sex;
    private Integer year;
    private String specialization;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
