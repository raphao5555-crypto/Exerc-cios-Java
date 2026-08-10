public class Triangulo {

    public static String calculo(double base, double altura){
        double resultado = base * altura / 2;
        String formatado = String.format("%.2f", resultado);
        return formatado;
    }
    public static void main(String[] args) {

        System.out.println("área " + calculo(2,3));
    }
}