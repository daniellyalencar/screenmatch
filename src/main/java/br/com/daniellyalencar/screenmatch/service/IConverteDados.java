package br.com.daniellyalencar.screenmatch.service;

public interface IConverteDados {

    <T> T obterDados(String jason, Class<T> classe);

}
