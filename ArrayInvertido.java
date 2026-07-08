import java.util.Scanner;

public class Main {
    public static void programa(int[] numeros) {

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numeros = {10,20,30,40,50};
        System.out.println("imprimir numeros iniciais");
        
        programa(numeros);
        
        
        int inicio = 0;
        int fim = numeros.length - 1;
        
        while (inicio < fim) {
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = temp;
            inicio++;
            fim--;
        }
        
        
        System.out.println("imprimir numeros invertidos");
        programa(numeros);
        input.close();
    
    }
}
