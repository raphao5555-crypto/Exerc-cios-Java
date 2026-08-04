import java.util.Scanner;

public class SóOsPares {

    public static boolean ehPar(int n){
        return n % 2 == 0;
        
    }

    public static void result(int[] resultado) {
        for (int emCada : resultado) {
            System.out.println(emCada);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int[] guardador = new int[3];
        while (i < 3) {

            System.out.println("Digite o número " + (i + 1));
            int n = input.nextInt();
            if (ehPar(n)) {
                guardador[i] = n;
                i++;
                
            }else {
                System.out.println("numero inválido");
            }
            
        }
       result(guardador);
       input.close();
        
    }
}
