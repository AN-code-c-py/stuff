
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 19 2021
 * Description: This is a program to calculate numbers inputted by the user in many different ways using math methods with subroutines
 */
public class Main {
    
    public static void menu () {
  /*
  * Name: menu()
  * Description:
  * Display a menu of options to the user
  * Return: void
  */
        System.out.println("--------- Different Math Calculations ---------");  //Title
        System.out.println("1... Enter 2 integers and the program will output the smallest");   //find smallest integer
        System.out.println("2... Enter 2 integers and the program will output the largest");    //find largest integer
        System.out.println("3... Enter a base and a power and the program will output the base you inputted to the power you inputted");    //power
        System.out.println("4... Enter a decimal value and the program will round the value to the nearest integer");   //round
        System.out.println("5... Enter an integer and the program will output the square root of that integer");    //square root
        System.out.println("6... Enter 2 integers and the program will output the sum");    //add
        System.out.println("7... Enter 2 integers and the program will output the difference"); //subtract
        System.out.println("8... Enter 2 integers and the program will output the product");    //multiply
        System.out.println("9... Enter 2 integers and the program will output the quotient");   //divide
        System.out.println("10... Enter an angle in degrees and the program will output it in radians");    //angles to radians
        System.out.println("11... Exit");   //exit
        System.out.println("-----------------------------------------------");
    }
    
    public static int largeInt (int n1, int n2) {
  /*
  * Name: largeInt (int n1, int n2) 
  * Description:
  * calculate the largest integer out of the 2 options given
  * Parameters: 
  * n1 --> the first number
  * n2 --> the second nuber
  * Return: int
  */
        int largest = Math.max(n1,n2);
        return (largest);
    }
    
    public static int smallInt (int n1, int n2) {
  /*
  * Name: smallInt (int n1, int n2) 
  * Description:
  * calculate the smallest integer out of the 2 options given
  * Parameters: 
  * n1 --> the first number
  * n2 --> the second nuber
  * Return: int
  */
        int smallest = Math.min(n1,n2);
        return (smallest);
    } 
    
    public static int powers (int n1, int n2) {
  /*
  * Name: powers (int n1, int n2) 
  * Description:
  * calculate power specified by the user to a given base that is also specified by the user
  * Parameters: 
  * n1 --> the user-specified base
  * n2 --> the user-specified power
  * Return: int
  */
        int answer = (int) Math.pow(n1, n2);
        return (answer);
    }
    
    public static int round (double n1) {
  /*
  * Name: round (int n1, int n2) 
  * Description:
  * round a number to its nearest integer
  * Parameters: 
  * n1 --> the number
  * Return: int
  */
        double RoundedValue = Math.round(n1);
        return (int) (RoundedValue);
    }
    
    public static double SqRt (double n1) {
  /*
  * Name: SqRt (int n1) 
  * Description:
  * calculate the square root of a number and have it outputted
  * Parameters: 
  * n1 --> the number meant to be square-rooted
  * Return: int
  */
        double SquareRt = Math.sqrt(n1);
        return (SquareRt);
    }
    
    public static void sumOut (int n1, int n2) {
  /*
  * Name: sumOut (int n1, int n2) 
  * Description:
  * calculate the sum of 2 numbers and output it
  * Parameters: 
  * n1 --> the first number
  * n2 --> the second nuber
  * Return: void
  */
        int sum = n1 + n2;
        System.out.println("\nThe sum of both numbers is " + sum + "\n");
    }
    
    public static void diffOut (int n1, int n2) {
   /*
  * Name: diffOut (int n1, int n2) 
  * Description:
  * calculate the sum of 2 numbers and output it
  * Parameters: 
  * n1 --> the first number
  * n2 --> the second nuber
  * Return: void
  */
        int diff = n1 - n2;
        System.out.println("\nThe difference of these numbers is " + diff + "\n");
    }
    
    public static int product (int n1, int n2) {
  /*
  * Name: product (int n1, int n2) 
  * Description:
  * calculate the product of 2 numbers
  * Parameters: 
  * n1 --> the first number
  * n2 --> the second nuber
  * Return: int
  */
        int product = n1 * n2;
        return(product);
    }
    
    public static double quotient (int n1, int n2) {
        /*
  * Name: quotient (int n1, int n2) 
  * Description:
  * calculate the quotient of 2 numbers
  * Parameters: 
  * n1 --> the first number
  * n2 --> the second nuber
  * Return: int
  */
        double product = n1 / n2;
        return (product);
    }
    
    public static double DegreesRadians (double n1) {
  /*
  * Name: DegreesRadians (int n1) 
  * Description:
  * convert number in degrees to radians
  * Parameters: 
  * n1 --> the angle
  * Return: double
  */
        double RadianValue = Math.toRadians(n1);
        return (RadianValue);
    }
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); //declare and initialize scanner
        
        int OptionChoice = 0;
        int SmallInt1;
        int SmallInt2;
        int LargeInt1;
        int LargeInt2;
        int Base;
        int Power;
        double Round;
        double SquareRoot;
        int Sum1;
        int Sum2;
        int Diff1;
        int Diff2;
        int Prod1;
        int Prod2;
        int Quo1;
        int Quo2;
        double DegRad;
        
        while  (OptionChoice != 11)
        {
            menu();
            OptionChoice = keyedInput.nextInt();
            
            switch (OptionChoice) {
                case 1:
                    System.out.println("Enter 2 integers: "); //asking user to input 2 integers
                    SmallInt1 = keyedInput.nextInt();   //user input
                    SmallInt2 = keyedInput.nextInt();   //user input
                    System.out.println("\nThe smallest of these numbers is " + smallInt(SmallInt1, SmallInt2) + "\n");  //output
                    break;
                case 2:
                    System.out.println("Enter 2 integers: "); //asking user to input 2 integers
                    LargeInt1 = keyedInput.nextInt();   //user input
                    LargeInt2 = keyedInput.nextInt();   //user input
                    System.out.println("\nThe largest of these numbers is " + largeInt(LargeInt1, LargeInt2) + "\n");  //output
                    break;
                case 3:
                    System.out.println("Enter a base: ");
                    Base = keyedInput.nextInt();
                    System.out.println("Enter a power: ");
                    Power = keyedInput.nextInt();
                    System.out.println("\nThe answer is " + powers(Base, Power) + "\n");   //output
                    break;
                case 4:
                    System.out.println("Enter a number: ");
                    Round = keyedInput.nextDouble();
                    System.out.println("\nThe rounded integer is " + round(Round) + "\n");  //output
                    break;
                case 5:
                    System.out.println("Enter an integer: ");
                    SquareRoot = keyedInput.nextDouble();
                    System.out.println("\nThe square root of this number is " + SqRt(SquareRoot) + "\n");   //output
                    break;
                case 6:
                    System.out.println("Enter 2 integers: "); //asking user to input 2 integers
                    Sum1 = keyedInput.nextInt();    //user input
                    Sum2 = keyedInput.nextInt();    //user input
                    sumOut (Sum1, Sum2);    //output
                    break;
                case 7:
                    System.out.println("Enter 2 integers: "); //asking user to input 2 integers
                    Diff1 = keyedInput.nextInt();   //user input
                    Diff2 = keyedInput.nextInt();   //user input
                    diffOut (Diff1, Diff2); //output
                    break;
                case 8:
                    System.out.println("Enter 2 integers: "); //asking user to input 2 integers
                    Prod1 = keyedInput.nextInt();   //user input
                    Prod2 = keyedInput.nextInt(); //user input
                    System.out.println("\nThe product of both numbers is " + product(Prod1, Prod2) + "\n");   //output
                    break;
                case 9:
                    System.out.println("Enter 2 integers: "); //asking user to input 2 integers
                    Quo1 = keyedInput.nextInt();    //user input
                    Quo2 = keyedInput.nextInt();    //user input
                    System.out.println("\nThe quotient of these numbers is " + quotient(Quo1, Quo2) + "\n");  //output
                    break;
                case 10:
                    System.out.println("Enter a number: ");
                    DegRad = keyedInput.nextDouble();
                    System.out.println("This angle in radians is " + DegreesRadians(DegRad) + "\n");
                    break;
                case 11:
                    System.out.println("");
                    break;
                default:
                    System.out.println("INCORRECT INPUT. PLEASE RE-RENTER.");
                    break;
            }
        }
    }
    
}
