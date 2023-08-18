package com.fvss.localizacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fvss.localizacao.service.CidadeService;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner{

	@Autowired
	private CidadeService service;

	public static void main(String[] args) {
		SpringApplication.run(LocalizacaoApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		service.listarCidadePorNome();
	}

}
