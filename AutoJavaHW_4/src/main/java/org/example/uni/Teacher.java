package src.main.java.org.example.uni;

import src.main.java.org.example.annotations.RunTimeCheck;

public class Teacher extends person {
    @RunTimeCheck("перевірка кафедри")
    private String department;

    public Teacher(String name, int age) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
