
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 23 2021
 * Description: This is a program that will validate user input
 */
public class Main {
    public static boolean Stage1 (String In) {
        
        boolean Valid;  //validity check variable
        
        Valid = In.length() > 6;    //calculations to make sure input fits proper parameters given
        
    
        if (Valid == true)
        {
            System.out.println("Congratulations");  //if valid is true
        }
        else
        {
            System.out.println("String not long enough. Please Try Again"); //if valid is false 
       }
        
        return Valid;
    }
    public static boolean Stage2 (String In) {
        
        boolean Valid;  //validity check variable
        
        Valid = In.contains("a");   //calculations to make sure input fits proper parameters given
        
    
        if (Valid == true)
        {
            System.out.println("Congratulations");  //if valid is true
        }
        else
        {
            System.out.println("String doesn't contain lowercase *a*. Please Try Again");   //if valid is false 
        }
        
        return Valid;
    }
    public static boolean Stage3 (String In) {
        
        boolean Valid;  //validity check variable
        
        Valid = In.length() >= 5 && In.length() <= 15 && !(In.contains("z")||In.contains("Z"));   //calculations to make sure input fits proper parameters given
        
    
        if (Valid == true)
        {
            System.out.println("Congratulations");  //if valid is true
        }
        else
        {
            System.out.println("String is too short and/or long and/or contains letter z. Please Try Again");   //if valid is false 
        }
        
        return Valid;
    }
     public static boolean Stage4 (String In) {
        
        boolean Valid;  //validity check variable
        
        try {   //test for errors whilst being excecuted
        int InInt = Integer.parseInt(In);   //making the string an integer
        Valid = InInt >= 5 && InInt <= 500; //calculations to make sure input fits proper parameters given
        } catch(NumberFormatException e) {  //define a block of code to be executed if error occurs in try
            Valid = false;
        }
    
        if (Valid == true)
        {
            System.out.println("Congratulations");  //if valid is true
        }
        else
        {
            System.out.println("Input should be an Integer between 5 and 500. Please Try Again");  //if valid is false 
        }
        
        return Valid;
     }
     public static boolean Stage5 (String In) {
        
        boolean Valid;  //validity check variable
        
        try {   //test for errors whilst being excecuted
        int InInt = Integer.parseInt(In);   //making the string an integer
        Valid = InInt < 0; //calculations to make sure input fits proper parameters given
        } catch(NumberFormatException e) {  //define a block of code to be executed if error occurs in try
            Valid = false;
        }
        
    
        if (Valid == true)
        {
            System.out.println("Congratulations");  //if valid is true
        }
        else
        {
            System.out.println("Input needs to be a negative integer. Please Try Again");    //if valid is false 
        }
        
        return Valid;
     }
     public static boolean Stage6 (String In) {
        
        boolean Valid;  //validity check variable
        
        try {   //test for errors whilst being excecuted
        int InInt = Integer.parseInt(In);   //making the string an integer
        Valid = InInt > 0 && InInt % 2 != 0;  //calculations to make sure input fits proper parameters given
        } catch(NumberFormatException e) {  //define a block of code to be excecuted if error occours
            Valid = false;
        }
        
    
        if (Valid == true)
        {
            System.out.println("Congratulations");  //if valid is true
        }
        else
        {
            System.out.println("Integer is negative and/or even. Please Try Again");    //if valid is false 
        }
        
        return Valid;
     }
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);    //declare and initialize scanner
        
        //declare variables
        boolean Stg1Valid = false;
        boolean Stg2Valid = false;
        boolean Stg3Valid = false;
        boolean Stg4Valid = false;
        boolean Stg5Valid = false;
        boolean Stg6Valid = false;
        String Stg1In;
        String Stg2In;
        String Stg3In;
        String Stg4In;
        String Stg5In;
        String Stg6In;
        
        //Stage 1
        while (Stg1Valid == false)
        {
            System.out.println("Enter a string that is longer than 6 characters:"); //asking user to enter string
            Stg1In = keyedInput.nextLine();   //assign input to variable
            System.out.println("");
            
            Stg1Valid = Stage1(Stg1In);
        }
        //Stage 2
        while (Stg2Valid == false)
        {
            System.out.println("Enter a string that contains atleast lowercase *a*:");  //asking user to enter string
            Stg2In = keyedInput.nextLine();   //assign input to variable
            System.out.println("");
            
            Stg2Valid = Stage2(Stg2In);
        }
        //Stage 3
        while (Stg3Valid == false)
        {
            System.out.println("Enter a string that is between 5-15 characters long and doesn't contain the letter *z*:");  //asking user to enter string
            Stg3In = keyedInput.nextLine();   //assign input to variable
            System.out.println("");
            
            Stg3Valid = Stage3(Stg3In);
        }
        //Stage 4
        while (Stg4Valid == false)
        {
            System.out.println("Enter an integer between 5 and 500:");  //asking user to enter integer
            Stg4In = keyedInput.nextLine();    //assign input to variable
            System.out.println("");
            
            Stg4Valid = Stage4(Stg4In);
        }
        //Stage 5
        while (Stg5Valid == false)
        {
            System.out.println("Enter a negative integer:");    //asking user to enter integer
            Stg5In = keyedInput.nextLine();    //assign input to variable
            System.out.println("");
            
            Stg5Valid = Stage5(Stg5In);
        }
        //Stage 6
        while (Stg6Valid == false)
        {
            System.out.println("Enter a positive, odd, integer:");  //asking user to enter integer
            Stg6In = keyedInput.nextLine();    //assign input to variable
            System.out.println("");
            
            Stg6Valid = Stage6(Stg6In);
        }
    }
}
