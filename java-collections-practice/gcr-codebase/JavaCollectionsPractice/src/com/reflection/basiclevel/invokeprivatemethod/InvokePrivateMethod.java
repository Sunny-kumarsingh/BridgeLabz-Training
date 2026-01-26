package com.reflection.basiclevel.invokeprivatemethod;
import java.lang.reflect.Method;

public class InvokePrivateMethod {

    public static void main(String[] args) {

        try {
            // Create object
            Calculator calculator = new Calculator();

            // Get Class object
            Class<?> cls = calculator.getClass();

            // Access private method "multiply"
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            // Make private method accessible
            method.setAccessible(true);

            // Invoke method
            int result = (int) method.invoke(calculator, 5, 4);

            // Display result
            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
