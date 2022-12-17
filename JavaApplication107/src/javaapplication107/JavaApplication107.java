package javaapplication107;

import java.util.ArrayList;

public class JavaApplication107 {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList();
        
        Person p1 = new Person("John", "Davidson");
        Person p2 = new Person("Lenon", "Patrickson");
        
        arrayList.add(p1);
        arrayList.add(p2);
        
        for (Person p : arrayList) {
            System.out.println("Name:" + p.name + " Surname: " + p.surname);
        }
    }
    
    
    
    
//        MyClass<Integer> myClass1 = new MyClass<>();
//        myClass1.t = 15;
//        MyClass<Double> myClass2 = new MyClass<>();
//        myClass2.t = 15.0;
//        myClass2.showResult();
//        
//    }



//        ArrayList list1 = new ArrayList();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list1.add(10);
//        list2.add(20);
//        for(Object i : list1){
//            System.out.println((Integer)i+2);
//        }
//        for(Integer i : list2){
//            System.out.println(i+2);
//        }
//    }



//        ArrayList<Student> listStudent = new ArrayList<>();
//        ArrayList<Person> listPerson = new ArrayList<>();
//        Person o = new Person();
//        o.name = "John";
//        Student s = new Student();
//        s.name = "David";
//        s.idNumber = "25/25";
//        listPerson.add(o);
//        listStudent.add(s);
//        show(listStudent);
//    }
//    
//    
//        static void show(ArrayList<?> os)
//    {
//    for(Object o : os)
//    System.out.println(((Person)o).name);
//    }   
}