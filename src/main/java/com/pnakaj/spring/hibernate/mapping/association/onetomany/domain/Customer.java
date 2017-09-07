package com.pnakaj.spring.hibernate.mapping.association.onetomany.domain;



import javax.persistence.*;
import java.util.Set;

/**
 * Created by pankaj on 7/15/2017.
 */

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Integer customerId;
    @Column
    private String name;
    @Column
    private String type;

    public Customer() {
    }

    public Customer(Integer customerId, String name, String type, Set<Orders> orders) {
        this.customerId = customerId;
        this.name = name;
        this.type = type;
        this.orders = orders;
    }

    @OneToMany(mappedBy = "customer")
    private Set<Orders> orders;


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }
}
