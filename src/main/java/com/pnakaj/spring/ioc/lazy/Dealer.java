package com.pnakaj.spring.ioc.lazy;



import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class Dealer implements User {

    @Override
    public String toString() {
        return "Dealer{}";
    }

    public Dealer() {
        System.out.println("Dealer.Dealer");
    }
}
