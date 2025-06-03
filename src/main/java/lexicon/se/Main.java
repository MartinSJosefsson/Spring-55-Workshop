package lexicon.se;

import lexicon.se.Dao.StudentDao;
import lexicon.se.config.ComponentScanConfig;
import lexicon.se.service.StudentManagement;
import lexicon.se.util.UserInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        UserInputService userInputService = context.getBean(UserInputService.class);
        StudentManagement studentManagement = context.getBean(StudentManagement.class);

        }
    }
