package com.EduMentor;

import java.util.Scanner;

class Quiz {

    // Private Question Bank (Encapsulation)
    private String[] questions = {
        "1. Which keyword is used to inherit a class in Java?",
        "2. Which method is the entry point of Java program?",
        "3. Which data type is used to store decimal values?",
        "4. Which concept allows multiple forms in Java?",
        "5. Which operator is used to compare values?"
    };

    private String[][] options = {
        {"a) this", "b) super", "c) extends", "d) implements"},
        {"a) start()", "b) main()", "c) run()", "d) init()"},
        {"a) int", "b) float", "c) char", "d) boolean"},
        {"a) Inheritance", "b) Encapsulation", "c) Polymorphism", "d) Abstraction"},
        {"a) =", "b) !=", "c) ==", "d) >"}
    };

    // Answers cannot be modified once set
    private final char[] answers = {'c', 'b', 'b', 'c', 'c'};

    private int score;
    private Scanner sc = new Scanner(System.in);

    // Constructor with Difficulty
    public Quiz(String difficulty) {
        System.out.println("Quiz Difficulty: " + difficulty.toUpperCase());
    }

    // Quiz Logic Method
    public void startQuiz() {
    	
        System.out.println("--------- Quiz Started -----------");
        
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            switch (userAnswer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct Answer!");
                        score++;
                    } else {
                        System.out.println("Wrong Answer!");
                    }
                    break;

                default:
                    System.out.println("Invalid Option!");
            }
        }
    }

    // Operator usage for percentage
    public double calculatePercentage() {
        return (score * 100.0) / questions.length;
    }

    public int getScore() {
        return score;
    }
}