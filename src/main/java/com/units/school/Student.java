package com.units.school;

public class Student {
    public String enrollmentKey;
    private String studentName;
    private String studentNumber;
    private Boolean validated;

    public Student() {
        this.enrollmentKey = enrollmentKey;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.validated = validated;
    }

    public String getEnrollmentKey() {
        return enrollmentKey;
    }

    public void setEnrollmentKey(String enrollmentKey) {
        this.enrollmentKey = enrollmentKey;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }


    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }
}

}
