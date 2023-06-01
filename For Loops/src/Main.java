
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 14 2021
 * Description: This is a program to count to and from specific numbers specified by the user  
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); //declare and initialize scanner
        
        //declare variables
        int choice =0;
        
        System.out.println("---Cool Counting Program---");  //Title
        System.out.println("");
        
        System.out.println("Please enter your choice: ");
        System.out.println("1... Count from 0 to 10 by 1"); //Option 1
        System.out.println("2... Count from 100 to 0 by 10");   //Option 2
        System.out.println("3... Count from 50 to 500 by 50");  //Option 3
        System.out.println("4... Count from 6000 to 1000 by 1000"); //Option 4
        
        choice = keyedInput.nextInt();  //Gathering User Input
        
        System.out.println("");
        System.out.println("------------------------------------------");
        
        if (choice == 1)
        {
            for (int i= 1; i <=10; i++)
            {
                System.out.println(i); //output if user selects 1
            }
        }else if (choice == 2)
        {
            for (int i= 100; i >=0; i = i-10)
            {
                System.out.println(i);  //output if user selects 2
            }
        }else if (choice == 3)
        {
            for (int i= 50; i <=500; i = i+50)
            {
                System.out.println(i);  //output if user selects 3
            }
        }else if (choice == 4)
        {
            for (int i= 6000; i >=1000; i= i-1000)
            {
                System.out.println(i);  //output if user selects 4
            }
        }else
        {
            System.out.println("ERROR: USER INPUT INCORRECT");  //output if user types in something random
        }
    }
    
}