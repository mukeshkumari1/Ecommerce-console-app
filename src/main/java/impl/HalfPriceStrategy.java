package src.main.java.impl;

import src.main.java.interfaces.ShoppingDiscountStrategy;

public class HalfPriceStrategy implements ShoppingDiscountStrategy {
    @Override
    public void purchase() {
        System.out.println("Got 50 % off on my purchase !!");
    }
}
