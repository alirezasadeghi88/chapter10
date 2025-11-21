package model;

public class Book {
    private String title;
    private Member[]borrowers;
    private int borrowerCount;
    private Librarian librarian;

    public Book(String title, int maxBorrowers) {
        this.title = title;
        this.borrowers = new Member[maxBorrowers];
        this.borrowerCount = 0;
    }

    public void addBorrowers(Member m) {
        if (borrowerCount < borrowers.length) {
            borrowers[borrowerCount++] = m;
        }
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public String getTitle() {
        return title;
    }

    public Member[] getBorrowers() {
        return borrowers;
    }

    public Librarian getLibrarian() {
        return librarian;
    }
}
