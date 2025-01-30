package br.com.daniellyalencar.screenmatch.model;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;

    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " +nome);
        System.out.println("Ano de Lançamento: " +anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
        totalDeAvaliacoes++;
    }

    public double mediaDasAvaliacoes() {

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {

        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

}
