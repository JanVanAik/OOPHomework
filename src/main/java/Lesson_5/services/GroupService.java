package Lesson_5.services;

//import Lesson_5.A;
import Lesson_5.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class GroupService {
    private final StudentService studentService;
    private final TeacherService teacherService;

    public GroupService(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    public List<User> getAllUsersFromGroup(String groupTitle) {
        List<User> users = new ArrayList<>(studentService.getAllByTitile(groupTitle));
        users.addAll(teacherService.getAllByTitile(groupTitle));
//        Collections.addAll(users, teacherService.getAll())

        return users;
    }
}