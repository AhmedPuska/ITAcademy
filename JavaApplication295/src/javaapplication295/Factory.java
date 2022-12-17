package javaapplication295;

public class Factory {

    public static void main(String[] args) {
        String user = "administrator";
        User u = UserFactory.newUser(user);
    }
}
