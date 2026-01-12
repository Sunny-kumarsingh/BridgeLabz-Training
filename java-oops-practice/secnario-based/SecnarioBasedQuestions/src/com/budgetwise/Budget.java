package com.budgetwise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;

    // Encapsulated expense storage
    private List<Transaction> transactions;

    protected Map<String, Double> categoryLimits;

    public Budget(double income, double limit, Map<String, Double> categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    // Controlled access (Encapsulation)
    public void addExpense(double amount, String category) {
        transactions.add(new Transaction(amount, "EXPENSE", category));
    }

    public void addIncome(double amount) {
        transactions.add(new Transaction(amount, "INCOME", "General"));
        income += amount;
    }

    protected double totalExpenses() {
        double sum = 0;
        for (Transaction t : transactions) {
            if (t.getType().equals("EXPENSE")) {
                sum += t.getAmount();
            }
        }
        return sum;
    }

    // Operator usage
    public double calculateSavings() {
        return income - totalExpenses();
    }
}
