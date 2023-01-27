package br.com.dio.Desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    String titulo;
    String descrcao;
    LocalDate data;

    public Mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrcao() {
        return descrcao;
    }

    public void setDescrcao(String descrcao) {
        this.descrcao = descrcao;
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
                ", descrcao='" + descrcao + '\'' +
                ", data=" + data +
                '}';
    }
}
