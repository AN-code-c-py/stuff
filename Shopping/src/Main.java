
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 07 2021
 * Description: This is a program to calculate the price you will pay for the amount of keyboards, mice and USBs, that you will buy
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); //declare and initialize scanner
        
        final double USB_COST = 19.99;      //cost of USB         //declare variables
        final double KEYBOARD_COST = 49.99; //cost of keyboard
        final double MOUSE_COST = 25.99;    //cost of mouse
        int UsbCount;                //number of usbs user will purchase
        int KeyboardCount;           //number of keyboards user will purchase
        int MouseCount;              //number of mice user will purchase
        double Subtotal;            //subtotal of price before taxes ($)
        double Taxes;                //amount user will pay in taxes ($)
        double FinalPrice;          //Final price/ grand total
        
        System.out.println("Enter in the number of USB storage devices you would like to purchase: "); //user inputting the number of USBs they will buy
        UsbCount = keyedInput.nextInt();
        
        System.out.println("Enter in the number of Keyboards you would like to purchase: "); //user inputting the number of keyboards they will buy
        KeyboardCount = keyedInput.nextInt();
        
        System.out.println("Enter in the number of Mice you would like to purchase: "); //user inputting the nuumber of mice they will buy
        MouseCount = keyedInput.nextInt();
        
        Subtotal = (UsbCount * USB_COST)+(KeyboardCount * KEYBOARD_COST)+(MouseCount * MOUSE_COST); //subtotal calculations
        Taxes = Subtotal * 0.13; //taxes calculations
        FinalPrice = Subtotal + Taxes; //grand total price calculations
        
        System.out.println("The subtotal is $"+Subtotal); //subtotal output
        System.out.println("The amount you will pay in taxes is $"+Taxes); //taxes output
        System.out.println("The final price you will pay is $"+FinalPrice); //grand total price output
    }
    
}
