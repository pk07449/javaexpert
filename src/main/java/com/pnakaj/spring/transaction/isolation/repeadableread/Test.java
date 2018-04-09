package com.pnakaj.spring.transaction.isolation.repeadableread;

import com.pnakaj.spring.transaction.isolation.repeadableread.controller.CustomerController;
import com.pnakaj.spring.transaction.isolation.repeadableread.domain.Customer;
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


        Thread thread1 = new Thread(new Thread(() -> controller.getCustomerByName("pankaj"), "Thread 2"));
        thread1.start();

        Thread thread2 = new Thread(() -> controller.updateCustomer(new Customer("pankaj", 1000)), "Thread 1");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        thread2.start();


        Thread thread3 = new Thread(new Thread(() -> controller.getCustomerByName("pankaj"), "Thread 2"));
        thread3.start();

    }

}

