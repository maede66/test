package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
    private String province;
    private String city;
    private int id;

    public City() {
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }
    @Id
    public int getId() {
        return id;
    }
}
