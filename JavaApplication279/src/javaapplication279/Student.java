package javaapplication279;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String ime;
    private String prezime;
    private int godinaStudija;
    private String studentID;
    private String kursevi = "";
    private static int cijenaKursa = 600;
    private int balansKursa;
    private static int id = 1000;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime studenta");
        ime = sc.nextLine();
        System.out.println("Unesite prezime studenta");
        prezime = sc.nextLine();
        System.out.println("Godina studija:\n1 - I\n2 - II\n3 - III\n4 - IV");
        godinaStudija = sc.nextInt();
        setStudentID();

    }

    // unikatni id sa prvim brojem godine studija
    private void setStudentID() {

        id++;
        studentID = godinaStudija + "" + id;

    }

    public void availableCourse() {
        do {
            System.out.println("Add course: \n1. History 101\n"
                    + "2. Mathematics 101\n"
                    + "3. English 101\n"
                    + "4. Chemistry 101\n"
                    + "Q - for quit");
            Scanner sc = new Scanner(System.in);
            String kurs = sc.nextLine();
            if (!kurs.equals("Q")) {
                kursevi = kursevi + "\n  " + kurs;
                balansKursa = balansKursa + cijenaKursa;
            } else {
                break;
            }
        } while (1 != 0);

    }

    public void prikazBalansKursa() {
        System.out.println("Tvoj balans je: " + balansKursa);
    }

    public void placanjeKursa() {
        prikazBalansKursa();
        System.out.println("Unesite iznos placanja u $");
        Scanner sc = new Scanner(System.in);
        int isplata = sc.nextInt();
        balansKursa = balansKursa - isplata;
        System.out.println("Hvala za vasu uplatu u iznosu $" + isplata);
        prikazBalansKursa();
    }

    @Override
    public String toString() {
        return "Student{" + "ime=" + ime + ", prezime=" + prezime + ", studentID=" + studentID + ", kursevi=" + kursevi + ", balansKursa=" + balansKursa + '}';
    }

}
