//Basket.java
package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    public ArrayList<String> baskets;

    public Basket() {
        this.baskets = new ArrayList<>();
    }

    public boolean add(String bagel){
        return this.baskets.add(bagel);
    }

}
