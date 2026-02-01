package com.functionalinterface.markerinterfacedataserialization;
public class UserData implements BackupSerializable {

    String username;
    int age;

    public UserData(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
