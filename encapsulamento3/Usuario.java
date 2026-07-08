package encapsulamento3;

public class Usuario {
   private String nome;

    public void setNome(String nome) {
        if (nome.equals("")) {
            System.out.println("DIGITE UM NOME VALIDO");
        }else {
            this.nome = nome;
        }

    }

    public String getNome() {
        return nome;
    }
    
}
