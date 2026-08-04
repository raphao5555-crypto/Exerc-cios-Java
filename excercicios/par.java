package excercicios;

import java.util.Scanner;

public class par {

    public static boolean ehPar(int n) {
        if (n % 2 == 0 && n != 0) {
            return true;
        } else {
            return false;0
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 0;

        while(i < 3) {
            int n = input.nextInt();
            boolean legal = ehPar(n);
            if (legal) {
                i++;
            } else {
                System.out.println(n + "Não é par");
            }


        }
        input.close();
    }
    
}
