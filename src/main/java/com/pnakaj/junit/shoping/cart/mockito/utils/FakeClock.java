package com.pnakaj.junit.shoping.cart.mockito.utils;

import java.util.Date;

/**
 * Created by pankaj on 1/18/2018.
 */
public class FakeClock extends InstantClock {
    private Date date;
    public FakeClock(long time) {
        date = new Date(time);
    }

    @Override
    public Date now() {
        return date;
    }
}