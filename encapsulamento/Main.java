public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setIdade(-50);

        System.out.println(pessoa1.getIdade());

        pessoa1.setIdade(25);
        System.out.println(pessoa1.getIdade());

        
    }
}