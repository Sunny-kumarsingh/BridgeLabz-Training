package com.collections.mapinterface.insurancepolicy;
import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {

    //HashMap -> fast access by policy number
    private Map<String, Policy> policyMap = new HashMap<>();

    //LinkedHashMap -> insertion order
    private Map<String, Policy> insertionOrderMap = new LinkedHashMap<>();

    //TreeMap -> sorted by expiry date
    private TreeMap<LocalDate, List<Policy>> expiryMap = new TreeMap<>();

    // Add policy
    public void addPolicy(Policy p) {
        policyMap.put(p.policyNumber, p);
        insertionOrderMap.put(p.policyNumber, p);

        expiryMap.putIfAbsent(p.expiryDate, new ArrayList<>());
        expiryMap.get(p.expiryDate).add(p);
    }

    // Retrieve policy by number
    public Policy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List policies expiring in next 30 days
    public void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Map.Entry<LocalDate, List<Policy>> entry : expiryMap.subMap(today, true, limit, true).entrySet()) {
            for (Policy p : entry.getValue()) {
                System.out.println(p);
            }
        }
    }

    // List policies by policyholder
    public void policiesByHolder(String name) {
        for (Policy p : policyMap.values()) {
            if (p.policyHolder.equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> it = policyMap.entrySet().iterator();
        while (it.hasNext()) {
            Policy p = it.next().getValue();
            if (p.expiryDate.isBefore(today)) {
                it.remove();
                insertionOrderMap.remove(p.policyNumber);
            }
        }

        expiryMap.headMap(today).clear();
    }
}
