package com.units.school;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "studentName",
        "studentNumber",
        "course",
        "enrollmentKey",
        "validated"
})
public class Validate implements Serializable {

    private final static long serialVersionUID = -6958132745579248617L;
    @JsonProperty("id")
    private long id;
    @JsonProperty("studentName")
    private String studentName;
    @JsonProperty("studentNumber")
    private String studentNumber;
    @JsonProperty("course")
    private Course course;
    @JsonProperty("enrollmentKey")
    private String enrollmentKey;
    @JsonProperty("validated")
    private boolean validated;

    /**
     * No args constructor for use in serialization
     */
    public Validate() {
    }

    /**
     * @param id
     * @param course
     * @param enrollmentKey
     * @param studentNumber
     * @param studentName
     * @param validated
     */
    public Validate(long id, String studentName, String studentNumber, Course course, String enrollmentKey, boolean validated) {
        super();
        this.id = id;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.course = course;
        this.enrollmentKey = enrollmentKey;
        this.validated = validated;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Validate withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("studentName")
    public String getStudentName() {
        return studentName;
    }

    @JsonProperty("studentName")
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Validate withStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    @JsonProperty("studentNumber")
    public String getStudentNumber() {
        return studentNumber;
    }

    @JsonProperty("studentNumber")
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Validate withStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
        return this;
    }

    @JsonProperty("course")
    public Course getCourse() {
        return course;
    }

    @JsonProperty("course")
    public void setCourse(Course course) {
        this.course = course;
    }

    public Validate withUnit(Course course) {
        this.course = course;
        return this;
    }

    @JsonProperty("enrollmentKey")
    public String getEnrollmentKey() {
        return enrollmentKey;
    }

    @JsonProperty("enrollmentKey")
    public void setEnrollmentKey(String enrollmentKey) {
        this.enrollmentKey = enrollmentKey;
    }

    public Validate withEnrollmentKey(String enrollmentKey) {
        this.enrollmentKey = enrollmentKey;
        return this;
    }

    @JsonProperty("validated")
    public boolean isValidated() {
        return validated;
    }

    @JsonProperty("validated")
    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public Validate withValidated(boolean validated) {
        this.validated = validated;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("studentName", studentName).append("studentNumber", studentNumber).append("course", course).append("enrollmentKey", enrollmentKey).append("validated", validated).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(course).append(enrollmentKey).append(studentNumber).append(studentName).append(validated).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Validate) == false) {
            return false;
        }
        Validate rhs = ((Validate) other);
        return new EqualsBuilder().append(id, rhs.id).append(course, rhs.course).append(enrollmentKey, rhs.enrollmentKey).append(studentNumber, rhs.studentNumber).append(studentName, rhs.studentName).append(validated, rhs.validated).isEquals();
    }

}