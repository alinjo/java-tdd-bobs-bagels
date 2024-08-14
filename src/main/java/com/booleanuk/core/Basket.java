//Basket.java
package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    public ArrayList<String> baskets;
    private int capacity;

    public Basket() {
        this.baskets = new ArrayList<>();
        this.capacity = 2;
    }

    public boolean add(String bagel){
        return this.baskets.add(bagel);
    }

    public boolean remove(String bagel){
        return this.baskets.remove(bagel);
    }

    public boolean IsFull() {
        return this.baskets.size() >= this.capacity;
    }
}
