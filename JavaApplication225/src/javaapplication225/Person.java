
package javaapplication225;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "age")
    private int age;
    
    @Column(name = "address")
    private String address;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public int getAge() {return age;}

    public String getAddress() {return address;}

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public void setAddress(String address) {this.address = address;}

    public Person() {}
    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return  "Id: " + id + "\n" + name + ": " + age + ": " + address ;
    }
    
    
}