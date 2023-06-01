/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 21 2021
 * Description: This is the Max/Min challenge where I'll be designing a program that creates an array of 10 random numbers between 
 * 1 and 100 and displays the array to the user. The program will then scan the array and determine the maximum value and the minimum
 * value and display those values to the user. 
 */
public class Main {
    public static int[] RandomizeIntegers (int arr [], int n1) {
        for (int i = 0; i <arr.length; i++)    //check each number of the array
        {
            arr[i] = (int) (Math.random()*n1 + 1);  //making the array random numbers
        }
        return arr;
    }
    public static void IntMinMaxCalc (int arr []) {
        int SmallestNumber = arr[0];
        int LargestNumber= 0;
        for (int i = 0; i <arr.length; i++)    //check each number of the array
        {
            if (arr[i] <= SmallestNumber)    //if number is smaller than the smallest number
            {
                SmallestNumber = arr[i];    //replace smallest number with that number
            }
            if (arr[i] > LargestNumber) //if number is larger than the largest number
            {
                LargestNumber = arr[i]; //replace largest number with that number
            }
        }
        Output(SmallestNumber,LargestNumber);   //Calling output method
   }
    public static void Output(int n1, int n2) {
        System.out.println("The smallest number is " + n1); //smallest number output
        System.out.println("The largest number is " + n2);   //largest number output
    }
    public static void main(String[] args) {
        int RandomArray [] = new int [10];
        final int INT_COUNT = RandomArray.length;
        
        RandomArray = RandomizeIntegers (RandomArray, INT_COUNT);   //Making RandomArray a bunch of randommized integers
                
        IntMinMaxCalc (RandomArray); //Calling minimum and maximum calculations
        
    }
    
}
