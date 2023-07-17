package Lesson_5.repositories;

import Lesson_5.models.Student;
import Lesson_5.models.User;

import java.util.List;

public interface UserRepository <T extends User> {
    void create(T user);

    List<T> getAll();

    int remove(String fullName);

    List<T> getAllByGroupTitle(String groupTitle);
}
