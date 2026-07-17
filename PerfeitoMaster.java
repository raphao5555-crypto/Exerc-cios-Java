import java.util.Scanner;

public class PerfeitoMaster {

    public static void ehPerfeito(int numero) {
        int resultado = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                resultado += i;
            }

        }
        if (resultado == numero) {
            System.out.println("e perfeito!"); 
            
        }else {
            System.out.println("nao e perfeito!");
            
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ativado = true;

        while (ativado) {

            System.out.println("Digite um numero perfeito");

            int numero = input.nextInt();

            ehPerfeito(numero);

            
        }
        
        input.close();
    }

} 

