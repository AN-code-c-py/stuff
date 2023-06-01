import java.util.Scanner; //import command to access scanner

public class CCC21J1 {

    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        int B;
        int P;
        B = keyedInput.nextInt();
        P = 5*B-400;
        if (P >= 100){
            System.out.println(P+"\n"+"-1");
        } else if (P == 100){
            System.out.println(P+"\n"+"0");
        } else {
            System.out.println(P+"\n"+"1");
        }
        
    }
    
}
