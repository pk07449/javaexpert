package com.pnakaj.spring.hibernate.mapping.association.onetomany.domain;

import org.hibernate.annotations.Table;

import javax.persistence.*;

/**
 * Created by pankaj on 7/16/2017.
 */


@Entity
public class Orders {

    @Id
    @Column
    @GeneratedValue
    private Integer addressId;
    @Column
    private String state;
    @Column
    private String city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_customerId")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Orders() {
    }

    public Orders(Integer addressId, String state, String city) {
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
