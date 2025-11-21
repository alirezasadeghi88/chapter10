package test;

import model.Course;
import model.Faculty;
import model.Student;

public class Main {
    public static void main(String[] args) {
        Faculty profJafari = new Faculty("Dr. Jafari", 5);
        Student esmaeil = new Student("Esmaeil", 3);
        Student alireza = new Student("Alireza", 3);

        Course oop = new Course("OOP", 10);

        profJafari.addCourse(oop);
        esmaeil.addCourse(oop);
        alireza.addCourse(oop);

        System.out.println("Course: " + oop.getTitle());
        System.out.println("Taught by: " + oop.getFaculty().getName());
        System.out.println("Students enro+lled:");
        for (Student s : oop.getStudents()) {
            if (s != null)
                System.out.println("_" + s.getName());
        }
    }
}
