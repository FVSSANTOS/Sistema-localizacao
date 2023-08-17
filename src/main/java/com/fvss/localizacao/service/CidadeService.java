package com.fvss.localizacao.service;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fvss.localizacao.domain.repository.CidadeRepository;

@Service
public class CidadeService {
    
    private CidadeRepository repository;

    public CidadeService(CidadeRepository repository){
        this.repository = repository;
    }

    public void listarCidadePorQuantidadeDeHabitantes(){
		repository.findByHabitantesLessThan(10000L).forEach(System.out::println);
	}

	

	public void listarCidadePorNome(){
		repository.findByNomeStartingWith("Porto").forEach(System.out::println);
        repository.findByLikeNome("Porto%", Sort.by("habitantes"));
	}

	public void listarCidade(){
		repository.findAll().forEach(System.out::println);
	}
}
