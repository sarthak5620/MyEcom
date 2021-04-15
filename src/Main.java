import Models.Cart;
import Models.Product;
import Models.Variant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Create Products
        Product apple = new Product("Apple","",80,1.0f),
                mango = new Product("Mango","",80,1.0f),
                orange = new Product("Orange", "", 60, 2f),
                kiwi =new Product("Kiwi","image",new ArrayList<>(
                        Arrays.asList(
                                new Variant("1kg",100),
                                new Variant("500g",60)
                        )
                )),
                Sugar = new Product("Sugar", "image",new ArrayList<>(
                        Collections.singletonList(new Variant("500g", 40))
                ));

        Cart cart = new Cart();
        //Adding items to our cart through list
        cart.add(apple,5f);
        cart.add(mango,3f);
        cart.add(orange,2.5f);
        cart.add(kiwi,kiwi.variants.get(1));
        cart.add(kiwi,kiwi.variants.get(0));
        cart.add(kiwi,kiwi.variants.get(1));
        cart.add(Sugar,Sugar.variants.get(0));
        cart.add(Sugar,Sugar.variants.get(0));
        System.out.println(cart);

        //Checking our remove methods
        cart.remove(apple);
        cart.remove(mango);
        cart.decrement(kiwi,kiwi.variants.get(1));
        //Checking our decrement method
        cart.decrement(Sugar,Sugar.variants.get(0));
        System.out.println(cart);
    }
}
