package model;

public class Course {
    private String title;
    private Student[]classList;
    private int studentCount;
    private Faculty faculty;

    public Course(String title, int maxStudent) {
        this.title = title;
        this.classList = new Student[maxStudent];
        this.studentCount = 0;
    }

    public void addStudent(Student s) {
        if (studentCount < classList.length) {
            classList[studentCount++] = s;
        }
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getTitle() {
        return title;
    }

    public Student[] getStudents() {
        return classList;
    }

    public Faculty getFaculty() {
        return faculty;
    }
}
