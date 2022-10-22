package com.br.teste;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.teste.Main.Main;

@SpringBootApplication
public class TesteApplication {

	public static Main teste = new Main();
	public static void main(String[] args) throws IOException {
		SpringApplication.run(TesteApplication.class, args);
		teste.popularLista();
		teste.removePorNome("João");
		teste.imprimirFuncionarios();
		teste.aumentoSalario();
	}

}
