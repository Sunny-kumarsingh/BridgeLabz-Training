package com.streamapi.stockpricelogger;

import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
            1025.50,
            1030.75,
            1018.20,
            1042.90,
            1035.10
        );

        // Display all stock prices
        stockPrices.stream()
                   .forEach(price ->
                       System.out.println("Stock Price: ₹" + price)
                   );
    }
}
