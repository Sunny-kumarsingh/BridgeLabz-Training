package com.EduMentor;

import java.util.Scanner;

public class EduMentorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Instructor instructor = new Instructor("Naman", "namankumar0727@gmail.com", 27);
        instructor.createCourse();
        
        // Take Learner Details
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Course Type (short / full): ");
        String courseType = sc.nextLine();

        // Create Learner
        Learner learner = new Learner(name, email, userId, courseType);

        // Select Quiz Difficulty
        System.out.print("Select Quiz Difficulty (easy / medium / hard): ");
        String difficulty = sc.nextLine();

        Quiz quiz = new Quiz(difficulty);

        // Start Quiz (user input inside Quiz class)
        quiz.startQuiz();

        // Calculate Result
        double percentage = quiz.calculatePercentage();
        learner.setPercentage(percentage);

        System.out.println("\nFinal Score Percentage: " + percentage + "%");

        // Certificate Decision
        if (percentage >= 33) {
            learner.generateCertificate();
        } else {
            System.out.println(" Sorry, you are not qualified for certificate.");
        }

    }
}