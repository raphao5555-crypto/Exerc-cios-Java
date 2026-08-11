import java.util.Scanner;

public class Ehpar {

    public static boolean ehPar(int numero) {
        boolean resultado = false;
        
        if (numero % 2 == 0) {
            resultado = true;
        }
        return resultado;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 1; 

        while (contador <= 3) {
            System.out.println("Digite número " + contador);
            int numero = input.nextInt();

            if (ehPar(numero)) {
                contador++;
            }

        }

    }
    
}
