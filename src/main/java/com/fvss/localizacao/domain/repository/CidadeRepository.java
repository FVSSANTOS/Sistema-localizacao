package com.fvss.localizacao.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fvss.localizacao.domain.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade,Long>{
    
     List<Cidade> findByNome(String nome);

     List<Cidade> findByNomeStartingWith(String nome);

     List<Cidade> findByNomeEndingWith(String nome);

     List<Cidade> findByNomeContaining(String nome);

     List<Cidade> findByHabitantes(Long habitantes);
    
}
