package com.pnakaj.spring.transaction.propgratoin.required.domain;

import javax.persistence.*;

/**
 * Created by pankaj on 2/24/2017.
 */
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue
    @Column
    private Integer id;
    @Column(unique = true)
    private String name;

    @Column(length = 1)
    private Integer age;
    @Column
    private String address;
    @Column
    private Integer salary;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
