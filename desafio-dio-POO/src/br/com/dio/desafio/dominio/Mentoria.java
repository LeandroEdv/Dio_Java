package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private  String Descricao;
    LocalDate data;

    public Mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
