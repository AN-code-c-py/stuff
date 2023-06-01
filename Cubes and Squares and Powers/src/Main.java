
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 14 2021
 * Description: This is a program to find certain numbers powered to other specified numbers  
 */
public class Main {
    public static void main(String[] args) {
         Scanner keyedInput = new Scanner(System.in); //declare and initialize scanner
        
        //declare variables
        int choice = 0; //User Input
        int Option1 = 0;    //Option 1 base input
        int Option2 = 0;    //Option 2 base input
        int Option3Base = 0;    //Option 3 base input
        int Option3Exponent = 0;    //Option 3 power input
        int Option1Answer = 0;  //Option 1 answer
        int Option2Answer = 1;  //Option 2 answer
        int Option3Answer = 1;  //Option 3 answer
        
        
        while (choice != 4)
        {
          
        System.out.println("---Cubes and Squares and Powers---");  //Title
        System.out.println("");
        
        System.out.println("Please enter your choice: ");
        System.out.println("1... Find the value of a number squared"); //Option 1
        System.out.println("2... Find the value of a number cubed "); //Option 2
        System.out.println("3... Find the value of a number, to any power"); //Option 3
        System.out.println("4... Exit"); //Option 4
        System.out.println("");
        
        choice = keyedInput.nextInt();
        
        System.out.println("");
        System.out.println("---------------------------------------------------");
        
        if (choice == 1)
        {
            System.out.println("What number would you like to square?");    //asking what number user would like to square
            Option1 = keyedInput.nextInt(); //getting user input
            Option1Answer = Option1*Option1;    //calculations for squaring number
            System.out.println(Option2Answer);  //output answer
            
        }else if (choice == 2)
        {
            System.out.println("What number would you like to cube?");  //asking what number user would like to cube
            Option2 = keyedInput.nextInt(); //getting user input
            
            for (int i= 1; i <=3; i++)
            {
                Option2Answer = Option2Answer * Option2;
            }
            System.out.println(Option2Answer);  //output answer
        }else if (choice == 3)
        {
            System.out.println("What number would you like as the base?");  //user inputting base
            Option3Base = keyedInput.nextInt(); //getting user input
            System.out.println("What number would you like as the exponent");   //user inputting exponent
            Option3Exponent = keyedInput.nextInt(); //getting user input
            
            //Calculations for user inputted power and base
            for (int i= 1; i <=Option3Exponent; i++)
            {
                Option3Answer = Option3Answer * Option3Base;
            }
            System.out.println(Option3Answer);  //output answer
        }else if (choice == 4)
        {
            System.out.println("");
        }else
        {
            System.out.println("ERROR: USER INPUT INCORRECT");  //output if user types in something random
        }
        }
    }
    
}
