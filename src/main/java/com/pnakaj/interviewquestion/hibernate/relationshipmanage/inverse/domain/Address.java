package com.pnakaj.interviewquestion.hibernate.relationshipmanage.inverse.domain;

import javax.persistence.*;

/**
 * Created by pankaj on 7/16/2017.
 */


@Entity
public class Address {

    @Id
    @Column
    @GeneratedValue
    private Integer addressId;
    @Column
    private String state;
    @Column
    private String city;

    public Address() {


    }

    @OneToOne(mappedBy = "address")
    private Employee employee;


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Address(Integer addressId, String state, String city) {
        this.addressId = addressId;
        this.state = state;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
