package Lesson_5;

import Lesson_5.controllers.GroupController;
import Lesson_5.controllers.StudentController;
import Lesson_5.controllers.TeacherController;
import Lesson_5.repositories.StudentRepository;
import Lesson_5.repositories.TeacherRepository;
import Lesson_5.services.GroupService;
import Lesson_5.services.StudentService;
import Lesson_5.services.TeacherService;
import Lesson_5.view.GroupView;
import Lesson_5.view.SortType;
import Lesson_5.view.StudentView;
import Lesson_5.view.TeacherView;
import java.util.Scanner;

public class main {

    private static StudentRepository studentRepository;
    private static StudentService studentService;
    private static StudentController studentController;
    private static TeacherRepository teacherRepository = new TeacherRepository();
    private static TeacherService teacherService = new TeacherService(teacherRepository);
    private static TeacherController teacherController = new TeacherController(teacherService);


    public static void main(String[] args) {
        StudentView view = getStudentController();
        GroupView groupView = getGroupView();
        TeacherView teacherView = getTeacherController();


//        -------------------------------------------------------------------------

        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Petr Vorobev", 19, "03", "10А");
        view.create("Sidor Sidorov", 20, "112", "10А");
        view.create("Elena Ivanova", 19, "911", "10А");
        view.create("Anna Morozova", 17, "01", "11А");
        teacherView.create("Andrew Semenov", 110, "00000", "11A");
        teacherView.create("Semen Andreev", 1, "12345", "11B");

        groupView.printAllFromGroup("11А");
        view.sendOnConsole();
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.ID);

        view.removeUser("Ivan Morozov");

        view.sendOnConsole();

//        cycle


        while  (true) {
            System.out.println("Choose an option:\n1) get-student\n2) get-teacher" +
                    "\n3) get-student-name\n4)get-group\n5)create-student\n6)delete-student\n" +
                    "7)create-teacher\n8)delete-teacher\n9)exit");
            switch (UserInfo()) {
                case "get-student":
                    view.sendOnConsole(SortType.ID);
                    break;
                case "get-teacher":
                    teacherView.sendOnConsole(SortType.ID);
                case "get-group":
                    System.out.println("Enter group");
                    groupView.printAllFromGroup(UserInfo());
                    break;
                case "create-student":
                    System.out.println("Student name: ");
                    String name = UserInfo();
                    System.out.println("Student age: ");
                    int age = Integer.parseInt(UserInfo());
                    System.out.println("Student phone num");
                    String phone = UserInfo();
                    System.out.println("Student group");
                    String group = UserInfo();
                    view.create(name, age, phone, group);
                    break;
                case "delete-student":
                    System.out.println("Enter student name to delete");
                    view.removeUser(UserInfo());
                    break;
                case "create-teacher":
                    System.out.println("Teacher name: ");
                    String teacherName = UserInfo();
                    System.out.println("Teacher age: ");
                    int teacherAge = Integer.parseInt(UserInfo());
                    System.out.println("Teacher phone num: ");
                    String teacherPhone = UserInfo();
                    System.out.println("Teacher group: ");
                    String teacherGroup = UserInfo();
                    teacherView.create(teacherName, teacherAge, teacherPhone, teacherGroup);
                    break;
                case "delete-teacher":
                    System.out.println("Enter teacher to delete");
                    view.removeUser(UserInfo());
                    break;
                case "exit":
                    System.exit(0);
            }
        }

    }

    private static StudentView getStudentController() {
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new StudentView(studentController);

    }
        private static TeacherView getTeacherController() {
        teacherRepository = new TeacherRepository();
        teacherService = new TeacherService(teacherRepository);
        teacherController = new TeacherController(teacherService);
        return new TeacherView(teacherController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService, teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }

    private static String UserInfo(){
        Scanner scanner = new Scanner(System.in);
        String info = scanner.nextLine();
        return info;
    }


}