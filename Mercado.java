import java.util.Scanner;
import java.util.ArrayList;

public class Mercado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> carrinho = new ArrayList<>();
        int painel = 0;
        boolean continuidade = true;
        String item;
        
        
        while (continuidade) {
            if (painel == 0) {
            System.out.println("1. Carrinho\n2.Adicionar\n3.Remover\n4.Fazer Alteraçao");
            painel = input.nextInt();
            input.nextLine();
            
            
            }
            
            if (painel == 1) {
                
                System.out.println("Itens dentro do carrinho: " + carrinho);
                painel = 0;
                
            }
            
            if (painel == 2) {
                
                System.out.println("Digite o item que deseja adicionar");
                item = input.nextLine();
                carrinho.add(item);
                painel = 0;
                
            }
            
            if (painel == 3) {
                
                System.out.println("Digite o item que deseja remover");
                item = input.nextLine();
                carrinho.remove(item);
                painel = 0;
                    
                
            }
            
            if (painel == 4) {
                System.out.println("Digite o nome do item que deseja alterar");
                String alterar = input.nextLine();
                
                int posicao = carrinho.indexOf(alterar);
                
                if (posicao != -1) {
                
                    System.out.println("Digite um novo novo para " + alterar + ": ");
                    String alterado = input.nextLine();
                    
                    carrinho.set(posicao, alterado);
                    System.out.println("Item atualizado com sucesso");
                    
                    
                } else {
                    System.out.println("Escreva um item válido!");
                }
                
                painel = 0;
            }
        
        }
            
            
            
            
        
        input.close();
        
        
        
    }
}
