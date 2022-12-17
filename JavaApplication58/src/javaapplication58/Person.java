package javaapplication58;

abstract class Animal
{
    
}
class Horse extends Animal
{
    
}
class Dog extends Animal
{
    
}
public class Person {
     
    public final String SCHOOL_NAME = "ITAcademy";
    
    public String firstName;    // atributi klase
    public String lastName;
 
    public Person(String firstName, String lastName)// konstruktor
    {
           this.firstName = firstName;
           this.lastName = lastName;
           System.out.println(firstName+lastName);
    }
 
    public void show() {    // metoda za prikaz podataka o osobi
 
        System.out.println("Person: " + firstName + " " + lastName);
    }
//    String make;
//    String model;
//    int numDoors; 
//    static int wheels = 4; 
//    public Person(){
//        System.out.println("The car is being created");
//    }
//   
//String name;
//String lastname;
//int age;
//int height;
//int weight;
// 
//// metode klase (sposobnosti ili ponašanja objekta)
//void sleep()
//{
//// ovde se piše logika metode
//    System.out.println("CAOOOOOOo");
//}  
//  
//void run()
//{
//// ovde se piše logika metode
//}
//} 
// class Car {
//    String make;
//    String model;
//    int numDoors; 
//    static int wheels = 4; 
//    public Car(){
//        System.out.println("The car is being created");
//    }
//    public static void passByRefference(Car car){
//    car.model="Beetle";
//    }
//    public static void passByValue(int x){
//        x=25;
//    }

}