package com.pnakaj.spring.hibernate.mapping.association.onetoone.withthirdtable.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
