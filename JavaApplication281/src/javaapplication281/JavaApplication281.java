package javaapplication281;

import java.util.Scanner;

//class Car {
//    private boolean engine;
//    private int cylinders;
//    private String name;
//    private int wheels;
//    public Car(int cylinders, String name) {
//        this.cylinders = cylinders;
//        this.name = name;
//        this.engine = true;
//        this.wheels = 4;
//    }
//    public int getCylinders() {
//        return cylinders;
//    }
//    public String getName() {
//        return name;
//    }
//    public String startEngine() {
//        return "Car -> startEngine()";
//    }
//    public String accelerate() {
//        return "Car -> accelarate()";
//    }
//    public String brake() {
//        return "Car -> brake()";
//    }
//}
//class Mitsubishi extends Car {
//    public Mitsubishi(int cylinders, String name) {
//        super(cylinders, name);
//    }
//    @Override
//    public String brake() {
//        return "Mitsubushi -> brake()";
//    }
//    @Override
//    public String accelerate() {
//        return "Mitsubushi -> accelarate()";
//    }
//    @Override
//    public String startEngine() {
//        return "Mitsubushi -> startEngine()";
//    }
//}
public class JavaApplication281 {

    public static void main(String[] args) {

//        Car c = new Car(8, "Base car");
//        System.out.println(c.startEngine());
//        System.out.println(c.accelerate());
//        System.out.println(c.brake());
//        Mitsubishi m = new Mitsubishi(6, "Outlander VRW 4WD");
//        System.out.println(m.startEngine());
//        System.out.println(m.accelerate());
//        System.out.println(m.brake());
        //z
//        double centimeters = calcFeetAndInchesToCentimenters(10, 12);
//        if (centimeters < 0.0) {
//            System.out.println("Invalid Value");
//        }
//
//        calcFeetAndInchesToCentimenters(157);
//        System.out.println(getDurationString(65, 50));
//        System.out.println(getDurationString(3945L));
//        double pi = 3;
//        double e = pi*pi*Math.PI;
//        printYearAndDays(569209);
//        printHourMinutesSeconds(569209);
//        System.out.println("");
//        printHourMinutesSeconds2(569209);
//        System.out.println("");
//        printHourMinutesSeconds3(34152544);
//        System.out.println(isCatPlaying(false, 45));
//        System.out.println(getDurationString(65, 2));
//        getDaysInMonth(2, 2);
//        int count = 0;
//        int sum = 0;
//        for (int i = 1; i <= 1000; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                count++;
//                sum += i;
//                System.out.println("Found number = " + i);
//            }
//            if (count == 5) {
//                break;
//            }
//        }
//        System.out.println("Sum = " + sum
//        int number = 4;
//        int finishNumber = 20;
//        int sum = 0;
//        int count = 0;
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//            sum += number;
//            System.out.println("Even number " + number);
//            count++;
//            if (count>=5) {
//                break;
//            }
//        }
//        System.out.println("Sum = " + sum + ", count = " + count);
//        System.out.println(sumDigits(19));
//        System.out.println(isPalindrome(11));
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(getEvenDigitSum(25));
//        System.out.println(5%10);
//        System.out.println(hasShareDigit(12, 23));
//        System.out.println(hasSameLastDigit(11, 22, 31));
//        System.out.println(isValid(10));
//        System.out.println(getGreatestCommonDivisor(40, 24));
//        printFactors(10);
//        System.out.println(isPerfectNumber(6));
//        numberToWords(202);
//        System.out.println(reverse(234));
//        printSquareStar(5);
//        Scanner sc = new Scanner(System.in);
//
//        int max = 0;
//        int min = 0;
//        boolean first = true;
//
//        while (true) {
//
//            System.out.println("Enter number");
//            boolean isNumber = sc.hasNextInt();
//            if (isNumber) {
//                int number = sc.nextInt();
//                
//                if(first) {
//                    first=false;
//                    min=number;
//                    max=number;
//                }
//                if (number > max) {
//                    max = number;
//                }
//                if (number < min) {
//                    min = number;
//                }
//            } else {
//                break;
//            }
//            sc.nextLine();
//        }
//        System.out.println("min= " + min + ", max=" + max);
//        inputThenPrintSumAndAverage();
//        Model m = new Model();
//        m.setFirstName("John");
//        m.setLastName("Smith");
//        m.setAge(10);
//        System.out.println(m.isTeen());
//        Bank acc = new Bank();
//        acc.withdrawal(100);
//        acc.deposit(50);
//        acc.withdrawal(100);
//        acc.deposit(51);
//        acc.withdrawal(100);
//        VipCustomer vp = new VipCustomer("Mujo", 2400, "Dodaj");
//        System.out.println(vp.getName() + " " + vp.getEmail());
//        Outlander outlander = new Outlander(36);
//        outlander.steer(45);
//        outlander.accelarate(30);
//        outlander.accelarate(20);
//        outlander.accelarate(-42);
//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());
//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("North");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("East");
//        
//        Ceiling ceiling = new Ceiling(12, 55);
//        
//        Bed bed = new Bed("Moder", 4, 3, 2, 1);
//        
//        Lamp lamp = new Lamp("Classic", false, 75);
//        
//        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//        bedroom.makeBed();
//        
//        bedroom.getLamp().turnOn();
//        Printer printer = new Printer(50, false);
//        System.out.println("intial page count is = " + printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
//        pagesPrinted = printer.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        
        
        
        

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        int needBucket = 0;
        double walkArea = width * height;
        needBucket = (int) (Math.ceil(walkArea / areaPerBucket) - extraBuckets);

        return needBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1, areaPerBucket);
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        int count = 0;
        while (true) {
//            System.out.println("Enter a number");
            boolean hasNext = sc.hasNextInt();
            if (hasNext) {
                number = sc.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
            sc.nextLine();
        }
//        long avg = Math.round((double) sum / count);
        long avg = Math.round(sum / number);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

    public static void printSquareStar(int number) {
//        if (number < 5) {
//            System.out.println("Invalid Value");
//            return;
//        }
//        int rowNumber = 1;
//        int columnNumber = 1;
//        for (int i = 0; i < number; i++) {
//            for (int j = 0; j < number; j++) {
//                if (rowNumber == 1 || rowNumber == number || columnNumber == 1 || columnNumber == number || rowNumber == columnNumber || columnNumber == number - rowNumber + 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//                columnNumber++;
//            }
//            rowNumber++;
//            System.out.println("");
//            columnNumber = 1;
//        }

        if (number < 5) {
            System.out.println("Invalid Value");
        }
        int rowNumber = 1;
        int columnNumber = 1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (rowNumber == 1 || rowNumber == number || columnNumber == 1 || columnNumber == number || rowNumber == columnNumber || columnNumber == number - rowNumber + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columnNumber++;
            }
            rowNumber++;
            System.out.println("");
            columnNumber = 1;
        }
    }

//    public static void printSquareStar(int number) {
//        if (number < 5) {
//            System.out.println("Invalid Value");
//            return;
//        }
//
//        int count = 1;
//    while(count <= number){
//        System.out.println();
//        for(int i = 1; i<=number;i++){
//            if((i == 1 || i ==number) ||
//                    (count == 1 || count == number )
//                    || (i == count || count == (number -i) + 1))
//                System.out.print("*");
//            else
//                System.out.print(" ");
//        }
//        count++;
//        }
//    }
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);

        return count;
    }

    public static int reverse(int number) {
//        numberToWords(number);
        int num = 0;
        while (number != 0) {
            num *= 10;
            num += number % 10;
            number /= 10;
        }
        return num;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int count = getDigitCount(number);
        number = reverse(number);
        int num = 0;
        do {
            int lastNumber = number % 10;

            switch (lastNumber) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
            }
            num++;
            number /= 10;
        } while (number != 0);
        if (count != num) {
            int rem = count - num;
            for (int i = 1; i <= rem; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
            System.out.println(number);
            if (number == sum) {

                return true;
            }
        }
        return false;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int maxNum = Math.max(first, second);
        int gcd = 1;
        for (int i = 1; i <= maxNum; i++) {
            if (first % i == 0 && second % i == 0) {
                if (i > gcd) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }

    public static boolean hasSameLastDigit(int numberA, int numberB, int numberC) {
        if (numberA > 1000 || numberA < 10 || numberB > 1000 || numberB < 10 || numberC > 1000 || numberC < 10) {
            return false;
        } else {
            int lastNumberA = numberA % 10;
            int lastNumberB = numberB % 10;
            int lastNumberC = numberC % 10;
            if (lastNumberA == lastNumberB || lastNumberB == lastNumberC || lastNumberA == lastNumberC) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number > 1000 || number < 10) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasShareDigit(int a, int b) {

//        int copy = num2;
//        while (num1 > 0) {
//            int digitOne = num1 % 10;
//            num1 /= 10;
//            while (copy > 0) {
//                int digitTwo = num2 %10;
//                copy /= 10;
//                if (digitOne == digitTwo) {
//                    return true;
//                }
//            }
//            System.out.println(num1);
//            copy = num2;
//        }
        return false;
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }

//        while (number > 0) {
//                int digit = number % 10;
//                sum += digit;
//                number /= 10;
//            }
        while (number > 0) {
            int digitNumber = number % 10;
            if (number % 2 == 0) {
                sum += digitNumber;
            }
            number /= 10;

        }
        return sum;
    }

    public static int sumFirstAndLastDigit(int number) {
        int first = 0;
        int last = number % 10;

        int sum = 0;
        if (number > -1) {
            while (number > 0) {
                int firstDigit = number;
                number /= 10;
                if (firstDigit != 0) {
                    first = firstDigit;
                }
                sum = firstDigit + last;
            }
            System.out.println("First " + first);
        } else {
            return -1;
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int oldNum = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;

            reverse += lastDigit;
            number /= 10;
        }
        if (reverse == oldNum) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDigits(int number) {
        if (number <= 10) {
            return -1;
        }
//        int last = 0;
//        int bothFirst = 0;
//        int bothLast = 0;
//        int both = 0;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
//        if (number>0) {
//            last= number%10;
//            both = number/10;
//            bothFirst = both/10;
//            bothLast=both%10;
//            sum=bothFirst+bothLast+last;
//        }
        return sum;
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 0) {
            return true;
        }
        return false;

    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }

    public static void getDaysInMonth(int month, int year) {
        int day = month * 31;
        int hour = month % 31;
        System.out.println(day + "d " + hour + "h ");
    }

    public static String getDurationString(long minutes, long seconds) {
        //You should validate that the first parameter minutes is >= 0.
        //You should validate that the 2nd parameter seconds is >= 0 and <= 59.
        //The method should return gInvalid valueh in the method if either of the above are not true.
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return ("Invalid Value");
        }

        long hours = minutes / 60;
        long remainMinute = minutes % 60;
        return hours + "h " + remainMinute + "m " + seconds + "s";

    }

    public static String getDurationString(long seconds) {
        //You should validate that the first parameter minutes is >= 0.
        //You should validate that the 2nd parameter seconds is >= 0 and <= 59.
        //The method should return gInvalid valueh in the method if either of the above are not true.
        if (seconds < 0) {
            return ("Invalid Value");
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer) && (temperature <= 45 && temperature >= 25)) {
            return true;
        }
        if ((!summer) && (temperature <= 35 && temperature >= 25)) {
            return true;
        } else {
            return false;
        }

    }

    public static void printHourMinutesSeconds3(long seconds) {
        if (seconds < 0) {
            System.out.println("Invalid Value");
        }
        long hour = seconds / 3600;
        long remainder = seconds - hour * 3600;
        long mins = remainder / 60;
        remainder = remainder - mins * 60;
        long second = remainder;
        System.out.println("printHourMinutesSeconds3 " + hour + "h " + mins + " m " + second + " s");
    }

    public static void printHourMinutesSeconds2(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        long hour = minutes / 60;
        long remainder = minutes - hour * 60;
        long mins = remainder / 60;

        remainder = remainder - mins / 60;
        long second = remainder;
        System.out.println("printHourMinutesSeconds2 " + hour + "h " + remainder + " m " + second + " s");
    }

    public static void printHourMinutesSeconds(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        long hour = minutes / 60;
        long min = hour % 60;
        long minuteRemain = minutes % 60;
        System.out.println("printHourMinutesSeconds " + hour + "h " + minuteRemain + " m");
    }

    public static void printYearAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        long year = minutes / 525600;
        long remainingMinutes = minutes % 525600;
        long day = remainingMinutes / 1440;
        long hour = (remainingMinutes) / 60;

        long days = minutes / 1440;
        long remainingMinut = minutes % 1440;
        long minute = (remainingMinut) / 60;

        long myMinutes = minutes;
        long seconds = remainingMinutes / 3600;
        System.out.println(minutes + " min = " + year + " y and " + day + " d -- " + hour + " H " + myMinutes + " m " + seconds + " s");

        System.out.println(year + " y " + day + " d " + hour + " h");
    }

//    public static String getDurationString(long minutes, long seconds) {
//        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
//            return ("Invalid Value");
//        }
//        long hours = minutes / 60;
//        long remainingMinutes = minutes % 60;
//
//        return hours + "h " + remainingMinutes + "m " + seconds + "s";
//    }
//
//    public static String getDurationString(long seconds) {
//        if (seconds < 0) {
//            return ("Invalid Value");
//        }
//        long minutes = seconds / 60;
//        long remainingSeconds = seconds % 60;
//        return getDurationString(minutes, remainingSeconds);
//    }
    public static double calcFeetAndInchesToCentimenters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimenters = (feet * 12) * 2.54;
        centimenters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimenters + " cm");

        return centimenters;
    }

    public static double calcFeetAndInchesToCentimenters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");

        return calcFeetAndInchesToCentimenters(feet, remainingInches);
    }
}
