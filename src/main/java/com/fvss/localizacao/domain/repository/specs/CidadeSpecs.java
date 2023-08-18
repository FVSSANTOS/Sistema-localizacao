package com.fvss.localizacao.domain.repository.specs;

import org.springframework.data.jpa.domain.Specification;

import com.fvss.localizacao.domain.entity.Cidade;

public abstract class CidadeSpecs {
    
    public static Specification<Cidade> nomeEqual(String nome){
        return (root, query, cb) -> cb.equal(root.get("nome"), nome);
    }

    public static Specification<Cidade> habitantesGreaterThan(Integer value){
        return (root, query, cb) -> cb.greaterThan(root.get("habitantes"), value);
    }

    public static Specification<Cidade> habitantesBetwenn(Long min, Long max){
        return (root, query, cb) -> cb.between(root.get("habitantes"),min,max);
    }
}
