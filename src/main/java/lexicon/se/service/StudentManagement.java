package lexicon.se.service;

import lexicon.se.model.Student;

import java.util.List;

public interface StudentManagement {
    Student create();
    Student saved(Student student);
    Student find(int id);
    Student remove(int id);
    List<Student> findAll();
    Student edit(Student student);

}
