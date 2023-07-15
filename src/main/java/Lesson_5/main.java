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

//        -------------------------------------------------------------------------

        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Petr Vorobev", 19, "03", "10А");
        view.create("Sidor Sidorov", 20, "112", "10А");
        view.create("Elena Ivanova", 19, "911", "10А");
        view.create("Anna Morozova", 17, "01", "11А");

        groupView.printAllFromGroup("11А");
        view.sendOnConsole();
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.ID);

        view.removeUser("Ivan Morozov");

        view.sendOnConsole();

    }

    private static StudentView getStudentController() {
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService, teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }


}