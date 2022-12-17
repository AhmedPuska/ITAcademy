package javaapplication286;

public class Master implements ICard{

    @Override
    public void getMoney(double amount) {
        System.out.println("Add money with master card");
    }

    @Override
    public boolean validate() {
        System.out.println("Validate Master");
        return true;
    }
    
}
