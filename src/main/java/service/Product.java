package src.main.java.service;

import src.main.java.interfaces.ShoppingDiscountStrategy;

public class Product {
    ShoppingDiscountStrategy shoppingDiscountStrategy;

    // set the strategy
    public void setShoppingDiscountStrategy(ShoppingDiscountStrategy shoppingDiscountStrategy) {
        this.shoppingDiscountStrategy = shoppingDiscountStrategy;
    }

    public void execute(){
        shoppingDiscountStrategy.purchase();
    }
}
