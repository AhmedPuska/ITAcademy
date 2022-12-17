package javaapplication295;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LocalizedMessage {

    public static void main(String[] args) {

        MyClass a = MyClass.getInstance();
        MyClass b = MyClass.getInstance();
        System.out.println(a.equals(b));
//        
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            System.out.print("Enter phone number: ");
//            String phone = scanner.nextLine();
//            Pattern pattern = Pattern.compile("^[0-9]{3}/[0-9]{3}-[0-9]{4}$");
//            Matcher matcher = pattern.matcher(phone);
//            if(matcher.find()){
//                System.out.println("Phone is valid");
//                break;
//            }
//        }
//
//        UserMessageService ums = new UserMessageService();
//        ums.showWelcomeMessage();
    }
}
