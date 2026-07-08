package Mercado2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> carrinho = new ArrayList<>();
        Mercado mercado1 = new Mercado();

        mercado1.setItem("cafe");

        carrinho.add(mercado1.getItem());



        if (!carrinho.isEmpty()) {
            System.out.println(carrinho);
        }


        input.close();

    }
}
