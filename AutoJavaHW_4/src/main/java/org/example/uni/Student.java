package src.main.java.org.example.uni;

import src.main.java.org.example.annotations.RunTimeCheck;

public class Student extends person {
    @RunTimeCheck("перевірка курсу")
    private String course;

    @RunTimeCheck("перевірка групи")
    private String group;

    public Student(String name, int age, String course, String group) {
        super(name, age);
        this.course = course;
        this.group = group;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }
}
