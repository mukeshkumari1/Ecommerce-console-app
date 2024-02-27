package src.main.java.service;

import src.main.java.impl.TwentyOffStrategy;

public class Cap extends Product{
    Cap(){
        setShoppingDiscountStrategy(new TwentyOffStrategy());
    }
}
