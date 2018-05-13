package com.pnakaj.spring.transaction.isolation.readcommited;

import com.pnakaj.spring.transaction.isolation.readcommited.controller.CustomerController;
import com.pnakaj.spring.transaction.isolation.readcommited.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pankaj on 2/14/2017.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerController controller = context.getBean(CustomerController.class);
        controller.saveCustomer(new Customer("pankaj", 500));


        Thread thread2 = new Thread(() -> controller.getCustomerByName("pankaj"), "Thread 1");

        thread2.start();

        Thread thread1 = new Thread(() -> controller.updateCustomer(new Customer("pankaj", 999)), "Thread 2");
        try {
            thread1.sleep(2000);
        } catch (InterruptedException e) {
        }
        thread1.start();

    }

}

