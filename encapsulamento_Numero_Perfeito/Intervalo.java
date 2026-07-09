package encapsulamento_Numero_Perfeito;

public class Intervalo {
    private int valorMinimo;
    private int valorMaximo;

    public void setValorMinimo(int valor) {
        if (valor < 1) {
            System.out.println("VALOR MINIMO INVALIDO");

        } else {
            this.valorMinimo = valor;
        }
    }

    public int getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMaximo(int valor) {
        if (valorMinimo >= valor) {
            System.out.println("VALOR MAXIMO INVALIDO");
        } else {
            valorMaximo = valor;
        }
    }

    public int getValorMaximo() {
        return valorMaximo;
    }
    
}
