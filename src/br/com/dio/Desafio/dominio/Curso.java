package br.com.dio.Desafio.dominio;

public class Curso extends Conteudo {

    private int cargahoraria;
    @Override
    public double calcularXP() {
        return XP_PADRAO + cargahoraria;
    }
    public Curso() {
    }


    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }


}
