package com.pnakaj.thread;

/**
 * Created by pankaj on 6/16/2017.
 */
public class SomeClass {
    private int someId;
    private String someName;

    public SomeClass(int someId, String someName) {
        this.someId = someId;
        this.someName = someName;
    }

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public int getSomeId() {

        return someId;
    }

    public void setSomeId(int someId) {
        this.someId = someId;
    }

    @Override
    public String toString() {
        return getSomeId() + getSomeName();
    }
}
