package javaapplication58;
public class JavaApplication58 {
    public static void main(String[] args) {
        Person person = new Person("John", "Davidson");
        Student student = new Student("John", "Smith", "10/2014");
        Professor professor = new Professor("Edward", "Owen", "Java Programming");
 
    // polimorfizam (overriding)
        person.show();
        student.show();
        professor.show();
    
//        Person p = new Person();
//        p.sleep();
//        Horse a = new Horse();
//        Dog d = new Dog();
//        Car car = new Car();
//        car.model="Renalut 4";
//        Car.passByRefference(car);
//        System.out.println(car.model);
//        int x = 10;
//        Car.passByValue(x);
//        System.out.println(x);
    }
    
}
