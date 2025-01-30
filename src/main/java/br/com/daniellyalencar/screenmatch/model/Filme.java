package br.com.daniellyalencar.screenmatch.model;

import br.com.daniellyalencar.screenmatch.repository.Classificacao;

public class Filme extends Titulo implements Classificacao {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)mediaDasAvaliacoes() / 2;
    }

}
