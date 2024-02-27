package src.main.java.service;

import src.main.java.impl.Buy2Get1Strategy;

public class Jeans extends Product{
    public Jeans(){
        setShoppingDiscountStrategy(new Buy2Get1Strategy());
    }
}
