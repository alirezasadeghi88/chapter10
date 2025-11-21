package model;

public class Librarian {
    private String name;
    private Book[]manageBooks;
    private int bookCount;

    public Librarian(String name, int maxBooks) {
        this.name = name;
        this.manageBooks = new Book[maxBooks];
        this.bookCount = 0;
    }

    public void manageBook(Book b) {
        if (bookCount < manageBooks.length) {
            manageBooks[bookCount++] = b;
            b.setLibrarian(this);//
        }
    }

    public String getName() {
        return name;
    }

    public Book[] getManageBooks() {
        return manageBooks;
    }


}
