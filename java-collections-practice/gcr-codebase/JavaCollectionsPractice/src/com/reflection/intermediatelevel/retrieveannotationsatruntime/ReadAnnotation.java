package com.reflection.intermediatelevel.retrieveannotationsatruntime;
public class ReadAnnotation {

    public static void main(String[] args) {

        Class<Book> cls = Book.class;

        if (cls.isAnnotationPresent(Author.class)) {

            Author author = cls.getAnnotation(Author.class);

            System.out.println("Author Name : " + author.name());
            System.out.println("Author Value: " + author.value());
        }
    }
}
