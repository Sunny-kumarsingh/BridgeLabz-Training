package com.collections.queueinterface.bankingsystem;
import java.util.*;

public class BankingSystem {

    Map<String, Integer> accounts = new HashMap<>();
    Queue<String[]> withdrawalQueue = new LinkedList<>();

    void addAccount(String accNo, int balance) {
        accounts.put(accNo, balance);
    }

    void requestWithdrawal(String accNo, int amount) {
        withdrawalQueue.add(new String[]{accNo, String.valueOf(amount)});
    }

    void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String[] r = withdrawalQueue.poll();
            String acc = r[0];
            int amt = Integer.parseInt(r[1]);

            if (accounts.containsKey(acc) && accounts.get(acc) >= amt) {
                accounts.put(acc, accounts.get(acc) - amt);
            }
        }
    }

    void displaySortedByBalance() {
        TreeMap<Integer, List<String>> tm = new TreeMap<>();

        for (Map.Entry<String, Integer> e : accounts.entrySet()) {
            tm.putIfAbsent(e.getValue(), new ArrayList<>());
            tm.get(e.getValue()).add(e.getKey());
        }

        for (Map.Entry<Integer, List<String>> e : tm.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public static void main(String[] args) {

        BankingSystem b = new BankingSystem();

        b.addAccount("A101", 5000);
        b.addAccount("A102", 3000);
        b.addAccount("A103", 7000);

        b.requestWithdrawal("A101", 1000);
        b.requestWithdrawal("A102", 500);

        b.processWithdrawals();
        b.displaySortedByBalance();
    }
}
