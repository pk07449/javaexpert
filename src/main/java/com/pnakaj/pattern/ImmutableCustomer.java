package com.pnakaj.pattern;

import java.util.Collections;
import java.util.List;

/**
 * Created by pankaj on 3/11/2018.
 */
public final class ImmutableCustomer {

    final int id;
    final List<String> phoneNumber;
    final Address address;

    public ImmutableCustomer(int id, List<String> phoneNumber,Address address) {
        this.id = id;
        this.phoneNumber = Collections.unmodifiableList(phoneNumber);
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return new Address(address.getId());
    }
}

 class Address {

     private Object id;

     public Object getId() {
         return id;
     }

     public void setId(Object id) {
         this.id = id;
     }

     public Address(Object id) {
         this.id = id;
     }
 }


/*
1. All fields should be declared final
2. Class itself is declared final so that the derived classes do not make it Mutable.
        3. this reference should not be allowed to escape during object construction such as in anonymous inner classes (for example adding action listener)
        4. Any field that contains reference to mutable objects (such as arrays, collections, StringBuffer, etc)
        i. Are private
ii. Are never returned or exposed to the caller
        iii. Are the only reference to the Objects that they refer
        iv. Do not change the state of the referenced object after the construction.
        v. If mutable fields must be returned to the caller, then a defensive copy should be returned so that the changes do not reflect in the inner data structure.

public List getList() {
        return Collections.unmodifiableList(list); <=== defensive copy of the mutable field before returning it to caller
        }

*/