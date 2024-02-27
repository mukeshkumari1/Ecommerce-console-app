package src.main.java;

import src.main.java.service.Jeans;
import src.main.java.service.Product;
import src.main.java.service.Socks;
import src.main.java.service.TShirts;

public class ShoppingMain {
    public static void main(String[] args) {
        Product tShirts = new TShirts();
        tShirts.execute();
        Product jeans = new Jeans();
        jeans.execute();
        Product socks = new Socks();
        socks.execute();
    }
}
