package com.springcore.dependencyInjection;

import java.util.Map;
import java.util.Set;

public class Student {
    private int studentId;
    private String studentName;
    private Address studentAddress;

    private Map<String,String> courses;
    private Set<String> phoneNumbers;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Student(int studentId, String studentName, Address studentAddress, Map<String, String> courses, Set<String> phoneNumbers) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.courses = courses;
        this.phoneNumbers = phoneNumbers;
    }

    public Student()
    {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress=" + studentAddress +
                ", courses=" + courses +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
