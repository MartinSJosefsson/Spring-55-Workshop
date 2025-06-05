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
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public List<Student> finsAll() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }
}
