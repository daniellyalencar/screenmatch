package br.com.daniellyalencar.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.daniellyalencar.screenmatch.model.DadosSerie;
import br.com.daniellyalencar.screenmatch.service.ConsumoAPI;
import br.com.daniellyalencar.screenmatch.service.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String apiKey = System.getenv("OMDB_API_KEY");
		if (apiKey == null) {
			throw new RuntimeException("API Key nao encontrada");
		}

		ConsumoAPI api = new ConsumoAPI();
		var json = api.obterDados("https://www.omdbapi.com/?t=grey's+anatomy&apikey="+apiKey);
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}

}