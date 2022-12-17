package javaapplication282;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication282 {

    public static void main(String[] args) {

//        Hamburger hamburger = new Hamburger("Obicni", "kobasicana", 3.56, "Bijelim");
//        double cijena = hamburger.stavkeHamburgera();
//        hamburger.dodavanjeSastojakaHamburgeru1("paradajz", 0.46);
//        hamburger.dodavanjeSastojakaHamburgeru2("salata", 0.96);
//        hamburger.dodavanjeSastojakaHamburgeru3("sir", 1.84);
//        System.out.println("Total hamburger price is " + hamburger.stavkeHamburgera());
//        
//        ZdraviHamburger zdraviHamburger = new ZdraviHamburger("Bacon", 5.50);
////        zdraviHamburger.stavkeHamburgera();
//        zdraviHamburger.dodavanjeSastojakaHamburgeru1("Egg", 3.40);
//        zdraviHamburger.dodajZdraviDodatak1("salata", 3.20);
//        System.out.println("Total healthy hamb. price is " + zdraviHamburger.stavkeHamburgera());
//        
//        DeluxHamburger deluxHamburger = new DeluxHamburger();
//        deluxHamburger.dodavanjeSastojakaHamburgeru3("should not do this", 40.2);
//        deluxHamburger.stavkeHamburgera();
//        getIntegers(5);
//        printArray(2);
//        sortIntegers(3);
//        int[] array = new int[2];
//        array(array);
//        System.out.println(Arrays.toString(array(array)));
//        readIntegers(2);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input how many counts u want");
//        int read = sc.nextInt();
//        findMin(readIntegers(read));
//        int[] array = {1, 5, 6, 4, 51, 12};

//        System.out.println("Array = " + Arrays.toString(array));

//        reverse(array);

//        System.out.println("Reversed array = " + Arrays.toString(array));
        
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printMyList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
        
        
    }
    
    public static void printInstructions() {
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - To print the list of myList items.");
            System.out.println("\t 2 - To add an item to the list.");
            System.out.println("\t 3 - To modify an item in the list.");
            System.out.println("\t 4 - To remove an item from the list.");
            System.out.println("\t 5 - To search for an item in the list.");
            System.out.println("\t 6 - To quit the application");
    }
    
    public static void addItem() {
        System.out.print("Please enter the myList item: ");
        addMyList(sc.nextLine());
    }
    
    public static void modifyItem() {
        System.out.print("Current item number: ");
        String itemNo = sc.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = sc.nextLine();
        modifyMyList(itemNo, newItem);
    }
    
    public static void removeItem() {
        System.out.print("Enter item name: " );
        String itemNo = sc.nextLine();
        removeMyList(itemNo);
    }
    
    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = sc.nextLine();
        if (onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our myList list");
        } else {
            System.out.println(searchItem + " is not in the MYLIST list");
        }
    }
    
    static Scanner sc = new Scanner(System.in);

    private static int findItem(String searchItem) {
//        boolean isExist = myList.contains(searchItem);
        return myList.indexOf(searchItem);
    }
    
    public static boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position>=0) {
            return true;
        } else {
            return false;
        }
    }

    static ArrayList<String> myList = new ArrayList<>();

    public static void addMyList(String item) {
        myList.add(item);
    }

    public static void printMyList() {
        System.out.println("You have " + myList.size() + " items in your MYLIST list");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println((i + 1) + ". " + myList.get(i));
        }
    }

    public static void modifyMyList(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position>=0) {
            modifyMyList(position, newItem);
        }
    }
    
    private static void modifyMyList(int position, String newItem) {
        myList.set(position, newItem);
        System.out.println("MYLIST item " + position + 1 + " has been modified.");
    }

    public static void removeMyList(String item) {
        int position = findItem(item);
        if (position>=0) {
            removeMyList(position);
        }
    }
    
    private static void removeMyList(int remove) {
        myList.remove(remove);
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    public static int findMin(int[] min) {
        int minValue = min[0];
        for (int i = 1; i < min.length; i++) {
            if (min[i] < minValue) {
                minValue = min[i];
            }
        }
        System.out.println("min = " + minValue);
        return minValue;
    }

    public static int[] readIntegers(int count) {
        Scanner sc = new Scanner(System.in);

        int[] number = new int[count];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter a number: ");
            number[i] = sc.nextInt();
        }
//        for (int array : number) {
//
//            System.out.println(array);
//        }

        return number;

    }

    public static int[] array(int[] array) {
//        array = new int[]{1,2,3,5};
        return new int[]{1, 2, 3, 5};
    }

    public static void printArray(int number) {
        for (int ok : getIntegers(number)) {
            System.out.println(ok);
        }
    }

    public static void sortIntegers(int number) {
        int[] newValue = getIntegers(number);
        Arrays.sort(newValue);
        for (int nu : newValue) {
            System.out.println(nu);
        }
    }

    public static int[] getIntegers(int number) {
        Scanner sc = new Scanner(System.in);

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        return values;
    }
}
