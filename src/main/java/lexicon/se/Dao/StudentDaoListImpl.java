package lexicon.se.Dao;

import lexicon.se.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class StudentDaoListImpl implements StudentDao {

    List<Student> students;
    @Autowired
    public StudentDaoListImpl(List<Student> students) {
        this.students = students;
    }

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
       Student foundStudent = students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
       return foundStudent;
    }

    @Override
    public List<Student> findAll() {
        return students.stream().toList();
    }

    @Override
    public void delete(int id) {
        Student foundStudent = students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
        students.remove(foundStudent);

    }
}
