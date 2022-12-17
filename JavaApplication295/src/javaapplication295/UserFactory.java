package javaapplication295;

public class UserFactory {

    public static User newUser(String uType) {
        if (uType.equals("administrator")) {
            return new Administrator();
        }
        if (uType.equals("superAdministrator")) {
            return new SuperAdministrator();
        }
        return null;
    }
}
