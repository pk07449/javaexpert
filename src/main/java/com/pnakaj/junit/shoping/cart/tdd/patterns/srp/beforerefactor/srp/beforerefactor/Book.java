package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.srp.beforerefactor;

import java.util.List;

/**
 * Created by pankaj on 1/20/2018.
 */
public class Book {
    private String title;
    private String author;
    private List<String> pages;
    private int currentPageIndex = 0;

    public Book(String title, String author, List<String> pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCurrentPage() {
        return currentPageIndex;
    }

    public void turnPage() {
        if (currentPageIndex < pages.size()) {
            currentPageIndex++;
        }
    }

    public String printCurrentPage(String displayType) {
        if (displayType.equals("plainText")) {
            return pages.get(currentPageIndex - 1);
        } else if (displayType.equals("html")) {
            return "<div class='page'>" + pages.get(currentPageIndex - 1) + "</div>";
        }
        return "UnknownType";
    }
}
