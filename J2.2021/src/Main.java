import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);

        int rulesV = 0;
        int sGroupInt;
        
        sGroupInt = Integer.parseInt(keyedInput.nextLine());

        String [][] sGroup = new String[sGroupInt][2];

        for (int i = 0; i < sGroupInt; i++) {
            String cnstr = keyedInput.nextLine();
            String[] names = cnstr.split(" ");
            sGroup[i][0] = names[0];
            sGroup[i][1] = names[1];
        }

        int gSkipInt = Integer.parseInt(keyedInput.nextLine());
        String [][] gSkip = new String[gSkipInt][2];

        for (int i = 0; i < gSkipInt; i++) {
            String cnstr = keyedInput.nextLine();
            String[] names = cnstr.split(" ");
            gSkip[i][0] = names[0];
            gSkip[i][1] = names[1];
        }

        int gInt = Integer.parseInt(keyedInput.nextLine());

        String [][] g = new String[gInt][3];

        for (int i = 0; i < gInt; i++){
            String cnstr = keyedInput.nextLine();
            String[] names = cnstr.split(" ");
            g[i][0] = names[0];
            g[i][1] = names[1];
            g[i][2] = names[2];
        }

        boolean [] sameTrue = new boolean[sGroupInt];
        for (boolean track: sameTrue) {
            track = false;
        }

        boolean [] avoidBroken = new boolean[gSkipInt];
        for (boolean track: avoidBroken) {
            track = false;
        }

        for (int i = 0; i < gInt; i++) {

            for (int j = 0; j < sGroupInt; j++) {

                boolean p1 = false;
                boolean p2 = false;

                for (String member: g[i]) {

                    if (member.equals(sGroup[j][0])){
                        p1 = true;
                    } else if (member.equals(sGroup[j][1])) p2 = true;

                    if (p1 && p2) {
                        sameTrue[j] = true;
                    }
                }
            }

            for (int j = 0; j < gSkipInt; j++) { 

                boolean p1 = false;
                boolean p2 = false;

                for (String member: g[i]) {    // check member

                    if (member.equals(gSkip[j][0])){
                        p1 = true;
                    } else if (member.equals(gSkip[j][1])) p2 = true;

                    if (p1 && p2) {
                        avoidBroken[j] = true;
                    }
                }
            }
        }

        for (boolean notV: sameTrue) {
            if (!notV) {
                rulesV++;
            }
        }

        for (boolean V: avoidBroken) {
            if (V) {
                rulesV++;
            }
        }

        System.out.println(rulesV);
    }
}