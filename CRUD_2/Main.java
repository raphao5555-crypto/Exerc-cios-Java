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
        boolean ativado = true;

        while (ativado) {
            System.out.println("1.lista de contatos\n2.Adicionar contato\n3.Alterar contato\n4.remover contato");

            int painel = 0;
            painel = input.nextInt();
            input.nextLine();

            if (painel == 1 ) {
                System.out.println("===============");
                for (int i = 0; i < listaDeContatos.size(); i++) {
                    Contato contato = listaDeContatos.get(i);
                    System.out.println(i + ". " +  contato.getNome() + "\n" + contato.getNumero());
                    
                }
                System.out.println("===============");
                painel = 0;
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
                System.out.println("===============");

                painel = 0;
                
            }

            if (painel == 3) {
                System.out.println("Digite o nome do contato que deseja alterar");
                String nomeContato = input.nextLine();
                System.out.println("Digite novo nome");
                String novoContato = input.nextLine();
                System.out.println("===============");

                for (Contato contato : listaDeContatos) {

                    if (contato.getNome().equals(nomeContato)) {
                        contato.setNome(novoContato);
                        
                    }


                }
                System.out.println("===============");
                painel = 0;
                
            }

            if (painel == 4) {
                System.out.println("Digite o nome que deseja remover");
                String nomeRemover = input.nextLine();

                for (Contato contato : listaDeContatos) {
                    if (contato.getNome().equals(nomeRemover)) {
                        listaDeContatos.remove(nomeRemover);
                    }
                }
            }

        }

        input.close();

    }
}
