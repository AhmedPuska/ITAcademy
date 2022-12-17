/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

/**
 *
 * @author user
 */
public class JavaApplication65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Person person = new Person("John", "Davidson");
        Student student = new Student("John", "Smith", "10/2014");
        Professor professor = new Professor("Edward", "Owen", "Java Programming");
        //
        /*Metodu istog potpisa imamo deklarisanu u sve 3 klase: roditeljskoj Person i u 2 klase naslednika Student i Professor. To ukazuje da je došlo do polimorfizma.*/
        //person.show();
        student.show();
        professor.show();
        
        Calc c = new Calc();
        c.setOperands(2, 3);
        System.out.println(c.add()+" "+c.sub());
    }
    
}
