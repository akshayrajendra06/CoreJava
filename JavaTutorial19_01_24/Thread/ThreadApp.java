package com.JavaTutorial19_01_24.Thread;

public class ThreadApp {

    public static void main(String[] args) {

        WebsiteModule offers = new WebsiteModule("offers");
        WebsiteModule sales = new WebsiteModule("sales");
        WebsiteModule recentSearches = new WebsiteModule("recentSearches");

        offers.start();
        sales.start();
        recentSearches.start();
        throw new RuntimeException();

    }

}

