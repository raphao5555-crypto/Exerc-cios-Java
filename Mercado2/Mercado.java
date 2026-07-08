package Mercado2;

public class Mercado {
    private String item; 

    public void setItem(String item) {
        if (item.equals("")) {
            System.out.println("DIGITE UM ITEM VALIDO");
        }else {
            this.item = item;
        }

    }

    public String getItem(){
        return this.item;
    }
    
}
