package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.math.BigInteger;
import java.util.*;

@Entity
public class Person {
    private String fname;
    private String lname;
    private String faname;

    private Set<PersonContact> personContacts = new HashSet();
    //    private List<PersonContact> contacts= new ArrayList<>();
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @OneToMany()
    @JoinColumn()
    public Set<PersonContact> getPersonContacts() {
        return personContacts;
    }

    public void setPersonContacts(Set<PersonContact> personContacts) {
        this.personContacts = personContacts;
    }

    public Person() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFaname() {
        return faname;
    }

    public void setFaname(String faname) {
        this.faname = faname;
    }


    @Id
    @Pattern(regexp = "d{10}", message = "invalid code meli")
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fname, person.fname) && Objects.equals(lname, person.lname) && Objects.equals(faname, person.faname) && Objects.equals(sobriqute, person.sobriqute) && Objects.equals(personContacts, person.personContacts) && Objects.equals(id, person.id);
    }

    @Override
    public String toString() {
        return faname+ "  ".concat(lname);
    }
}
