package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigInteger;
import java.util.*;

@Entity
public class Person {
    private String fname;
    private String lname;
    private String faname;
    private String code;
    private Set<PersonContact> personContacts = new HashSet();
    //    private List<PersonContact> contacts= new ArrayList<>();

    private Integer id;

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
    @Pattern(regexp = "\\d{10}", message = "invalid code meli")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @NotNull
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    @NotNull
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
          public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    private Map<Integer, Person> persons = new HashMap() ;

    public void addItem(Person person){
        Person person1 = new Person();
        persons.put(person1.getId(), person);

    }
    @Override
    public String toString() {
        return faname+ "  ".concat(lname);
    }

    public void removePerson(int id){
        persons.remove(id);
    }
    public void update(int id, String fname){
        persons.get(id).setFaname(faname);
    }

}
