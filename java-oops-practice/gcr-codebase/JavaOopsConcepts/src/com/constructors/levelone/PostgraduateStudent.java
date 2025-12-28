package com.constructors.levelone;

class PostgraduateStudent extends Student {

    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void displayPGStudent() {
        System.out.println("Roll Number     : " + rollNumber);
        System.out.println("Name            : " + name);      
        System.out.println("CGPA            : " + getCGPA());  
        System.out.println("Specialization  : " + specialization);
    }

    public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(
                101, "Raj", 8.5, "Computer Science"
        );

        pg.displayPGStudent();

        // Modifying CGPA using public setter
        pg.setCGPA(9.0);

        System.out.println("\nAfter CGPA Update:");
        pg.displayPGStudent();
    }
}

