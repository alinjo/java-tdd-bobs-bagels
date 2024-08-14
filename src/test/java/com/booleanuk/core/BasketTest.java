// BasketTest.java
package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {

    ArrayList<String> baskets;

    @Test
    public void testAddBagel() {

        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("bagel1"));

    }

    @Test
    public void testRemoveBagel() {

        Basket basket = new Basket();
        basket.add("bagel1");
        Assertions.assertTrue(basket.remove("bagel1"));

    }
}
