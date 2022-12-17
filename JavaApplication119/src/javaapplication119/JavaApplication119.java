package javaapplication119;
public class JavaApplication119 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("r.g");
//        Matcher m = p.matcher("my regular expression");
//        System.out.println(m.find());

//        OuterClass outerObject = new OuterClass();
//        outerObject.method(2);
        Runnable r1 = new Runnable() {
 
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };
        Runnable r2 = () -> System.out.println("Hello world two!");
        r1.run();

        r2.run();
    }
}