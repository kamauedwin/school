package com.units.school;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name"
})
public class Unit implements Serializable {

    private final static long serialVersionUID = -3848817484314297327L;
    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;

    /**
     * No args constructor for use in serialization
     */
    public Unit() {
    }

    /**
     * @param id
     * @param name
     */
    public Unit(long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Unit withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Unit withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Unit) == false) {
            return false;
        }
        Unit rhs = ((Unit) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).isEquals();
    }

}