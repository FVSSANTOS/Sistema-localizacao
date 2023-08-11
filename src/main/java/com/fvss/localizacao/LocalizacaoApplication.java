package com.fvss.localizacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fvss.localizacao.domain.entity.Cidade;
import com.fvss.localizacao.domain.repository.CidadeRepository;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner{

	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(LocalizacaoApplication.class, args);
	}

	@Transactional
	void salvarCidada(){
		var cidade = new Cidade(1L,"São Paulo", 12396372L);
		cidadeRepository.save(cidade);
	}

	void listarCidade(){
		cidadeRepository.findAll().forEach(System.out::println);
	}

	@Override
	public void run(String... args) throws Exception {
		salvarCidada();
		listarCidade();
		
	}

}