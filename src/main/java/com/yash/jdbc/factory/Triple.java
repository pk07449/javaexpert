package com.yash.jdbc.factory;

/**
 * Created by pankaj on 2/24/2017.
 */
public class Triple<T1, T2, T3> {
    private T1 t1;
    private T2 t2;
    private T3 t3;

    public Triple(T1 t1,T2 t2, T3 t3) {
       this.t1 = t1;
       this.t2 = t2;
       this.t3 = t3;
    }

    public T1 _1() {
        return t1;
    }

    public T2 _2() {
        return t2;
    }

    public T3 _3() {
        return t3;
    }
}
