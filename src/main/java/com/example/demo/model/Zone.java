package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Zone {
    private Long id;
    private String name;
    private Zone matser;
    private Set<ZoneType> zoneType = new HashSet();

    public Zone(Zone matser) {
        this.matser = matser;
    }

    public Zone() {

    }

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @JoinColumn
    @OneToMany
    public Set<ZoneType> getZoneType() {
        return zoneType;
    }

    public void setZoneType(Set<ZoneType> zoneType) {
        this.zoneType = zoneType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   @ManyToOne
   @JoinColumn
    public Zone getMatser() {
        return matser;
    }

    public void setMatser(Zone matser) {
        this.matser = matser;
    }
}
