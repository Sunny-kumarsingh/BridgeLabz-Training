package com.reflection.Advancedlevel.customlogging;
import java.lang.reflect.Proxy;

public class ProxyDemo {

    public static void main(String[] args) {

        Greeting realObject = new GreetingImpl();

        Greeting proxyObject = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingInvocationHandler(realObject)
        );

        // Call method via proxy
        proxyObject.sayHello("Sunny");
    }
}
