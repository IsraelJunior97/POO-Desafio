package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricão;
    private int cargaHoraria;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricão() {
        return descricão;
    }

    public void setDescricão(String descricão) {
        this.descricão = descricão;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricão='" + descricão + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
