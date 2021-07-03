package com.example.demo.model;

import javassist.bytecode.ConstantAttribute;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class PersonContact {
    private Double value;
    private int id;
    private ContactType type;
    private Person person;
    @ManyToOne
    @JoinColumn()
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    @ManyToOne
    @JoinColumn
    public ContactType getType() {
        return type;
    }

    public void setType(ContactType type) {
        this.type = type;
    }






    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
