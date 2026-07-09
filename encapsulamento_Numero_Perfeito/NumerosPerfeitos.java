package encapsulamento_Numero_Perfeito;
import java.util.Scanner;

public class NumerosPerfeitos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        


        System.out.println("Digite valor minimo");
        int n_min = input.nextInt();

        System.out.println("Digite valor maximo");
        int n_max = input.nextInt();


        for (int i = n_min; i <= n_max; i++) {
            int resultado = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    resultado += j;
        
                }
            }

            if (resultado == i) {
                System.out.println(i  + " Eh primo!");
            }

            
        }
            


        input.close();

    }
}