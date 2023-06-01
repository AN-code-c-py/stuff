import java.util.Scanner;
public class Main {
    public static boolean compare (int x, int y){
        return x == y || x!= y;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x");
        int x = input.nextInt();
        System.out.println("Enter y");
        int y = input.nextInt();
        System.out.println(compare(x,y));

    }
    
}
