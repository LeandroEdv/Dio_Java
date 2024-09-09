package exercicio_list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for (Item i : itemList){
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemRemover.add(i);
            }
        }
        itemList.removeAll(itemRemover);
    }
    public void removerItemPorQuantidade(String nome, int quantidade){
        Item itemParaApagar = null;
        for (Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                if(i.getQuantidade() > quantidade){
                    int quant = i.getQuantidade() - quantidade;
                    i.setQuantidade(quant);
                } else if (i.getQuantidade() == quantidade){
                    itemParaApagar = i;

                }
            }
        }
        if (itemParaApagar != null) {
            itemList.remove(itemParaApagar); // Remover fora do loop
        }
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item i : itemList){
          valorTotal +=  (i.getQuantidade() * i.getPrecoo());
        }
        return valorTotal;
    }
    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();
        compras.adicionarItem("computador",500,1);
        compras.adicionarItem("noteBook",1500,10);
        compras.removerItemPorQuantidade("noteBook", 10);
        //compras.removerItem("noteBook");
        compras.exibirItens();
        System.out.println("Valor total: " + compras.calcularValorTotal());
    }

}
