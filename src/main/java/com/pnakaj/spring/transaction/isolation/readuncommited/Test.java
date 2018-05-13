package com.pnakaj.spring.transaction.isolation.readuncommited;

import com.pnakaj.spring.transaction.isolation.readuncommited.controller.CustomerController;
import com.pnakaj.spring.transaction.isolation.readuncommited.domain.Customer;
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


        Thread thread1 = new Thread(() -> controller.updateCustomer(new Customer("pankaj", 1000)), "Thread 1");
        thread1.start();

        Thread thread2 = new Thread(() -> controller.getCustomerByName("pankaj"), "Thread 2");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        thread2.start();
    }

}

