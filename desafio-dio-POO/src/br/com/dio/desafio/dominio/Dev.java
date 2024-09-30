package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add((conteudo.get()));
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não tem conteudos Matriculados");
        }
    }
    public double calcularTotalXp(){
        return this.conteudosConcluidos.stream()
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getCoteudosInscritos() {
        return coteudosInscritos;
    }

    public void setCoteudosInscritos(Set<Conteudo> coteudosInscritos) {
        this.coteudosInscritos = coteudosInscritos;
    }

    public Set<Conteudo> getCoteudosConcluidos() {
        return coteudosConcluidos;
    }

    public void setCoteudosConcluidos(Set<Conteudo> coteudosConcluidos) {
        this.coteudosConcluidos = coteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(coteudosInscritos, dev.coteudosInscritos) && Objects.equals(coteudosConcluidos, dev.coteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, coteudosInscritos, coteudosConcluidos);
    }
}
