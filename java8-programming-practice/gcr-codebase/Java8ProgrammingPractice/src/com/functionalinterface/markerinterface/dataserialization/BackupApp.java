package com.functionalinterface.markerinterface.dataserialization;
public class BackupApp {

    public static void main(String[] args) {

        UserData user = new UserData("Sunny", 22);
        TempSession session = new TempSession("ABC123");

        BackupService.processBackup(user);
        BackupService.processBackup(session);
    }
}
