package lexicon.se.service;

import lexicon.se.Dao.StudentDao;
import lexicon.se.model.Student;
import lexicon.se.util.UserInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service

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
        System.out.print("Enter student id: ");
        int studentId = scannerService.getInt();
        System.out.print("Enter student name: ");
        String studentName = scannerService.getString();

        Student student = new Student(studentId, studentName);
        return studentDao.save(student);

    }

    @Override
    public Student saved(Student student){
        studentDao.save(student);
        return studentDao.save(student);
    }

    @Override
    public Student find(int id){
        return studentDao.find(id);
    }

    @Override
    public Student remove(int id){
        Student studentFound = studentDao.find(id);
        if(studentFound != null){
            studentDao.delete(id);
        }
        return studentFound;
    }

    @Override
    public List<Student> findAll(){
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student){
        Student studentFound = studentDao.find(student.getId());
        if(studentFound != null){
            studentFound.setName(student.getName());
            return studentFound;
        }

        return null;
    }
}
