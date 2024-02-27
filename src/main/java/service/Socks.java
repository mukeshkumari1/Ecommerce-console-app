package src.main.java.service;

import src.main.java.impl.HalfPriceStrategy;

public class Socks extends Product{
    public Socks(){
        setShoppingDiscountStrategy(new HalfPriceStrategy());
    }
}
