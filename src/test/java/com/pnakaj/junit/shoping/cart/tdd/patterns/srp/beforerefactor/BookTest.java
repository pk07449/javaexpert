package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor;

import com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.srp.beforerefactor.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by pankaj on 1/20/2018.
 */
public class BookTest {

    @Test
    public void testBook() throws Exception {
        List<String> pages = new ArrayList();
        pages.add("Page 1 Content");
        pages.add("Page 2 Content");
        pages.add("Page 3 Content");
        pages.add("Page 4 Content");

        Book book = new Book("Tdd Book", "Yash", pages);

        Assert.assertEquals("Tdd Book", book.getTitle());
        Assert.assertEquals("Yash", book.getAuthor());

        book.turnPage();
        assertEquals(1, book.getCurrentPage());

        book.turnPage();
        assertEquals(2, book.getCurrentPage());

        book.turnPage();
        assertEquals(3, book.getCurrentPage());

        book.turnPage();
        assertEquals(4, book.getCurrentPage());

        book.turnPage();
        assertEquals(4, book.getCurrentPage());
//
        assertEquals("<div class='page'>Page 4 Content</div>", book.printCurrentPage("html"));
        assertEquals("Page 4 Content", book.printCurrentPage("plainText"));
    }
}