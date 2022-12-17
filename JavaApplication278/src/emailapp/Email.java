package emailapp;

import java.util.Scanner;

public class Email {

//    Generate an email with the following syntax: firstname.lastname@department.company.com
//    Determine the department (sales, development, accounting), if none leave blank
//    Generate a random String for a password
//    Have set methods to change the password, set the mailbox capacity, and define an alternate email address
//    Have get methods to display the name, email, and mailbox capacity    
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternativeEmail;
    private String comapanySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine element to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + comapanySuffix;
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("Department CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch (depChoice) {
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "acct";
            default:
                return "";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getGetMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " + mailboxCapacity;
    }

    @Override
    public String toString() {
        return "Email{" + "firstName=" + firstName + ", email=" + email + ", mailboxCapacity=" + mailboxCapacity + '}';
    }

}
