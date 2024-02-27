package src.main.java.impl;

import src.main.java.interfaces.ShoppingDiscountStrategy;

public class TwentyOffStrategy implements ShoppingDiscountStrategy {
    @Override
    public void purchase() {
        System.out.println("Got a 20 % off discount on my purchase!!");
    }
}
