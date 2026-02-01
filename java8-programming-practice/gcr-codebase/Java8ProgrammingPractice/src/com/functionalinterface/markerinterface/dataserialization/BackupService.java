package com.functionalinterface.markerinterfacedataserialization;
public class BackupService {

    public static void processBackup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Object is backed up");
        } else {
            System.out.println("Object is NOT eligible for backup");
        }
    }
}
