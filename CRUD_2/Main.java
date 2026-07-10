package CRUD_2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Contato> listaDeContatos = new ArrayList<>();
        Contato contatinhos = new Contato();

        contatinhos.setNome("Rafael");
        contatinhos.setNumero("9002 8922");
        listaDeContatos.add(contatinhos);


        System.out.println("1.lista de contatos\n2.Adicionar contato");

        int painel = 0;
        painel = input.nextInt();
        input.nextLine();

        if (painel == 1 ) {

            for (Contato contato : listaDeContatos) {
                System.out.println(contato.getNome());
                System.out.println(contato.getNumero());
            }
        }

        if (painel == 2) {
            Contato c1 = new Contato();
            c1.setNome(input.nextLine());
            c1.setNumero(input.nextLine());
            listaDeContatos.add(c1);

            System.out.println("-----------Lista atualizada------------");

             for (Contato contato : listaDeContatos) {
                System.out.println(contato.getNome());
                System.out.println(contato.getNumero());
            }
            
        }

        input.close();

    }
}
