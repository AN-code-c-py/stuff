import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int C = keyedInput.nextInt();
        String row1 = keyedInput.nextLine();
        String row2 = keyedInput.nextLine();
        
        String row1Str[] = new String[C-1];
        String row2Str[] = new String[]C-1;
        
        row1Str[] = row1.split(" ");
        row2Str[] = row2.split(" ");
        
        
        int l = 0;
        
        for (int i = 0; i < C+1; i++){
            if((row1Str[i].equals("1")) && (row1Str[i+1].equals("1")) && ((row2Str[i].equals("1")) ||(row2Str[i+1].equals("1")))){
                l = l + 5;
            }
            else if ((row1Str[i].equals("1")) && (row1Str[i-1].equals("1")) && ((row2Str[i].equals("1")) ||(row2Str[i-1].equals("1")))){
                l = l + 5;
            }
            else if ((row2Str[i].equals("1")) && (row2Str[i+1].equals("1")) && ((row1Str[i].equals("1")) ||(row1Str[i+1].equals("1")))){
                l = l + 5;
            }
            else if ((row2Str[i].equals("1")) && (row2Str[i-1].equals("1")) && ((row1Str[i].equals("1")) ||(row1Str[i-1].equals("1")))){
                l = l + 5;
            }
            else if ((row1Str[i].equals("1")) && ((row1Str[i+1].equals("1"))||(row1Str[i-1].equals("1"))) && (row2Str[i].equals("0")) && (row2Str[i+1].equals("0")) && (row2Str[i-1].equals("0"))){
                l = l + 4;
            }
            else if ((row2Str[i].equals("1")) && ((row2Str[i+1].equals("1"))||(row2Str[i-1].equals("1"))) && (row1Str[i].equals("0")) && (row1Str[i+1].equals("0")) && (row1Str[i-1].equals("0"))){
                l = l + 4;
            }
            else if ((row1Str[i].equals("1")) && (row2Str[i].equals("1")) && (row1Str[i+1].equals("0")) && (row1Str[i-1].equals("0")) && (row2Str[i+1].equals("0")) && (row2Str[i-1].equals("0"))){   
                l = l + 4;
            }  
            else if ((row2Str[i].equals("1")) && (row1Str[i].equals("1")) && (row2Str[i+1].equals("0")) && (row2Str[i-1].equals("0")) && (row1Str[i+1].equals("0")) && (row1Str[i-1].equals("0"))){   
                l = l + 4;
            }
            else if ((row1Str[i].equals("1")) && (row1Str[i+1].equals("0")) && (row1Str[i-1].equals("0")) && (row2Str[i+1].equals("0")) && (row2Str[i-1].equals("0"))){
                l = l + 3;
            }
            else if ((row2Str[i].equals("1")) && (row2Str[i+1].equals("0")) && (row2Str[i-1].equals("0")) && (row1Str[i+1].equals("0")) && (row1Str[i-1].equals("0"))){
                l = l + 3;
            }
        }
        System.out.println(l+1);
    
        }
    }
    

