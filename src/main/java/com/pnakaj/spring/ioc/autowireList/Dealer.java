package com.pnakaj.spring.ioc.autowireList;



import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Dealer implements User {

    @Override
    public String toString() {
        return "Dealer{}";
    }

    public Dealer() {
        System.out.println("Dealer.Dealer");
    }
}
