package com.budgetwise;
import java.util.HashMap;
import java.util.Map;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Map<String, Double> categories = new HashMap<>();
        categories.put("Food", 5000.0);
        categories.put("Travel", 3000.0);
        categories.put("Shopping", 4000.0);

        Budget monthly = new MonthlyBudget(20000, 15000, categories);
        Budget annual = new AnnualBudget(240000, 180000, categories);

        monthly.addExpense(4000, "Food");
        monthly.addExpense(6000, "Shopping");

        annual.addExpense(50000, "Travel");

        // Polymorphism
        monthly.generateReport();
        monthly.detectOverspend();

        System.out.println();

        annual.generateReport();
        annual.detectOverspend();
    }
}
