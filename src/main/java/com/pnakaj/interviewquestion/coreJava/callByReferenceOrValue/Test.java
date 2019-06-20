package com.pnakaj.interviewquestion.coreJava.callByReferenceOrValue;

/**
 * Created by pankaj on 6/20/2019.
 */

public class Test {
    //Question: java is call by reference or call by value ?
    //Ans : call By value
    public static void main(String[] args) {
        Hello hello = new Hello(10,"pankaj");
        Hello hello1 = hello;
        hello = new Hello(20,"kumar");

        System.out.println(hello);
        System.out.println(hello1);
    }
}

class Hello {
 int i ;
 String abc;

    @Override
    public String toString() {
        return "Hello{" +
                "i=" + i +
                ", abc='" + abc + '\'' +
                '}';
    }

    public Hello(int i, String abc) {
        this.i = i;
        this.abc = abc;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }
}


