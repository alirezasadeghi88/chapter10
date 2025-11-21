package model;

public class Faculty {
    private String name;
    private Course[] courseList;
    private int courseCount;

    public Faculty(String name, int maxCourses) {
        this.name = name;
        this.courseList = new Course[maxCourses];
        this.courseCount = 0;
    }

    public void addCourse(Course c) {
        if (courseCount < courseList.length) {
            courseList[courseCount++] = c;
            c.setFaculty(this);//
        }
    }

    public String getName() {
        return name;
    }

    public Course[] getCourseList() {
        return courseList;
    }
}
