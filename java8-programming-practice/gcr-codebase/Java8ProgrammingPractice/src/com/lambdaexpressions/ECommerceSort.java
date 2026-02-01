package com.lambdaexpressions;
import java.util.*;
public class ECommerceSort {

    public static void main(String[] args) {

        //Product list create
        List<Product> products = new ArrayList<>();

        products.add(new Product("Phone", 20000, 4.5, 10));
        products.add(new Product("Laptop", 60000, 4.7, 15));
        products.add(new Product("Headphones", 2000, 4.2, 20));

        //sorting logic
        products.sort((p1, p2) ->
            Double.compare(p1.price, p2.price)
        );

        //Print
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("----------------------");
        
        products.sort((p1, p2) ->
        	Double.compare(p2.rating, p1.rating)
        );
        
        //Print
        for (Product p : products) {
            System.out.println(p);
        }
        
        
        System.out.println("-------------By discount---------");
        
        products.sort((p1, p2) ->
        	Double.compare(p2.discount, p1.discount)
        );
        
        //Print
        for (Product p : products) {
            System.out.println(p);
        }
        
    }
}
