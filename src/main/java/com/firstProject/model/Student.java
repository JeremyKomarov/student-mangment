package com.firstProject.model;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private Long courseId;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, Long courseId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseId = courseId;
    }

    public Long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Long getCourseId() {
        return this.courseId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}
