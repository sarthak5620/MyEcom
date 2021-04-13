import Models.Product;
import Models.Variant;
import Models.VariantBasedProduct;
import Models.WeightBasedProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product Mango = new WeightBasedProduct("Mango","Mango.jp",150,1.0f);
        Product Sugar = new VariantBasedProduct("Sugar","Sugar.jp",new ArrayList<>(
                Arrays.asList(
                        new Variant("1kg",23),
                        new Variant("5kg",120)
                )
        ));
        System.out.println(Mango);
        System.out.println(Sugar);
        //Add these products in List
        List<Product> products = new ArrayList<>(
                Arrays.asList(
                        new WeightBasedProduct("Apple","Apple.jp",80,1.0f),
                        new WeightBasedProduct("Orange","Orange.jp",100,1.5f),
                        new VariantBasedProduct("Salt","SaltPck.jp",new ArrayList<>(
                                Arrays.asList(new Variant("3kg",90),
                                        new Variant("1kg",40)
                                )
                        ))
                )
        );
        //Print all products in a single list...
        System.out.println(products);
        Product product1=new Product("Apple","aa.jpp");
        Product product2=new Product("Apple","aa.jpp");
        //check hashcode and equals of product
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product2.equals(product1));
    }
}
