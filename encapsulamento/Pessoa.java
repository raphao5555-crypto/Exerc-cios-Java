public class Pessoa {
    private int idade;

    public void setIdade(int valor) {
        if (valor < 0) {
            System.out.println("idade invalida");
        } else {
            idade = valor;
        }
        
        
    }

    public int getIdade() {
        return idade;
    }
}