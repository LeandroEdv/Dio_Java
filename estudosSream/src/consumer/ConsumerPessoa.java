package consumer;

import java.util.ArrayList;
import java.util.List;

public class ConsumerPessoa {
    private List<Pessoa> pessoaList;

    public ConsumerPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    public void  adicionarPessoa(String nome, int idade){
        pessoaList.add(new Pessoa(nome,idade));
    }
    public void listarPessoas(){
        System.out.println(pessoaList);
    }
    public void pessoasPorIdade(){
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoaList);
        pessoasIdade.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getIdade(),p2.getIdade()))
                .forEach(pessoa -> System.out.println(pessoa.getNome() + " tem: " + pessoa.getIdade()));

    }
    public static void main(String[] args) {
        ConsumerPessoa consumerPessoa = new ConsumerPessoa();
        consumerPessoa.adicionarPessoa(" joão",25);
        consumerPessoa.adicionarPessoa(" pedro",35);
        consumerPessoa.adicionarPessoa(" maria",15);
        consumerPessoa.adicionarPessoa(" Deise",31);
        consumerPessoa.pessoasPorIdade();
        consumerPessoa.listarPessoas();

    }

}
