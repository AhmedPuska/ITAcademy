package studentdatabaseapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

//        Student s1 = new Student();
//        s1.enroll();
//        s1.payTuition();
//        System.out.println(s1.toString());
        // Ask how many student will be added
        System.out.println("Enter number of new students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];
        List list = new ArrayList<>();

        // Create n number of the new student
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for (int n = 0; n < numOfStudents; n++) {
            System.out.println("***********");
            System.out.println(students[n].toString());
        }
    }
}
