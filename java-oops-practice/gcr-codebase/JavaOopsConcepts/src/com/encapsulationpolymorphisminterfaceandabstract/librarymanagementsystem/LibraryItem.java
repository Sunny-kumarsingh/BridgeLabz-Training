package com.encapsulationpolymorphisminterfaceandabstract.librarymanagementsystem;

abstract class LibraryItem {

    // Encapsulation
    private int itemId;
    private String title;
    private String author;

    // Sensitive borrower data
    private String borrowerName;
    private boolean isAvailable = true;

    // Constructor
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Loan Days: " + getLoanDuration());
    }

    // Encapsulated borrower access
    protected void setBorrower(String name) {
        this.borrowerName = name;
        this.isAvailable = false;
    }

    protected boolean isAvailable() {
        return isAvailable;
    }
}
