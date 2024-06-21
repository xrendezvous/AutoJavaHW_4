package src.main.java.org.example.test;

import src.main.java.org.example.runtime.RuntimeCheckProcessor;
import src.main.java.org.example.uni.Student;

public class MainTest {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, "Computer Science", "CS-101");

        RuntimeCheckProcessor.process(student);
    }
}
