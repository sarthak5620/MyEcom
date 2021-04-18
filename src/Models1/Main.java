package Models1;

import Models.*;

import java.util.*;
//import all needed methods from other package
import static Models.AddProduct.AddProducts;
import static Models.AddProduct.editProducts;
import static Models.CartConsole.addItemInCart;
import static Models.CartConsole.editCartItems;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Product> products = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        //All types of options you need to give in application:
        System.out.println("\nYou have the following options - ");
        System.out.println("\n1. Press 0 if you want to add a product to the product list.");
        System.out.println("2. Press 1 to edit any existing product in the list.");
        System.out.println("3. Press 2 to delete a product.");
        System.out.println("4. Press 3 to add an element in the cart.");
        System.out.println("5. Press 4 to remove an element from the cart.");
        System.out.println("6. Press 5 to edit an element from the cart.");
        System.out.println("7. Enter 6 to exit the application.");
        System.out.println();
        System.out.println("Choose option:");
        int choice = sc.nextInt();

        while(choice != 6){
            switch (choice){
                case 0:
                    //To add a product
                    AddProducts(products);
                    break;
                case 1:
                    //To edit a product
                    editProducts(products);
                    break;

                case 2 :
                    System.out.println("Enter the name of the product you want to delete: ");
                    String productName = sc.next();
                    if(products.containsKey(productName)){
                        products.remove(productName);
                        System.out.println("Deleted Successfully");
                    }
                    else{
                        System.out.println("The entered product is not in the list.");
                    }
                    break;

                case 3:
                    //Add items in cart
                    Cart cart = new Cart();
                    addItemInCart(cart, products);
                    break;

                case 4:
                    //Remove item in cart
                    System.out.println("Enter the name of product you want to remove - ");
                    productName = sc.next();
                    Cart cart1 = new Cart();
                    cart1.remove(products.get(productName));
                    System.out.println("Product removed successfully.");
                    break;

                case 5:
                    editCartItems(products);
                    break;
                default:
                    System.out.println("Enter a valid number!");
            }
            System.out.println("Enter you choice - ");
            choice = sc.nextInt();
        }
        System.out.println("Hope you liked it! Continue Shopping!!");
    }


}

