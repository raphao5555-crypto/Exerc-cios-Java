package encapsulamento2;

public class Produto {
    private double preco;

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Valor inválido");

        } else {
            this.preco = preco;
        }
    }

    public double getPreco(){
        return this.preco;
    }

}

