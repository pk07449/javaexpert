package com.pnakaj.spring.hibernate.mapping.association.onetoone.withForeignKey.domain;



import javax.persistence.*;

/**
 * Created by pankaj on 7/15/2017.
 */

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private String type;

    public Employee() {
    }

    public Employee(Integer id, String name, String type, Address address) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
    }
    @OneToOne
    @JoinColumn(name = "addressId")
    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
