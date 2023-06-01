import java.util.Scanner;
import java.lang.Math;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner keyedInput = new Scanner(System.in);
    double P = keyedInput.nextDouble();
    double N = keyedInput.nextDouble();
    double R = keyedInput.nextDouble();

    double totalDisease = 0;
    double day = 0;
    
    if (P == N){
      System.out.println(1);
    } else {
        while (totalDisease <= P){
            totalDisease = totalDisease + N*(Math.pow(R, day));
            day++;
        }
        System.out.println((int)day-1);
    } 
   
}
}
