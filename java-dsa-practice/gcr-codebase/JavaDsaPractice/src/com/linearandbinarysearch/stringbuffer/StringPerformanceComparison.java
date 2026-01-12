package com.linearandbinarysearch.stringbuffer;
public class StringPerformanceComparison {

    public static void main(String[] args) {

        int iterations = 1000000;

        // StringBuilder performance
        long startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("hello");
        }
        long endTime = System.nanoTime();
        long builderTime = endTime - startTime;

        // StringBuffer performance
        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("hello");
        }
        endTime = System.nanoTime();
        long bufferTime = endTime - startTime;

        // Output result
        System.out.println("StringBuilder Time: " + builderTime + " ns");
        System.out.println("StringBuffer Time : " + bufferTime + " ns");
    }
}
