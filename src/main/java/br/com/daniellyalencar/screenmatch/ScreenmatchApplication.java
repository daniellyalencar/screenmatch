package br.com.daniellyalencar.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.daniellyalencar.screenmatch.model.service.ConsumoAPI;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ConsumoAPI api = new ConsumoAPI();
		var json = api.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=d63e153d");
		System.out.println(json);

	}

}