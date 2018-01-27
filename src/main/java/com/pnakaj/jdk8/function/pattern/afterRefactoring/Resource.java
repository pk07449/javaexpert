package com.pnakaj.jdk8.function.pattern.afterRefactoring;

import java.io.Closeable;
import java.util.function.Consumer;

/**
 * Created by pankaj on 1/27/2018.
 */
public class Resource implements Closeable
{
    private Resource() {
    }

    public void init() {
        System.out.println("Resource.init");
    }

    public void opt1() {
        System.out.println("Resource.opt1");
    }

    public void opt2() {
        System.out.println("Resource.opt2");
    }

    @Override
    public void close() {
        System.out.println("Resource.close");
    }

    public static void doOperation(Consumer<Resource> resourceConsumer) {
        try (Resource resource = new Resource()) {
            resource.init();
            resourceConsumer.accept(resource);
        }
    }
}

class ResourceTest {

    public static void main(String[] args) {
        Resource.doOperation(resource1 -> {
            resource1.opt1();
            resource1.opt2();
        });
    }
}
