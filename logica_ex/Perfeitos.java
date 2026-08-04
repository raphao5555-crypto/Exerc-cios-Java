import java.util.Scanner;

public class Perfeitos {

    public static boolean ehPerfeito(int n) {
        int resultado = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                resultado += i;
            }
        }
        if (resultado == n) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean ativado = true;

        while(ativado) {

            System.out.println("Digite um numero");

            int numero = input.nextInt();
            input.nextLine();

            boolean resultado = ehPerfeito(numero);

            System.out.println(resultado);

        }
        input.close();
        

        
    }
}