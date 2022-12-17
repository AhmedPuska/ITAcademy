package javaapplication49;
public class JavaApplication49 {
    public static void printArray(int[]a){
        System.out.println("Your array: ");
        for (int k = 0; k < a.length; k++) {
            System.out.printf("     %d  ",a[k]);
        }
        System.out.println("");
    }
    public static void insertionSort(int[] a){
         int current, temp;
         for (int i = 1; i < a.length; ++i) {
             current=i;
             while (current > 0 && a [current-1]>a [current]) { 
                        temp=a[current];
                        a[current]=a[current-1];
                        a[current-1]=temp;
                        current--;
                 }
             }
         }
     
     public static void bubbleSort(int[]a){
         int temp;
          for (int i = 0; i < a.length-1; ++i) {
             for (int j = 0; j < a.length -i-1; ++j) { 
                 if (a[j]>a[j+1]) {
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                 }
             }
         }
     }
     public static void main(String[] args) {
       int[] a = { 9, 5, 3, 1, 7, 6, 4 };
//        bubbleSort(a);
//        printArray(a);
         insertionSort(a);
         printArray(a);
    }
    
}
