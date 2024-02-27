package src.main.java.impl;

import src.main.java.interfaces.ShoppingDiscountStrategy;

public class Buy1Get1Strategy implements ShoppingDiscountStrategy {
    @Override
    public void purchase() {
        System.out.println("Got a discount of Buy 1 Get 1 on my purchase!!");
    }
}
