public class PerfeitosNumeros {

    public static boolean ehPerfeito(int n){
        int numero = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                numero += i;
            }
        }

     if (numero == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(ehPerfeito(6));

        
    }
}
