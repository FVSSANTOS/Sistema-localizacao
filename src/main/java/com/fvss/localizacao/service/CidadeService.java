package com.fvss.localizacao.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fvss.localizacao.domain.entity.Cidade;
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
		Pageable pageable = PageRequest.of(0,10);
		repository.findByNomeStartingWith("Porto").forEach(System.out::println);
        repository.findByLikeNome("Porto%", pageable);
	}

	public void listarCidade(){
		repository.findAll().forEach(System.out::println);
	}

	public List<Cidade> filtroDinaminco(Cidade cidade){
		
	}
}
