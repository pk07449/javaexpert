package com.pnakaj.oops.override;

import java.io.IOException;

/**
 * Created by pankaj on 3/10/2018.
 */

public class WithoutAddSuperClassExceptionInSubClass {

    public static void main(String[] args) throws Exception {
        Hello hello = new Hai();
        hello.m1();
    }
}

class Hello {
    public void m1() throws Exception  {
        System.out.println("Hello.m1");
    }
}

class Hai extends Hello {
    public void m1() {
        System.out.println("Hai.m1");
    }
}