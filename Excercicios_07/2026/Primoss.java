
public class Primoss {
    public static void main(String[] args) {
        int nMin = 1;
        int nMax = 100;

        for (int i = nMin; i <= nMax; i++) {
            boolean ehPrimo = (i >= 2);

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println(i + " É primo");
            }


        }

    }
    
}
