package com.optionalclass.studentmanagementsystem;

import java.util.Optional;

public class StudentService {

	public static void main(String[] args) {
		Student student = new Student( 101,
                "Rahul",
                null,             
                null,              
                "Delhi",
                null 
        );
		
		student.getEmail().ifPresentOrElse(
				email -> System.out.println("Email " + email),
				() -> System.out.println("Email not available")
		);
		
		student.getPhone().ifPresentOrElse(
				phone -> System.out.println("Phone Number" + phone),
				() -> System.out.println("123445678")
		);
		
		Optional.of(student.getId()).ifPresentOrElse(
				id -> System.out.println("Id  " + id),
				() -> System.out.println("Student not avaliable")
		);
		
		System.out.println(student.getAddress().isPresent());
		student.getNickname().ifPresentOrElse(
				name -> System.out.println("NickName is " + name),
				() -> System.out.println(student.getName())
				);

	}

}
