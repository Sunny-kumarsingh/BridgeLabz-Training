package com.budgetwise;
import java.util.Map;

public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit, Map<String, Double> categoryLimits) {
        super(income, limit, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("? Monthly Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + totalExpenses());
        System.out.println("Savings: " + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        if (totalExpenses() > limit) {
            System.out.println("Monthly budget exceeded!");
        } else {
            System.out.println("Monthly spending within limit.");
        }
    }
}
