package com.foodloop;
import java.util.*;

public class FoodLoopApp {
    public static void main(String[] args) {

        FoodItem burger = new VegItem("Veg Burger", 150.0, 5);
        FoodItem chicken = new NonVegItem("Chicken Biryani", 350.0, 3);
        FoodItem pizza = new VegItem("Cheese Pizza", 400.0, 2);

        List<FoodItem> comboMeal = Arrays.asList(burger, chicken, pizza);

        Order order = new Order(comboMeal);
        order.placeOrder();
    }
}
