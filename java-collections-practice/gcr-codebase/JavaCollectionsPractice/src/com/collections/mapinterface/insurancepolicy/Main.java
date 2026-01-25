package com.collections.mapinterface.insurancepolicy;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        InsurancePolicyManager manager = new InsurancePolicyManager();

        manager.addPolicy(new Policy("P101", "Alice",
                LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P102", "Bob",
                LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P103", "Alice",
                LocalDate.now().minusDays(5)));

        System.out.println("Retrieve Policy P101:");
        System.out.println(manager.getPolicy("P101"));

        System.out.println("\nPolicies expiring in next 30 days:");
        manager.policiesExpiringSoon();

        System.out.println("\nPolicies for Alice:");
        manager.policiesByHolder("Alice");

        System.out.println("\nRemoving expired policies...");
        manager.removeExpiredPolicies();
    }
}
