
package javaapplication60;
class Conversions
{
static double c2f(double degrees)
{
return degrees*9.0/5.0+32;
}
static double f2c(double degrees)
{
return (degrees-32)*5.0/9.0;
}
}
public class Car {
 
    public double operand1, operand2;
    public char operator;

    public double calculate()
    {
        double result;
        switch(this.operator)
        {
            case '+':
                result = this.operand1 + this.operand2;
                break;
            case '-':
                result = this.operand1 - this.operand2;
                break;
            case '*':
                result = this.operand1 * this.operand2;
                break;
            case '/':
                if(this.operand2 == 0)  // zbog deljenja nulom
                {
                    System.out.println("Deljenje nije moguce!");
                    result = 0;
                }
                else
                    result = this.operand1 / this.operand2;
                break;

            default:
                result = 0;
                break;
        }
        return result;
    }
    public static void main(String[] args) {
 
        int x = 5;
        System.out.println("This is initial value: " + x);
        passMethod(x);
        System.out.println("This is the value after the completion of the method: " + x);
 
    }
 
    public static void passMethod(int x) {
        x = 10;
        System.out.println("This is the value from method: " + x);
    }
 


    void print()
    {
        System.out.println("Selam");
    }
//        // konstruktor bez parametara
//Car()
//{
//        System.out.println("Car created");
//}
// 
//// konstruktor sa 1 parametrom tipa String
//Car(String filename)
//{
//        System.out.println(filename + "created");
//}
// 
String make;
String model;
int numDoors;
 
//Car(String make, String model) {
// 
//        /* ključna reč this se odnosi na objekat tekuće klase (kada bude bio napravljen) tj. this.make i this.model su polja klase, a make i model su argumenti konstruktora */
//this.make = make;
//this.model = model;
//}
// 
//Car(String make, String model, int nDoors) {
// 
//this.make = make;
//this.model = model;
// 
///*kada se parametar konstruktora ne zove isto kao polje klase, ne treba pisati this*/
//numDoors = nDoors;
//}
void printDetails()
{
System.out.println("Make = " + make);
System.out.println("Model = " + model);
System.out.println("Number of doors = " + numDoors);
}
}
