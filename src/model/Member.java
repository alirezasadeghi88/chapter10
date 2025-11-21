package model;

public class Member {
    private String name;
    private Book[] borrowedBooks;
    private int bookCount;

    public Member(String name, int maxBooks) {
        this.name = name;
        this.borrowedBooks = new Book[maxBooks];
        this.bookCount = 0;
    }

    public void borrowBook(Book b) {
        if (bookCount < borrowedBooks.length) {
            borrowedBooks[bookCount++] = b;
            b.addBorrowers(this);//
        }
    }

    public String getName() {
        return name;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }
}
