package javaapplication279;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication279 {

    public static void main(String[] args) {
        
        System.out.println("Unesite broj novih studenata koje dodajete: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].availableCourse();
            students[n].placanjeKursa();
        }

        for (int n = 0; n < numOfStudents; n++) {
            System.out.println("***********");
            System.out.println(students[n].toString());
        }

    }

}
