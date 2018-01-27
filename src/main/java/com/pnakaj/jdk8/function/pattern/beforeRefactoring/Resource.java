package com.pnakaj.jdk8.function.pattern.beforeRefactoring;

/**
 * Created by pankaj on 1/27/2018.
 */
public class Resource {

    public void init(){
        System.out.println("Resource.init");
    }

    public void opt1(){
        System.out.println("Resource.opt1");
    }
    public void opt2(){
        System.out.println("Resource.opt2");
    }

    public void close(){
        System.out.println("Resource.close");
    }

}

class ResourceTest {

    public static void main(String[] args) {
        Resource resource = new Resource();
        resource.init();
        resource.opt1();
        resource.opt2();
        resource.close();
    }
}
