package src.main.java.service;

import src.main.java.impl.Buy1Get1Strategy;

public class TShirts extends Product{
    public TShirts(){
        setShoppingDiscountStrategy(new Buy1Get1Strategy());
    }
}
