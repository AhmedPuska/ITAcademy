package javaapplication218;

import model.Subject;
import java.sql.SQLException;
import java.util.List;
import model.AbstractDAO;
import model.Teacher;
import model.TeacherDao;

public class JavaApplication218 {
    public static void main(String[] args) throws SQLException {
        
        AbstractDAO<Teacher> t = new TeacherDao();
        
        Teacher masterYi = t.get(4);
        masterYi.salary = 600.34;
        t.update(masterYi);
        
//        Teacher t1 = new Teacher();
//        t1.name = "Yi";
//        t1.salary = 400.24;
//        
//        t.insert(t1);


//        t.getList();
        


//        List<Subject> subjects = DatabaseBroker.getSubjects();
//        
//        Subject s1 = subjects.get(2);
//        s1.title = "Ruke u vatri";
//        DatabaseBroker.updateSubject(s1);
//        
//        for (Subject s : subjects) {
//            System.out.println(s.title);
//        }
        
//        Subject s = DatabaseBroker.getSubject(1);
//        s.title = "Java Hibernate";
//        DatabaseBroker.updateSubject(s);
        
//        Subject esperanto = new Subject();
//        esperanto.id = -1;
//        esperanto.title = "Esperanto";
//        esperanto.classCount = 24;
//        
//        DatabaseBroker.saveSubject(esperanto);
//        System.out.println(esperanto.id);
    }    
}