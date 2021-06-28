package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
public class PersonAddress {
    private int id;
    private Zone city;
    private Zone province;
    private Double postcode;
    private Person person;
    @JoinColumn()
    @ManyToOne
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }




    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    @Pattern(regexp ="[1-9][0-9]{9}",message = "Invalid post code")
    public Double getPostcode() {
        return postcode;
    }

    public void setPostcode(Double postcode) {
        this.postcode = postcode;
    }
}
