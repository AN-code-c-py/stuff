
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 15 2021
 * Description: This is a program to find the average of the users past 5 assignment marks to find the users final grade.  
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);    //declare and initialize scanner
        
        //declare variables
        int AverageMark;
        int GradeSum = 0;
        final int NUMBER_OF_ASSIGNMENTS = 5;
        
        int [ ] grades = new int [NUMBER_OF_ASSIGNMENTS];   //declaring array
        
        System.out.println("Enter your past 5 assignment marks:");   //asking for marks
        for (int i =0; i <NUMBER_OF_ASSIGNMENTS; i++)
        {
            grades[i] = keyedInput.nextInt();   //marks input
            GradeSum = GradeSum + grades[i];    //Number of all marks added
        }
        
        AverageMark = GradeSum/NUMBER_OF_ASSIGNMENTS;   //average calculation
        
        System.out.println(" \nYour final grade is " + AverageMark); //final grade output
        
    }
    
}
