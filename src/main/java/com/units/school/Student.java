package com.units.school;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

-----------------------------------com.units.school.Student.java-----------------------------------

        package com.units.school;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "studentName",
        "studentNumber",
        "unit",
        "enrollmentKey",
        "validated"
})
public class Student implements Serializable, Parcelable {

    public final static Parcelable.Creator<Student> CREATOR = new Creator<Student>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        public Student[] newArray(int size) {
            return (new Student[size]);
        }

    };
    private final static long serialVersionUID = 3762509010635676318L;
    @JsonProperty("id")
    private long id;
    @JsonProperty("studentName")
    private String studentName;
    @JsonProperty("studentNumber")
    private String studentNumber;
    @JsonProperty("unit")
    private Object unit;
    @JsonProperty("enrollmentKey")
    private Object enrollmentKey;
    @JsonProperty("validated")
    private boolean validated;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    protected Student(Parcel in) {
        this.id = ((long) in.readValue((long.class.getClassLoader())));
        this.studentName = ((String) in.readValue((String.class.getClassLoader())));
        this.studentNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.unit = ((Object) in.readValue((Object.class.getClassLoader())));
        this.enrollmentKey = ((Object) in.readValue((Object.class.getClassLoader())));
        this.validated = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     */
    public Student() {
    }

    /**
     * @param id
     * @param unit
     * @param enrollmentKey
     * @param studentNumber
     * @param studentName
     * @param validated
     */
    public Student(long id, String studentName, String studentNumber, Object unit, Object enrollmentKey, boolean validated) {
        super();
        this.id = id;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.unit = unit;
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

    public Student withId(long id) {
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

    public Student withStudentName(String studentName) {
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

    public Student withStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
        return this;
    }

    @JsonProperty("unit")
    public Object getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(Object unit) {
        this.unit = unit;
    }

    public Student withUnit(Object unit) {
        this.unit = unit;
        return this;
    }

    @JsonProperty("enrollmentKey")
    public Object getEnrollmentKey() {
        return enrollmentKey;
    }

    @JsonProperty("enrollmentKey")
    public void setEnrollmentKey(Object enrollmentKey) {
        this.enrollmentKey = enrollmentKey;
    }

    public Student withEnrollmentKey(Object enrollmentKey) {
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

    public Student withValidated(boolean validated) {
        this.validated = validated;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Student withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("studentName", studentName).append("studentNumber", studentNumber).append("unit", unit).append("enrollmentKey", enrollmentKey).append("validated", validated).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(unit).append(enrollmentKey).append(additionalProperties).append(studentNumber).append(studentName).append(validated).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Student) == false) {
            return false;
        }
        Student rhs = ((Student) other);
        return new EqualsBuilder().append(id, rhs.id).append(unit, rhs.unit).append(enrollmentKey, rhs.enrollmentKey).append(additionalProperties, rhs.additionalProperties).append(studentNumber, rhs.studentNumber).append(studentName, rhs.studentName).append(validated, rhs.validated).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(studentName);
        dest.writeValue(studentNumber);
        dest.writeValue(unit);
        dest.writeValue(enrollmentKey);
        dest.writeValue(validated);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}
