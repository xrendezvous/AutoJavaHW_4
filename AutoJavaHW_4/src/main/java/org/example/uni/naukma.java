package src.main.java.org.example.uni;

import java.util.ArrayList;
import java.util.List;

class naukma {
    private ArrayList<Faculty> faculties;
    private ArrayList<Department> departments;
    private String course;

    public naukma() {
        faculties = new ArrayList<>();
        departments = new ArrayList<>();
    }


    public void createFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void deleteFaculty(Faculty faculty) {
        faculties.remove(faculty);
    }

    public void changeFaculty(String facultyName, String newFacultyName) {
        Faculty faculty = findFaculty(facultyName);
        if (faculty != null) {
            faculty.setNameFaculty(newFacultyName);
            System.out.println("src.main.java.Faculty name updated");
        } else {
            System.out.println("src.main.java.Faculty not found");
        }
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public Faculty getFaculty(String name) {
        for (Faculty faculty : faculties) {
            if (faculty.getName().equals(name)) {
                return faculty;
            }
        }
        return null;
    }

    public Department getDepartment(String name) {
        for (Department department : departments) {
            if (department.getName().equals(name)) {
                return department;
            }
        }
        return null;
    }

    public Faculty findFaculty(String name) {
        for (Faculty faculty : faculties) {
            if (faculty.getName().equals(name)) {
                return faculty;
            }
        }
        return null;
    }


    public void listStudTeachAlphabetFaculty(Faculty name) {
        for (Faculty faculty : faculties) {
            System.out.println("src.main.java.Faculty: " + faculty.getName());
            List<person> people = faculty.getAllPeople();
            int n = people.size();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n; j++) {
                    String name1 = people.get(i).getName();
                    String name2 = people.get(j).getName();
                    int k = 0;
                    while (k < name1.length() && k < name2.length()
                            && name1.charAt(k) == name2.charAt(k)) {

                        k++;
                    }
                    if (k < name1.length() && k < name2.length()
                            && name1.charAt(k) > name2.charAt(k)) {
                        person temp = people.get(i);
                        people.set(i, people.get(j));
                        people.set(j, temp);
                    }
                }
            }
            for (person person : people) {
                System.out.println(person.toString());
            }
        }
    }

    public void listStudTeachAlphabetDepart(Department name) {
        for (Department department : departments) {
            System.out.println("src.main.java.Department: " + department.getName());
            List<person> people = department.getAllPeople();
            int n = people.size();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n; j++) {
                    String name1 = people.get(i).getName();
                    String name2 = people.get(j).getName();
                    int k = 0;
                    while (k < name1.length() && k < name2.length()
                            && name1.charAt(k) == name2.charAt(k)) {

                        k++;
                    }
                    if (k < name1.length() && k < name2.length()
                            && name1.charAt(k) > name2.charAt(k)) {
                        person temp = people.get(i);
                        people.set(i, people.get(j));
                        people.set(j, temp);
                    }
                }
            }
            for (person person : people) {
                System.out.println(person.toString());
            }
        }
    }

    public void listStudCourseDepart(Department department) {
        List<Student> studentsInCourse = new ArrayList<>();
        for (Student student : department.getStudents()) {
            if (student.getCourse() == course) {
                studentsInCourse.add(student);
            }
        }
    }
}

