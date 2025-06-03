package lexicon.se.service;

import lexicon.se.Dao.StudentDao;
import lexicon.se.model.Student;
import lexicon.se.util.UserInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component

public class StudentManagementConsoleImpl implements StudentManagement {

    UserInputService scannerService;
    StudentDao studentDao;

    @Autowired
    public StudentManagementConsoleImpl(UserInputService scannerService, StudentDao studentDao){
        this.scannerService = scannerService;
        this.studentDao = studentDao;

    }

    @Override
    public Student create(){
        return null;
    }

    @Override
    public Student saved(Student student){
        return null;
    }

    @Override
    public Student find(int id){
        return null;
    }

    @Override
    public Student remove(int id){
        return null;
    }

    @Override
    public List<Student> findAll(){
        return null;
    }

    @Override
    public Student edit(Student student){
        return null;
    }
}
