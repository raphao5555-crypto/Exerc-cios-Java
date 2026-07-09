package encapsulamento_Numero_Perfeito;
import java.util.Scanner;

public class NumerosPerfeitos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Intervalo intervalo1 = new Intervalo();

        
        while (intervalo1.getValorMinimo() < 1) {
            System.out.println("Digite valor minimo");
            intervalo1.setValorMinimo(input.nextInt());
        }

        System.out.println("Digite valor maximo");
        intervalo1.setValorMaximo(input.nextInt());
        


        for (int i = intervalo1.getValorMinimo(); i <= intervalo1.getValorMaximo();  i++) {
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