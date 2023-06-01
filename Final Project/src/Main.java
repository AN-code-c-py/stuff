
import java.util.Random;    //import command to access random class
import java.util.Scanner;   //import command to access scanner class

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 27 2021
 * Description: This is a game that will make you enter a number from 1 to 10 and see if it matches the one chose by the computer
 */

public class Main {
    /*
    * Name: exitGameOutput
    *
    * Description: it will see whether or not the user wants to exit the game and output the necessary ending or continue with the game
    *
    * Parameters: int, final int, double, double, string, int, int
    *
    * Returns: void
    */
    public static void exitGameOutput(int In, final int Exit, double Total, double Correct, String StrIn, int Comp, int n3) {
        double Percentage;  //declare variable to calculate percentage
        Scanner keyedInput;
        while (In != Exit) {    //while the input is less than 11, the following commands will occur
            Total++;
            final boolean match = Compare(StrIn, Comp, Correct, Total, n3);
            if (match) {
                Correct++;
            }
            keyedInput = new Scanner(System.in);
            StrIn = keyedInput.nextLine();
            
            In = ParseIn(In, StrIn);
        }
        if (In == Exit) {   //if the input is 11, the following commands will occur
            if (Total > 0) {
                Percentage = (Correct/Total) * 100;
                System.out.println("Thanks for playing. Goodbye. You got " + Math.round(Percentage) + "% of the answers correct."); //outputting percentage
            } else if (Correct == 0) {
                System.out.println("Thanks for playing. Goodbye. You got 0% of the answers correct.");  //outputting this if all the answers are wrong
            }
        } else if (In >= Total) {
            System.out.println("Enter an integer between 1 and 10.");
        }
    }
    /*
    * Name: ParseIn
    *
    * Description: it will convert a string to an integer but still allow non integers to pass
    *
    * Parameters: int, string
    *
    * Returns: int
    */
    public static int ParseIn(int In, String StrIn) {
        try {
            In = Integer.parseInt(StrIn);
        } catch (NumberFormatException e) {
            System.out.println();
        }
        return In;
    }
    /*
    * Name: Randomize
    *
    * Description: it will make a random integer and return that integer to the main program
    *
    * Returns: int
    */
    public static int Randomize() {
        Random rand = new Random();
        int upperBound = 11;
        int randomNum = rand.nextInt(upperBound);
        return randomNum;
    }
    /*
    * Name: Compare
    *
    * Description: it will compare the user inputted number with the number created by the program and output lines as necessary
    *
    * Parameters: string, int, double, double, int
    *
    * Returns: boolean
    */
    public static boolean Compare(String In, int Comp, double correct, double total, int n3) {
       
        boolean validInput;
        boolean match = false;
        int intIn;
        
        try {
            intIn = Integer.parseInt(In);
            validInput = true;
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input. You need to input an integer between 1 and 10.\n");   //if the input is not an integer betweeen 1 and 10
            return false;
        }
        if (intIn > n3) {
            System.out.println("Enter an integer between 1 and 10.\n");
            return false;
        }
        
        if (validInput) {
            if (intIn == Comp) {    //if input equals the computer value
                System.out.println("CONGRATULATIONS. YOU GOT THE SAME NUMBER AS ME.\n");    //output this message  
                return true;
            } else {    //if it doesn't
                System.out
                    .println(
                        "Oooh. Unfortunately, you didn’t get the same number as me, but you can always try again.\n");  //output this message instead
                return false;
            }
        }
        return match;
    }
    public static void main(final String[] args) {
        Scanner keyedInput = new Scanner(System.in);    //Scanner keyedInput = new Scanner(System.in); //declare and initialize scanner
        
        //declare variables
        final int highestValue = 10;    //the highest value constant
        final int Exit = 11;    //the value needed to exit the game constant
        String userInput;   //user input (string)
        int computerValue;  //randomly generated integer by the computer
        double totalAttempts = 0;   //number of attempts
        double correctAttempts = 0; //number of correct attempts
        
        computerValue = Randomize();    //making the variable computerValue equal the integer the method Randomize() returned to the main method

        System.out.println("Please enter a number between 1 and 10. To exit, please enter 11. ");   //Asking user to input a number between 1 and 10, or asking the user to quit by inputting 11
        userInput = keyedInput.nextLine();  //storing the input
        int intUserInput = 0;   //initialize integer variable
        intUserInput = ParseIn(intUserInput, userInput);    //converting string to integer method

        System.out.println("Computer Value: " + computerValue);   //testing line (Don't activate unless testing)
        
        exitGameOutput(intUserInput, Exit, totalAttempts, correctAttempts, userInput, computerValue, highestValue); //calling Exit Game Output method
    }
}