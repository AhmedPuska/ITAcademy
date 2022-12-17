package javaapplication120;

//import java.awt.Button;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.sql.SQLException;

public class JavaApplication120 {
    
//    void method() {
//        
//        Button button = new Button();
//        button.addActionListener((ActionEvent ae) -> {
//            System.out.println("Hello world");
//        });
//    }
//    
//    public class Rectangle {
//public int a;
//public int b;
//public Rectangle(int a, int b)
//    {
//        this.a = a;
//        this.b = b;
//    }
//public int area()
//    {
//        return this.a * this.b;
//    }
//}
//    
//    public class RectangleDecorator {
//protected Rectangle r;
//protected int a;
//protected int b;
//public RectangleDecorator(Rectangle r)
//    {
//        this.r = r;
//        this.a = this.r.a;
//        this.b = this.r.b;
//    }
//public int perimeter()
//    {
//        return 2*(this.a + this.b);
//    }
//}
    
    
//    public class User { }
// 
//public class Administrator extends User { public Administrator(){ System.out.println("Hello administrator"); } }
// 
//public class SuperAdministrator extends User { public SuperAdministrator(){ System.out.println("Hello super administrator"); } } 
////<br><br>Sada bi korisnik, jednostavno, mogao instancirati bilo koju od klasa na sledeći, standardan način:
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        DbBroker db = DbBroker.getInstance();
        db.query("insert into users (email,password) values ('my mail','my pass')");
        
//        SomeOtherClass a = new SomeOtherClass();
//        SomeOtherClass b = new SomeOtherClass();
//        System.out.println(a.equals(b));
//        SomeOtherClass a = SomeOtherClass.getInstance();
//        SomeOtherClass b = SomeOtherClass.getInstance();
//        a.x=100;
//        b.x=20;
//        System.out.println(a.x);
//        Distributer d = new Distributer();
//        Subscriber s1 = new Subscriber("subscriber 1");
//        Subscriber s2 = new Subscriber("subscriber 2");
//        Subscriber s3 = new Subscriber("subscriber 3");
//        d.addSubscriber(s1);
//        d.addSubscriber(s2);
//        d.addSubscriber(s3);
//        d.sendUpdate("new update");
//        d.cancelSubscriber(s2);
//        d.cancelSubscriber(s1);
//        d.sendUpdate("new update1");

//        Administrator a = new Administrator();

//        RectangleDecorator rd = new RectangleDecorator(new Rectangle(2, 3));
//        System.out.println(rd.r.area());
//        System.out.println(rd.perimeter());
    }
}