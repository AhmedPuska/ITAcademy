package javaapplication58;
public class Student extends Person{
      /*iz klase Person nasleđuju se atributi firstName i lastName*/
 
    public String indexNumber;  // dodatni atribut (broj indeksa)
    
    public Student(String firstName, String lastName, String indexNumber)       // konstruktor
    {
          /*poziv konstruktora roditeljske klase*/
        super(firstName, lastName);
 
        this.indexNumber = indexNumber;
        System.out.println(indexNumber);
    }
    @Override
    public void show(){
        System.out.println("Student: "+firstName + " " + lastName+ " ID No. "+indexNumber);
    }
    
}
