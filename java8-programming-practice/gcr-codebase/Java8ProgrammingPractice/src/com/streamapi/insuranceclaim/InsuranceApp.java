package com.streamapi.insuranceclaim;
import java.util.*;
import java.util.stream.Collectors;

public class InsuranceApp {

    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 50000),
            new Claim("Health", 30000),
            new Claim("Vehicle", 20000),
            new Claim("Vehicle", 40000),
            new Claim("Life", 100000)
        );

        Map<String, Double> avgClaimAmount =
            claims.stream()
                  .collect(
                      Collectors.groupingBy(
                          Claim::getClaimType,
                          Collectors.averagingDouble(Claim::getAmount)
                      )
                  );

        avgClaimAmount.forEach((type, avg) ->
            System.out.println(type + " -> Average Claim: " + avg)
        );
    }
}
