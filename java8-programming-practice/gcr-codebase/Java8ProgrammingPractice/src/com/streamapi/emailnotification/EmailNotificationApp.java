package com.streamapi.emailnotification;

import java.util.Arrays;
import java.util.List;

public class EmailNotificationApp {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
            "sunny@gmail.com",
            "rahul@gmail.com",
            "amit@gmail.com",
            "neha@gmail.com"
        );

        //forEach with lambda
        emails.forEach(email -> sendEmailNotification(email));
    }

    //email sender method
    private static void sendEmailNotification(String email) {
        System.out.println("Notification email sent to: " + email);
    }
}
