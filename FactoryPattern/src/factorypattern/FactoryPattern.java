package factorypattern;
public class FactoryPattern {
    public static void main(String[] args) {
        User standardUser = UserFactory.newUser(UserType.STANDARD_USER);
        User admin = UserFactory.newUser(UserType.ADMINISTRATOR);
    }
}