import java.util.Scanner;

public class Perfectos {

    public static boolean ehPerfeito(int n){
        int resultado = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                resultado += i;
            }

        }

        boolean resultadoReal = false;
        if (resultado == n) {
            resultadoReal = true;
            return resultadoReal;
        } else {
            return resultadoReal;
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número perfeito");
        int n = input.nextInt();
        System.out.println(ehPerfeito(n));

        input.close();

    }
}