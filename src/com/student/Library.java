package com.student;

public class Library {
    private int borrowedBooks;     // hidden
    private final int MAX_BOOKS = 5;

    public void borrowBook() {
        if (borrowedBooks < MAX_BOOKS) {
            borrowedBooks++;
            System.out.println("Book borrowed. Total borrowed: " + borrowedBooks);
        } else {
            System.out.println("Cannot borrow more than " + MAX_BOOKS + " books.");
        }
    }

    public void returnBook() {
        if (borrowedBooks > 0) {
            borrowedBooks--;
            System.out.println("Book returned. Total borrowed: " + borrowedBooks);
        } else {
            System.out.println("No books to return.");
        }
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }
}
