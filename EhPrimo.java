import java.util.Scanner;

public class EhPrimo {
    public static void ehPrimo(int numeroMax, int numeroMin) {
        for (int i = numeroMin; i <= numeroMax; i++) {
            if (i == 1) {
                i = 2;
            }
            boolean primo = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }

            }

              if (primo) {
                System.out.println(i + " eh Primo"); 
              }

        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroMax = input.nextInt();
        int numeroMin = input.nextInt();
        ehPrimo(numeroMin, numeroMax);
        

        input.close();
    }
    
}
