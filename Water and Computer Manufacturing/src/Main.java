
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 07 2021
 * Description: This is a program to find the total amount of water used to manufacture your electronics
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);     //declare and initialize scanner
        
        double UserInput;    //number of computer/monitor combos the user has       //declare variables
        final double WATER = 1.5;  //tons of water
        double Answer;       // number of tons of water used to manufacture users electronics
    
        System.out.println("Type in the number of computer/monitor combos you have:");   //asking users for 
        UserInput = keyedInput.nextDouble();
    
        Answer = UserInput * WATER;
        System.out.println("The total number of tons of water used to manufacture your electronics is "+Answer+" tons");  //output of number of tons of water used to manufacture the users electronics
    }
    
}
