package javaapplication295;

public class Subscriber implements ISubscriber {

    public String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String args) {
        System.out.println("Updated object " + this.name + " args + " + args);
    }

}
