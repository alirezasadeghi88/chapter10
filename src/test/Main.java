package test;

//import model.Course;
//import model.Faculty;
//import model.Student;

import model.*;

public class Main {
    public static void main(String[] args) {
//        Faculty profJafari = new Faculty("Dr. Jafari", 5);
//        Student esmaeil = new Student("Esmaeil", 3);
//        Student alireza = new Student("Alireza", 3);
//
//        Course oop = new Course("OOP", 10);
//
//        profJafari.addCourse(oop);
//        esmaeil.addCourse(oop);
//        alireza.addCourse(oop);
//
//        System.out.println("Course: " + oop.getTitle());
//        System.out.println("Taught by: " + oop.getFaculty().getName());
//        System.out.println("Students enro+lled:");
//        for (Student s : oop.getStudents()) {
//            if (s != null)
//                System.out.println("_" + s.getName());
//        }
//        Librarian sara = new Librarian("Sara", 5);
//        Member esmaeil = new Member("Esmaeil", 3);
//        Member alireza = new Member("Alireza", 3);
//
//        Book javaBook = new Book("Java Basics", 10);
//
//        sara.manageBook(javaBook);
//        esmaeil.borrowBook(javaBook);
//        alireza.borrowBook(javaBook);
//
//        System.out.println("Book" + javaBook.getTitle());
//        System.out.println("Managed by:" + javaBook.getLibrarian().getName());
//        System.out.println("Borrowed by:");
//        for (Member m: javaBook.getBorrowers()) {
//            if (m != null)
//                System.out.println("_" + m.getName());
//        }

        Seller ali = new Seller("Ali", 5);
        Customer esmaeil = new Customer("Esmaeil", 3);
        Customer alireza = new Customer("Alireza", 3);

        Product laptop = new Product("Laptop", 10);

        ali.OfferProducts(laptop);
        esmaeil.buyProduct(laptop);
        alireza.buyProduct(laptop);

        System.out.println("Product" + laptop.getTitle());
        System.out.println("Sold by" + laptop.getSeller().getName());
        System.out.println("Buyers");
        for (Customer c : laptop.getBuyers()) {
            if (c != null)
                System.out.println("_" + c.getName());
        }
    }
}
