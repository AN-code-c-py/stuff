
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 16 2021
 * Description: This is a program to solve problems using string methods
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); //declare and initialize scanner
        
        //declare variables
        int OptionChoice = 0;
        String NumberOfCharacters;
        String ChangeToUpCase;
        String Output4thSpot;
        String IdenticalCheck1;
        String IdenticalCheck2;
        String LetterCheckString;
        String LetterCheckChar;
        String Output4To6;
        String ReplaceAWithX;
        
        while (OptionChoice != 8)
        {
            System.out.println("---------- Super String Software ----------\n"); //Title
            System.out.println("1... Enter a string. The program will output the number of characters in the string");     //Option 1
            System.out.println("2... Enter a string using lowercase letters. The program will output the program all in capital letters");    //Option 2
            System.out.println("3... Enter a string. The program will output the character in the 4th spot.");    //Option 3
            System.out.println("4... Enter 2 strings. The program will output if they are identical or not");  //Option 4
            System.out.println("5... Enter a string and a letter. The program will find if that letter is in the string."); //Option 5
            System.out.println("6... Enter a string that is at least 8 characters long. The program will output characters 4 to 6.");   //Option 6
            System.out.println("7... Enter a string that contains atleast 1 *a* The program will replace all the letter *a*'s with *x*'s.");    //Option 7
            System.out.println("8... Exit");    //Exit
            OptionChoice = keyedInput.nextInt();
            
            switch (OptionChoice) {
                case 1:
                    Scanner keyedInput1 = new Scanner(System.in);   //declare and initialize scanner for this input
                    System.out.println("Enter a string below: ");   //asking for string
                    NumberOfCharacters = keyedInput1.nextLine();    //getting input
                    System.out.println(NumberOfCharacters.length());    //outputting characters
                    break;
                case 2:
                    Scanner keyedInput2 = new Scanner(System.in);   //declare and initialize scanner for this input
                    System.out.println("Enter a string below in lowercase letters: ");   //asking for string
                    ChangeToUpCase = keyedInput2.nextLine();    //getting input
                    System.out.println(ChangeToUpCase.toUpperCase());    //outputting characters
                    break;
                case 3:
                    Scanner keyedInput3 = new Scanner(System.in);   //declare and initialize scanner for this input
                    System.out.println("Enter a string below: ");   //asking for string
                    Output4thSpot = keyedInput3.nextLine();    //getting input
                    System.out.println(Output4thSpot.charAt(3));    //outputting characters
                    break;
                case 4:
                    Scanner keyedInput4 = new Scanner(System.in);   //declare and initialize scanner for this input
                    System.out.println("Enter a string below: ");   //asking for string
                    IdenticalCheck1 = keyedInput4.nextLine();   //getting input
                    System.out.println("Enter another string below");   //asking for string
                    IdenticalCheck2 = keyedInput4.nextLine();   //getting input
                    if (IdenticalCheck1.equals(IdenticalCheck2))    //checking if strings are same
                    {
                        System.out.println("true"); //if they are the same
                    }
                    else
                    {
                        System.out.println("false");    //if they are different
                    }
                    break;
                case 5:
                    Scanner keyedInput5 = new Scanner(System.in);   //declare and initialize scanner for this input
                    System.out.println("Enter a string below: ");   //asking for string
                    LetterCheckString = keyedInput5.nextLine();    //getting input
                    System.out.println("Enter a character below");  //asking for string
                    LetterCheckChar = keyedInput5.nextLine();   //getting input
                    if (LetterCheckString.contains(LetterCheckChar))    //checking for letter
                    {
                        System.out.println("true"); //if true
                    }
                    else
                    {
                        System.out.println("false");    //if false
                    }
                    break;
                case 6:
                    Scanner keyedInput6 = new Scanner(System.in);   //declare and initialize scanner for this input
                    System.out.println("Enter a string below: ");   //asking for string
                    Output4To6 = keyedInput6.nextLine();    //getting input
                    System.out.println(Output4To6.substring(3, 6));    //outputting characters
                    break;
                case 7:
                    Scanner keyedInput7 = new Scanner(System.in);   //declare and initialize scanner for this input
                    System.out.println("Enter a string below that contains atleast 1 a: ");   //asking for string
                    ReplaceAWithX = keyedInput7.nextLine();    //getting input
                    System.out.println(ReplaceAWithX.replace("a","x"));    //outputting characters
                    break;
                case 8:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Invalid Entry. Please try again.");
                    break;
            }
        }
    }
    
}
