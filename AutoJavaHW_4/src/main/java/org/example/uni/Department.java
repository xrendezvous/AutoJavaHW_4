package src.main.java.org.example.uni;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private String course;
    private List<Student> students;
    private List<Teacher> teachers;

    public Department(String name) {
        this.name = name;
        this.course = course;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String getCourse() {
        return course;
    }

    public void setNameDepart(String newNameDepart){
        name = newNameDepart;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }
    public void changeStudent(String studentName, String newStudentName){
        Student student = findStudentByName(studentName);
        if (student != null){
            student.setName(newStudentName);
            System.out.println("Students name updated");
        }else{
            System.out.println("Student not found");
        }
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }
    public void changeTeacher(String teacherName, String newTeacherName){
        Teacher teacher = findTeacherByName(teacherName);
        if (teacher != null){
            teacher.setName(newTeacherName);
            System.out.println("Teachers name updated");
        }else{
            System.out.println("Teacher not found");
        }
    }

    public List<person> getAllPeople() {
        List<person> people = new ArrayList<>();
        people.addAll(students);
        people.addAll(teachers);
        return people;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public List<Student> findStudentsByName(String name) {
        List<Student> studentsByName = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                studentsByName.add(student);
            }
        }
        return studentsByName;
    }
    public Teacher findTeacherByName(String name) {
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }

    public List<Teacher> findTeachersByName(String name) {
        List<Teacher> teachersByName = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                teachersByName.add(teacher);
            }
        }
        return teachersByName;
    }
    public Student findStudentByCourse(String course) {
        for (Student student : students) {
            if (student.getCourse().equals(course)) {
                return student;
            }
        }
        return null;
    }
    public List<Student> getStudentsByCourse(String course) {
        List<Student> studentsByCourse = new ArrayList<>();
        for (Student student : students) {
            if (student.getCourse().equals(course)) {
                studentsByCourse.add(student);
            }
        }
        return studentsByCourse;
    }
    public Student findStudentByGroup(String group) {
        for (Student student : students) {
            if (student.getCourse().equals(group)) {
                return student;
            }
        }
        return null;
    }
    public List<Student> getStudentsByGroup(String group) {
        List<Student> studentsByGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                studentsByGroup.add(student);
            }
        }
        return studentsByGroup;
    }
}
