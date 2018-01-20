package com.pnakaj.junit.shoping.cart.tdd.patterns.solid.srp.afterrefactor;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by pankaj on 1/20/2018.
 */
public class BookTest {


    private Book book;

    @Before
    public void before() throws Exception {
        List<String> pages = new ArrayList();
        pages.add("Page 1 Content");
        pages.add("Page 2 Content");
        pages.add("Page 3 Content");
        pages.add("Page 4 Content");
        book = new Book("Tdd Book", "Yash", pages);
    }

    @Test
    public void shouldAssertTestTitle() throws Exception {
        assertEquals("Tdd Book", book.getTitle());
    }

    @Test
    public void shouldAssertTestAuthor() throws Exception {
        assertEquals("Yash", book.getAuthor());
    }

    @Test
    public void getCurrentPageDoesNotGoPassLastPage() throws Exception {
        book.turnPage(); //now on page 2
        book.turnPage(); //now on page 3
        book.turnPage(); //now on page 4
        book.turnPage(); //still on page 4

        assertEquals(4, book.getCurrentPage());
    }
}