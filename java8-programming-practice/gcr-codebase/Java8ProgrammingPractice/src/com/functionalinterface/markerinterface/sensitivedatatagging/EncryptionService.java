package com.functionalinterface.markerinterface.sensitivedatatagging;
public class EncryptionService {

    public static void encryptIfSensitive(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("No encryption required");
        }
    }
}
