package src.main.java.org.example.uni;

import src.main.java.org.example.annotations.RunTimeCheck;

import java.util.ArrayList;
import java.util.List;
class Faculty {
    private String name;

    @RunTimeCheck("перевірка списку кафедр")
    private List<Department> departments;

    public Faculty(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setNameFaculty(String newNameFaculty){
        name = newNameFaculty;
    }

    public void createDepartment(String name) {
        departments.add(new Department(name));
    }

    public void deleteDepartment(Department department) {
        departments.remove(department);
    }
    public void changeDepartment(String departName, String newDepartName){
        Department department = findDepartment(departName);
        if (department != null){
            department.setNameDepart(newDepartName);
            System.out.println("Department name updated");
        }else{
            System.out.println("Department not found");
        }
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public Department findDepartment(String name) {
        for (Department department : departments) {
            if (department.getName().equals(name)) {
                return department;
            }
        }
        return null;
    }

    public List<person> getAllPeople() {
        List<person> people = new ArrayList<>();
        for (Department department : departments) {
            people.addAll(department.getAllPeople());
        }
        return people;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (Department department : departments) {
            students.addAll(department.getStudents());
        }
        return students;
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        for (Department department : departments) {
            teachers.addAll(department.getTeachers());
        }
        return teachers;
    }
}
