
import java.util.Scanner; //import command to access scanner

/**
 * File: Main.java
 * Version: 1.0
 * Author: Ajitesh Nagarajan
 * Date: July 12 2021
 * Description: This is a math test program  
 */ class Main {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); //declare and initialize scanner
        
        String Q1;    //question 1 value
        String Q2;    //question 2 value
        String Q3;    //question 3 value
        String Q4;    //question 4 value
        String Q5;    //question 5 value
        int Q6;     //question 6 value
        int Q7X;    //question 7 value of x
        int Q7Y;    //question 7 value of y
        boolean Q8;
        final String Q1A1 = "b";    //question 1 answer
        final String Q2A1 = "c";    //question 2 answer
        final String Q3A1 = "a";    //question 3 answer
        final String Q4A1 = "c";    //question 4 answer
        final String Q5A1 = "d";    //question 5 answer
        final int Q6A = -22;     //question 6 answer
        final int Q7XA = 68;    //question 7 answer of x
        final int Q7YA = -48;    //question 7 answer of y
        final boolean Q8A = true;
        final String Q1A2 = "B";    //question 1 other answer
        final String Q2A2 = "C";    //question 2 other answer
        final String Q3A2 = "A";    //question 3 other answer
        final String Q4A2 = "C";    //question 4 other answer
        final String Q5A2 = "D";    //question 5 other answer
        double NumberCorrect = 0;  //number of correct answers
        double NumberIncorrect = 0;    //number of incorrect answers
        final double NUMBER_OF_QUESTIONS = 8;
        double Percentage;  //percentage mark user got
        
        System.out.println("What is 2x2: (a = 2, b = 4, c = 8, d = 22)"); //output question
        Q1 = keyedInput.nextLine(); //getting user input
        System.out.println("What is 5+25: (a = 5, b = 25, c = 30, d = 125)");//output question
        Q2 = keyedInput.nextLine(); //getting user input
        System.out.println("What is 4!: (a = 24, b = 4, c = 8, d = 32)");//output question
        Q3 = keyedInput.nextLine(); //getting user input
        System.out.println("What is 13^2: (a = 132, b = 13, c = 169, d = 196)");//output question
        Q4 = keyedInput.nextLine(); //getting user input
        System.out.println("What is 55 + 65: (a = 90, b = 100, c = 110, d = 120)");//output question
        Q5 = keyedInput.nextLine(); //getting user input
        System.out.println("2(3x + 4) - 4(x - 3) = x - 2\n" + "x = ");//output question
        Q6 = keyedInput.nextInt(); //getting user input
        System.out.println("3x + 4y = 12\n" + "4x + 5y = 32\n" + "x = \n" + "y = ");//output question
        Q7X = keyedInput.nextInt(); //getting user input
        Q7Y = keyedInput.nextInt(); //getting user input
        System.out.println("The formula to find the circumference of a circle is 2πr: (write true or false)");
        Q8 = keyedInput.nextBoolean();
        
        //Question 1
        if ((Q1.equals(Q1A1))||(Q1.equals(Q1A2))){
            NumberCorrect++; //If the answer is wrong (The Variable++ or Variable-- is an incriment operator which is used to add 1 or subtract 1 from a variable instead of having to write Variable = Variable + 1. While I haven't been taught this in class I will be using it due to the fact that it is easier for the work I'm currently doing and makes the code easier to understand)
        }else{
            NumberIncorrect++; //If the answer is wrong
        }
        
        //Question 2
        if (Q2.equals(Q2A1)||(Q2.equals(Q2A2))){
            NumberCorrect++; //If answer is correct
        }else{
            NumberIncorrect++; //If answer is wrong
        }
        
        //Question 3
        if (Q3.equals(Q3A1)||(Q3.equals(Q3A2))){
            NumberCorrect++; //If answer is correct
        }else{
            NumberIncorrect++; //If answer is wrong
        }
        
        //Question 4
        if (Q4.equals(Q4A1)||(Q4.equals(Q4A2))){
            NumberCorrect++; //If answer is correct
        }else{
            NumberIncorrect++; //If answer is wrong
        }
        
        //Question 5
        if (Q5.equals(Q5A1)||(Q5.equals(Q5A2))){
            NumberCorrect++; //If answer is correct
        }else{
            NumberIncorrect++; //If answer is wrong
        }
        
        //Question 6
        if (Q6 == Q6A){
            NumberCorrect++; //If answer is correct
        }else{
            NumberIncorrect++; //If answer is wrong
        }
        //Question 7
        if ((Q7X == Q7XA)&&(Q7Y == Q7YA)){
            NumberCorrect++; //If answer is correct
        }else{
            NumberIncorrect++; //If answer is wrong
        }
        
        //Question 8
        if (Q8 == Q8A){
            NumberCorrect++; //If answer is correct
        }else{
            NumberIncorrect++; //If asnwer is wrong
        }
        
        //Finding Percentage
        Percentage = (NumberCorrect/NUMBER_OF_QUESTIONS)*1000; //dividing correct questions by total questions and multiplying by 100 for the percentage and 10 so I can round it and then divide it by 10 for the decimal
        Percentage = Math.round(Percentage); //Rounding number
        Percentage = Percentage/10; //Dividing by 10 to have decimal in proper place
        
        //Final Output
        System.out.println("You got " + NumberCorrect + " questions right!"); //Correct questions output
        System.out.println("You got " + NumberIncorrect + " questions wrong."); //Incorrect questions output
        System.out.println("Your final grade for this quiz was " + Percentage + "%"); //grade
        
        //Statement Regarding Performance
        if (Percentage == 100){
            System.out.println("Perfect!"); //100% output
        }else if (Percentage >= 85){
            System.out.println("Almost there."); //almost got 100% output
        }else if (Percentage >= 70){
            System.out.println("You did okay."); //decent performance output
        }else if (Percentage >= 60){
            System.out.println("Atleast you passed."); //passing grade output
        }else{
            System.out.println("Better luck next time."); //failed output
        }
        
    }
    
}
