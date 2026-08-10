public class Primos {

    public static boolean ehPrimo(int numero) {
        boolean resultado = true;
        if (numero <= 1) {
            return false;

        } else {

            for(int i = 2; i < numero; i++) {
                if(numero % i == 0) {
                    return false;
                }
            }
            
        }
        return resultado;
        
    }
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 100) {
            boolean primo = ehPrimo(contador);
            if (primo) {
                System.out.println(contador + " é primo");
            }
            contador++;

        }
        
    }
    
}
