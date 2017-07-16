package com.pnakaj.spring.mvc;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static com.pnakaj.spring.mvc.AppConfig.i1.a;

/**
 * Created by pankaj on 7/15/2017.
 */



@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter{

    public static void main(String[] args) {

    }

    interface i1 {
        int a =10;
       void m1();
    }

    interface  i2 {
        int a =10;
       void m1();
    }

    class Hello implements i1, i2 {

        @Override
        public void m1() {
        }
    }


}
