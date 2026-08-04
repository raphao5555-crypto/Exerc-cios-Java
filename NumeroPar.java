import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int[] numeros = new int[3];

        while (i < 3) {
            int n = input.nextInt();
            if (n % 2 == 0) {
                System.out.println("====\n" + (i + 1) + "Numero aceito\n====");

                numeros[i] = n;
                i++;

            } else {
                System.out.println("Numero não é par");

            }
            
        }

        System.out.println("Numeros que você digitou: ");

        for (int contagem : numeros) {
            System.out.println(contagem);
        }


        input.close();
    }

    
}
