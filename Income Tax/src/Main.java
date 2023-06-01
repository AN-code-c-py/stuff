
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 07 2021
 * Description: This is a program to find the amount you ow in taxes
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); //declare and initialize scanner
        
        final double TAX1 = 0.15;
        final double TAX2 = 0.205;
        final double TAX3 = 0.26;
        final double TAX4= 0.29;
        final double TAX5 = 0.33;
        double Salary1;      //amount user makes in 1st tax bracket     //declare variables
        double Salary2;     //amount user makes in 2nd tax bracket
        double Salary3;     //amount user makes in 3rd tax bracket
        double Salary4;     //amount user makes in 4th tax bracker
        double Salary5;     //amount user makes in 5th tax bracket
        double Tax;         //amount user needs to pay in taxes ($)
        
        
        System.out.println("Enter in the money you make between 0 - 49,020 (If you make more than 49,020 a year write 49,020):"); //user inputting salary between numbers
        Salary1 = keyedInput.nextDouble();
        
        System.out.println("Enter in the money you make between 49,020 - 98,040 (If you make more than 98,040 a year write 49,020)(If you don't make money in this bracket write 0):"); //user inputting salary between numbers
        Salary2 = keyedInput.nextDouble();
        
        System.out.println("Enter in the money you make between 98,040 - 151,978 (If you make more than 151,978 a year write 53,939)(If you don't make money in this bracket write 0):"); //user inputting salary between numbers
        Salary3 = keyedInput.nextDouble();
        
        System.out.println("Enter in the money you make between 151,978 - 216,511 (If you make more than 216,511 a year write 64,533)(If you don't make money in this bracket write 0):"); //user inputting salary between numbers
        Salary4 = keyedInput.nextDouble();
        
        System.out.println("Enter in the money you make over 216,511 a year(If you don't make money in this bracket write 0):"); //user inputting salary between numbers
        Salary5 = keyedInput.nextDouble();
        
        
        
        Tax = (Salary1 * TAX1)+(Salary2 * TAX2)+(Salary3 * TAX3)+(Salary4 * TAX4)+(Salary5 * TAX5);
        
        System.out.println("You owe $"+Tax+" in taxes");  //output for the taxes that the user owes
    }
    
}
