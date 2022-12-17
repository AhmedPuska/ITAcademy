package javaapplication308;

import java.util.concurrent.atomic.AtomicInteger;

public class Profa {

    private final int id;
    public static final AtomicInteger count = new AtomicInteger(0);
    public String name;
    public double salary;

    public Profa(int id, String name, double salary) {
        this.id = count.incrementAndGet();
//        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Profa(String name, double salary) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Profa() {
        this.id=count.incrementAndGet();
    }
}
