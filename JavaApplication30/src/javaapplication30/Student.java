package javaapplication30;
public class Student extends Person {
    public String indexNumber;
    public Student (String firstName, String lastName, String indexNumber){
        super (firstName, lastName);
        this.indexNumber = indexNumber;
        
    }
    public String toString(){
        return "Hello from "+firstName;
    }
    @Override
    public void show(){
        System.out.println("Student: "+firstName+" "+lastName+" "+ indexNumber);
        super.show();
    }
    public void show(String firstName){
        System.out.println("Student: "+firstName);
    }
    public void show(String firstName, String lastName){
        System.out.println("Student: "+firstName+" "+lastName);
    }
}
