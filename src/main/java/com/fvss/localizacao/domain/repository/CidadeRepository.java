package com.fvss.localizacao.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fvss.localizacao.domain.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade,Long>{
    
}
