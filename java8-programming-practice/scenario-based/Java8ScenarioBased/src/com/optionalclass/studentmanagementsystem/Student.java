package com.optionalclass.studentmanagementsystem;

import java.util.Optional;

public class Student {
	String name;
	String email;
	String phone;
	int id;
	String address;
    String nickname; 
	
    public Student(int id, String name, String email,
            String phone, String address, String nickname) {
		 this.id = id;
		 this.name = name;
		 this.email = email;
		 this.phone = phone;
		 this.address = address;
		 this.nickname = nickname;
    }
	
	public String getName() {
		return  name;
	}
	
	public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
	
	public Optional<String> getPhone() {
        return Optional.ofNullable(phone);
    }
	
	public Optional<String> getAddress() {
	    return Optional.ofNullable(address);
	}
	 
	public Optional<String> getNickname() {
	    return Optional.ofNullable(nickname);
	}
	
	public int getId() {
		return  id;
	}
	
}
