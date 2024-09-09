package exercicio_list;

public class Item {
    private String nome;
    private double precoo;
    private int quantidade;

    public Item(String nome, double precoo, int quantidade) {
        this.nome = nome;
        this.precoo = precoo;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoo() {
        return precoo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", precoo=" + precoo +
                ", quantidade=" + quantidade +
                '}';
    }
}
