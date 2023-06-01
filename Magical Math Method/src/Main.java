
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 16 2021
 * Description: This is a program to calculate numbers inputted by the user in many different ways using math methods
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); //declare and initialize scanner

        //declare variables
        int OptionChoice = 0;    //User pick option
        int LargeIn1;   //largest number input 1
        int LargeIn2;   //largest number input 2
        int SmallIn1;   //smallest number input 1
        int SmallIn2;   //smallest number input 2
        int Base;   //number base input 
        int Power;  //number power input
        int SideA;  //side a input
        int SideB;  //side b input
        double RoundUp; //number round up input
        double RoundDown;   //number round down input
        int SquareRoot; //Square root input
        double Angle;   //angle input
        
        while (OptionChoice != 9)
        {
                 
            System.out.println("---------- Magical Math Methods ----------\n"); //Title
            System.out.println("1... Enter 2 integers and the program will output the largest");     //Option 1
            System.out.println("2... Enter 2 integers and the program will output the smallest");    //Option 2
            System.out.println("3... Enter a base integer and a power  integer and the program will output the base you inputted to the power you inputted");    //Option 3
            System.out.println("4... Enter the length(integer) of 2 sides of a triangle and the program will output the length of the hypotenuse");  //Option 4
            System.out.println("5... Enter a decimal value and the program will output the value rounded down to the nearest integer"); //Option 5
            System.out.println("6... Enter a decimal value and the program will output the value rounded up to the nearest integer");   //Option 6
            System.out.println("7... Enter an integer and the program will output the square root of that integer");    //Option 7
            System.out.println("8... Enter an angle in degrees and the program will output it in radians"); //Option 8
            System.out.println("9... Exit");    //Exit
            OptionChoice = keyedInput.nextInt();
        
            switch (OptionChoice) {
                case 1:
                    System.out.println("Enter in 2 integers");
                    LargeIn1 = keyedInput.nextInt();    //Getting user input
                    LargeIn2 = keyedInput.nextInt();    //Getting user input
                    System.out.println("\n"+ Math.max(LargeIn1,LargeIn2) +"\n");    //output
                    break;
                case 2:
                    System.out.println("Enter in 2 integers");
                    SmallIn1 = keyedInput.nextInt();    //Getting user input
                    SmallIn2 = keyedInput.nextInt();    //Getting user input
                    System.out.println("\n"+ Math.min(SmallIn1,SmallIn2) +"\n");    //output
                    break;
                case 3:
                    System.out.println("Enter in 2 integers");
                    Base = keyedInput.nextInt();    //Getting user input
                    Power = keyedInput.nextInt();    //Getting user input
                    System.out.println("\n"+ Math.pow(Base,Power) +"\n");    //output
                    break;
                case 4:
                    System.out.println("Enter in 2 integers");
                    SideA = keyedInput.nextInt();    //Getting user input
                    SideB = keyedInput.nextInt();    //Getting user input
                    System.out.println("\n"+ Math.hypot(SideA,SideB) +"\n");    //output
                    break;
                case 5:
                    System.out.println("Enter in a number");
                    RoundDown = keyedInput.nextDouble();    //Getting user input
                    System.out.println("\n"+ Math.floor(RoundDown) +"\n");    //output
                    break;
                case 6:
                    System.out.println("Enter in a number");
                    RoundUp = keyedInput.nextDouble();    //Getting user input
                    System.out.println("\n"+ Math.ceil(RoundUp) +"\n");    //output  
                    break;
                case 7:
                    System.out.println("Enter in a number");
                    SquareRoot = keyedInput.nextInt();    //Getting user input
                    System.out.println("\n"+ Math.sqrt(SquareRoot) +"\n");    //output 
                    break;
                case 8:
                    System.out.println("Enter in a number");
                    Angle = keyedInput.nextDouble();    //Getting user input
                    System.out.println("\n"+ Math.toRadians(Angle) +"\n");    //output 
                    break;
                case 9:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Incorrect Input. Please Try Again");
                    break;
            }
        }
    }
}
