package src.main.java.org.example.uni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        naukma university = new naukma();

        while (true) {
            System.out.println("1. Створити факультет");
            System.out.println("2. Видалити факультет");
            System.out.println("3. Редагувати факультет");
            System.out.println("4. Створити кафедру");
            System.out.println("5. Видалити кафедру");
            System.out.println("6. Редагувати кафедру");
            System.out.println("7. Додати студента");
            System.out.println("8. Видалити студента");
            System.out.println("9. Редагувати дані студента");
            System.out.println("10. Додати викладача");
            System.out.println("11. Видалити викладача");
            System.out.println("12. Редагувати дані викладача");
            System.out.println("13. Пошук студента");
            System.out.println("14. Пошук викладача");
            System.out.println("15. Список всіх студентів і викладачів у факультеті");
            System.out.println("16. Список всіх студентів і викладачів у кафедрі");
            System.out.println("17. Список всіх студентів конкретного курсу");
            System.out.println("0. Вихід");
            String input = reader.readLine();
            int choice;
            try{
                choice = Integer.parseInt(input);
            }catch (NumberFormatException e){
                System.out.println("Invalid input. Please try again");
                continue;
            }

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName = reader.readLine();
                    Faculty newFaculty = new Faculty(facultyName);
                    university.createFaculty(newFaculty);
                    System.out.println("Факультет створений");
                    break;
                case 2:
                    System.out.print("Введіть назву факультету: ");
                    String facultyNameToDelete = reader.readLine();
                    Faculty facultyToDelete = university.findFaculty(facultyNameToDelete);
                    if (facultyToDelete != null) {
                        university.deleteFaculty(facultyToDelete);
                        System.out.println("Факультет видалений");
                    } else {
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 3:
                    System.out.println("Введіть назву факультету: ");
                    String facultyNameToChange = reader.readLine();
                    Faculty facultyToChange = university.findFaculty(facultyNameToChange);
                    if (facultyToChange != null){
                        System.out.println("Введіть нову назву факультету: ");
                        String newFacultyName = reader.readLine();
                        facultyToChange.setNameFaculty(newFacultyName);
                        System.out.println("Факультет успішно редактовано");
                    }else{
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 4:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName1 = reader.readLine();
                    Faculty faculty = university.findFaculty(facultyName1);
                    if (faculty != null) {
                        System.out.print("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        faculty.createDepartment(departmentName);
                        System.out.println("Кафедру створено.");
                    } else {
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 5:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName2 = reader.readLine();
                    Faculty faculty1 = university.findFaculty(facultyName2);
                    if (faculty1 != null) {
                        System.out.print("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        Department departmentToDelete = faculty1.findDepartment(departmentName);
                        if (departmentToDelete != null) {
                            faculty1.deleteDepartment(departmentToDelete);
                            System.out.println("Кафедру видалено.");
                        } else {
                            System.out.println("Кафедру не знайдено");
                        }
                    } else {
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 6:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName3 = reader.readLine();
                    Faculty faculty2 = university.findFaculty(facultyName3);
                    if (faculty2 != null){
                        System.out.println("Введіть назву кафедри: ");
                        String departNameToChange = reader.readLine();
                        Department departToChange = faculty2.findDepartment(departNameToChange);
                        if (departToChange != null) {
                            System.out.println("Введіть нову назву кафедри: ");
                            String newDepartName = reader.readLine();
                            departToChange.setNameDepart(newDepartName);
                            System.out.println("Кафедру успішно редаговано");
                        }else {
                            System.out.println("Кафедру не знайдено");
                        }
                    }else{
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 7:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName4 = reader.readLine();
                    Faculty faculty3 = university.findFaculty(facultyName4);
                    if (faculty3 != null) {
                        System.out.print("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        Department department = faculty3.findDepartment(departmentName);
                        if (department != null) {
                            System.out.print("Введіть ПІБ: ");
                            String studentName = reader.readLine();
                            System.out.print("Введіть вік: ");
                            int studentAge = Integer.parseInt(reader.readLine());
                            System.out.print("Введіть курс: ");
                            String course = reader.readLine();
                            System.out.print("Введіть групу: ");
                            String group = reader.readLine();
                            department.addStudent(new Student(studentName, studentAge, course, group));
                            System.out.println("Студента додано");
                        } else {
                            System.out.println("Кафедру не знайдено");
                        }
                    } else {
                        System.out.println("Факультет не знайдено");
                    }
                    break;

                case 8:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName5 = reader.readLine();
                    Faculty faculty4 = university.findFaculty(facultyName5);
                    if (faculty4 != null) {
                        System.out.print("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        Department department = faculty4.findDepartment(departmentName);
                        if (department != null) {
                            System.out.print("Введіть ПІБ: ");
                            String studentName = reader.readLine();
                            Student studentToDelete = department.findStudentByName(studentName);
                            if (studentToDelete != null) {
                                department.deleteStudent(studentToDelete);
                                System.out.println("Студента видалено");
                            } else {
                                System.out.println("Студента не знайдено");
                            }
                        } else {
                            System.out.println("Кафедру не знайдено");
                        }
                    } else {
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 9:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName6 = reader.readLine();
                    Faculty faculty5 = university.findFaculty(facultyName6);
                    if (faculty5 != null) {
                        System.out.print("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        Department department = faculty5.findDepartment(departmentName);
                        if (department != null) {
                            System.out.print("Введіть ПІБ ");
                            String studentNameToChange = reader.readLine();
                            Student studentToChange = department.findStudentByName(studentNameToChange);
                            if (studentToChange != null) {
                                System.out.println("Введіть нові ПІБ ");
                                String newStudentName = reader.readLine();
                                studentToChange.setName(newStudentName);
                                System.out.println("Студента успішно редаговано");

                            } else {
                                System.out.println("Студента не знайдено");

                            }
                        }else {
                            System.out.println("Кафедру не знайдено");
                        }
                    } else {
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 10:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName7 = reader.readLine();
                    Faculty faculty6 = university.findFaculty(facultyName7);
                    if (faculty6 != null) {
                        System.out.print("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        Department department = faculty6.findDepartment(departmentName);
                        if (department != null) {
                            System.out.print("Введіть ПІБ: ");
                            String teacherName = reader.readLine();
                            System.out.print("Введіть вік: ");
                            int teacherAge = Integer.parseInt(reader.readLine());
                            department.addTeacher(new Teacher(teacherName, teacherAge));
                            System.out.println("Викладача добавлено");
                        } else {
                            System.out.println("Кафедру не знайдено");
                        }
                    }else {
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 11:
                    System.out.print("Введіть назву факультету: ");
                    facultyName = reader.readLine();
                    Faculty faculty7 = university.findFaculty(facultyName);
                    if (faculty7 != null) {
                        System.out.print("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        Department department = faculty7.findDepartment(departmentName);
                        if (department != null) {
                            System.out.print("Введіть ім'я: ");
                            String teacherName = reader.readLine();
                            Teacher teachersToDelete = department.findTeacherByName(teacherName);
                            if (teachersToDelete != null) {
                                department.deleteTeacher(teachersToDelete);
                                System.out.println("Викладача видалено");
                            } else {
                                System.out.println("Викладача не знайдено");
                            }
                        } else {
                            System.out.println("Кафедру не знайдено");
                        }
                    } else {
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 12:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName8 = reader.readLine();
                    Faculty faculty8 = university.findFaculty(facultyName8);
                    if (faculty8 != null) {
                        System.out.print("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        Department department = faculty8.findDepartment(departmentName);
                        if (department != null) {
                            System.out.print("Введіть ПІБ: ");
                            String teacherNameToChange = reader.readLine();
                            Teacher teacherToChange = department.findTeacherByName(teacherNameToChange);
                            if (teacherToChange != null) {
                                System.out.println("Введіть нове ПІБ: ");
                                String newStudentName = reader.readLine();
                                teacherToChange.setName(newStudentName);
                                System.out.println("Викладача успішно редаговано");

                            } else {
                                System.out.println("Викладача не знайдено");

                            }
                        }else {
                            System.out.println("Кафедру не знайдено");
                        }
                    } else {
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 13:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName9 = reader.readLine();
                    Faculty faculty9 = university.findFaculty(facultyName9);
                    if (faculty9 != null) {
                        System.out.println("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        Department department = faculty9.findDepartment(departmentName);
                        String studentName = reader.readLine();
                        Student student = department.findStudentByName(studentName);
                        if (student != null) {
                            System.out.println("Студента знайдено: " + student.getName());
                        } else {
                            System.out.println("Студента не знайдено");
                        }
                        String studentCourse = reader.readLine();
                        Student student1 = department.findStudentByCourse(studentCourse);
                        if (student1 != null) {
                            System.out.println("Студента знайдено: " + student.getName());
                        } else {
                            System.out.println("Студента не знайдено");
                        }
                        String studentGroup = reader.readLine();
                        Student student2 = department.findStudentByGroup(studentGroup);
                        if (student2 != null) {
                            System.out.println("Студента знайдено: " + student.getName());
                        } else {
                            System.out.println("Студента не знайдено");
                        }
                    }else{
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 14:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName10 = reader.readLine();
                    Faculty faculty10 = university.findFaculty(facultyName10);
                    if (faculty10 != null) {
                        System.out.println("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        Department department = faculty10.findDepartment(departmentName);
                        System.out.print("Введіть ПІБ: ");
                        String teacherName = reader.readLine();
                        Teacher teacher = department.findTeacherByName(teacherName);
                        if (teacher != null){
                            System.out.println("Викладача знайдено: " + teacher.getName());

                        }
                    } else {
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 15:
                    System.out.println("Введіть назву факультету: ");
                    String facultyName11 = reader.readLine();
                    Faculty facultyToPrint = university.findFaculty(facultyName11);
                    if (facultyToPrint != null){
                        university.listStudTeachAlphabetFaculty(facultyToPrint);
                    }else{
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 16:
                    System.out.print("Введіть назву факультету: ");
                    String facultyName12 = reader.readLine();
                    Faculty faculty11 = university.findFaculty(facultyName12);
                    if (faculty11 != null) {
                        System.out.println("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        Department departmentToPrint = faculty11.findDepartment(departmentName);
                        if (departmentToPrint != null) {
                            university.listStudTeachAlphabetDepart(departmentToPrint);
                        } else {
                            System.out.println("Кафедру не знайдено");
                        }
                    }else{
                        System.out.println("Факультет не знайдено");
                    }
                    break;
                case 17:
                    System.out.println("Введіть назву факультету: ");
                    String facultyName13 = reader.readLine();
                    Faculty faculty12 = university.findFaculty(facultyName13);
                    if (faculty12 != null){
                        System.out.println("Введіть назву кафедри: ");
                        String departmentName = reader.readLine();
                        Department department = faculty12.findDepartment(departmentName);
                        if(department == null){
                            System.out.println("Кафедру не знайдено");
                            break;
                        }
                        System.out.println("введіть курс (1-4): ");
                        String course = reader.readLine();
                        List<Student> studentsByCourse = department.getStudentsByCourse(course);
                        if(studentsByCourse.isEmpty()){
                            System.out.println("Студентів вказаного курсу в цій кафедрі не знайдено");
                            break;
                        }
                        System.out.println("Студент/студентка " + course + "курсу в кафедрі " + departmentName + ":");
                        for(Student student : studentsByCourse){
                            System.out.println(student.getName() + " - " + student.getCourse() + " курс");
                        }
                    }else{
                        System.out.println("Факультет не знайдено");
                    }
                    break;
            }
        }
    }
}