
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 13 2021
 * Description: This is a choose your own adventure game
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); //declare and initialize scanner
        
        //Declare variables
        String Response1;
        String Response2;
        String Response3;
        String Response4;
        String Response5;
        String Response6;
        String Response7;
        final String LEFT_CAP = "Left";
        final String RIGHT_CAP = "Right";
        final String LEFT_LOWER = "left";
        final String RIGHT_LOWER = "right";
        final String ERROR = "INVALID SYNTAX: ERROR 400";

        System.out.println("*DISCLAIMER: When answering the questions, either Capitalize the input, or write it all in lowercase.*\nYou were walkin down a somewhat secluded street in downtown Toronto \nwhen 2 very tall people jumped out of a van and kidnapped you. You\nwoke up and found yourself in a room with a door in front of you\nand a cupboard to the left.\nDo you go towards the door (write: door), or the cupboard (write: cupboard)?");    //Introduction of story
        Response1 = keyedInput.nextLine();
        
        if (Response1.equals("cupboard")||(Response1.equals("Cupboard")))
        {
            System.out.println("You open the cupboard and find a key in it that can be used to \nopen the door. When you put the key in the hole, the security \nsystem disengages, and the door opens. Now you enter a passage \nwith 2 doors, one on the left, and the other on the right. \nDo you go towards the door on the left (write: left) or the door on the right (write: right)."); //cupboard response
            Response2 = keyedInput.nextLine();
            
            if (Response2.equals(LEFT_LOWER)||(Response2.equals(LEFT_CAP)))
            {
                System.out.println("You walk into a dark hallway. You find a light above you, \nwhich you turn on to help guide yourself to the end of the \nhall, once you reach the end of the hall, there are 2 doors on \neither side of the room. \nDo you go towards the door on the left (write: left) or the door on the right (write: right)."); //Left Response
                Response3 = keyedInput.nextLine();
                
                if (Response3.equals(LEFT_LOWER)||(Response3.equals(LEFT_CAP)))
                {
                    System.out.println("A trap door opens beneath you into a giant lava pit. \nYou Die. \nTry Again.");   //left response
                }else if (Response3.equals(RIGHT_LOWER)||(Response3.equals(RIGHT_CAP)))
                {
                    System.out.println("You now enter another room, with 2 more doors on either \nside. You wonder why an architect would design such a \nterrible designed building with so many useless rooms. \nDo you go towards the door on the left (write: left) or the door on the right (write: right).");   //right response
                    Response5 = keyedInput.nextLine();
                    
                    if (Response5.equals(LEFT_LOWER)||(Response5.equals(LEFT_CAP)))
                    {
                        System.out.println("Ahhh at last. Fresh air. You are finally Free. \nYAY. \nYou sucessfully completed the game.");   //left answer (final)
                    }else if (Response5.equals(RIGHT_LOWER)||(Response5.equals(RIGHT_CAP)))
                    {
                        System.out.println("You hear a lion roar, but it's too late. \nYou Died. \nTry Again.");   //right answer
                    }else{
                        System.out.println(ERROR);
                    }
                }else{
                    System.out.println(ERROR);
                }
            }else if (Response2.equals(RIGHT_LOWER)||(Response2.equals(RIGHT_CAP)))
            {
                System.out.println("You find yourself in abother room with 2 more doors.\nDo you go towards the door on the left (write: left) or the door on the right (write: right).");  //right response
                Response4 = keyedInput.nextLine();
                
                if (Response4.equals(LEFT_LOWER)||(Response4.equals(LEFT_CAP)))
                {
                    System.out.println("You find yourself in a pretty small, dimly-lit room, with 2 \nmore doors on either side of the room. \nDo you go towards the door on the left (write: left) or the door on the right (write: right)."); //left response
                    Response6 = keyedInput.nextLine();
                    
                    if (Response6.equals(LEFT_LOWER)||(Response6.equals(LEFT_CAP)))
                    {
                        System.out.println("You get devoured by a tiger. \nYou Died. \nTry Again.");
                    }else if (Response6.equals(RIGHT_LOWER)||(Response6.equals(RIGHT_CAP)))
                    {
                        System.out.println("You are in another small room with 2 doors on either side. \nDo you go towards the door on the left (write: left) or the door on the right (write: right).");
                        Response7 = keyedInput.nextLine();
                        
                        if (Response7.equals(LEFT_LOWER)||(Response7.equals(LEFT_CAP)))
                        {
                            System.out.println("You finally took your first breath of fresh air in a while. \nYou're finally free. \nYAY. \nYou sucessfully completed the game.");   //left response (final)
                        }else if (Response7.equals(RIGHT_LOWER)||(Response7.equals(RIGHT_CAP)))
                        {
                            System.out.println("A horde of zombies rush towards you as you... \nYou Died. \nTry Again.");   //right response
                        }else{
                            System.out.println(ERROR);
                        }
                    }else{
                        System.out.println(ERROR);
                    }
                }else if (Response4.equals(RIGHT_LOWER)||(Response4.equals(RIGHT_CAP)))
                {
                    System.out.println("A giant, venomous cobra jumps up at you and bites you in the neck. \nYou Died. \nTry Again. "); //right response
                }else{
                    System.out.println(ERROR);
                }
            }else{
                System.out.println(ERROR);
            }
        }else if (Response1.equals("door")||(Response1.equals("Door")))
        {
            System.out.println("You turn the handle on the door, when all of a sudden, a loud beeping \nnoise went off, and a poisonous smoke filled the room.\nYou Died.\nTry Again.");      //door response
        }else{
            System.out.println(ERROR);
        }
    }
    
}
