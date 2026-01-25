package com.collections.mapinterfaceshoppingcart;
import java.util.*;

public class ProductPriceSystem {

    Map<String, Integer> priceMap = new HashMap<>();
    Map<String, Integer> insertionOrderMap = new LinkedHashMap<>();

    public void addProduct(String product, int price) {
        priceMap.put(product, price);
        insertionOrderMap.put(product, price);
    }

    public void displayInsertionOrder() {
        for (Map.Entry<String, Integer> e : insertionOrderMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public void displaySortedByPrice() {

        TreeMap<Integer, List<String>> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Integer> e : priceMap.entrySet()) {
            sortedMap.putIfAbsent(e.getValue(), new ArrayList<>());
            sortedMap.get(e.getValue()).add(e.getKey());
        }

        for (Map.Entry<Integer, List<String>> e : sortedMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public static void main(String[] args) {

        ProductPriceSystem ps = new ProductPriceSystem();

        ps.addProduct("Laptop", 50000);
        ps.addProduct("Mobile", 20000);
        ps.addProduct("Tablet", 30000);
        ps.addProduct("Headphones", 20000);

        ps.displayInsertionOrder();
        ps.displaySortedByPrice();
    }
}
