// BasketTest.java
package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {

    ArrayList<String> baskets;

    public BasketTest(){
        this.baskets = new ArrayList<>();
        this.baskets.add("Bagel1");
        this.baskets.add("Bagel2");
    }

    @Test
    public void testAddBagel() {

    Basket basket = new Basket();
    Assertions.assertFalse(basket.add(baskets, ""));
    }

}
