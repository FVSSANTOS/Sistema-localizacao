package com.fvss.localizacao.domain.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fvss.localizacao.domain.entity.Cidade;
import com.fvss.localizacao.domain.repository.projections.CidadeProjection;

public interface CidadeRepository extends JpaRepository<Cidade,Long>, JpaSpecificationExecutor<Cidade>{
    
     List<Cidade> findByNome(String nome);

     List<Cidade> findByNomeStartingWith(String nome);

     List<Cidade> findByNomeEndingWith(String nome);

     List<Cidade> findByNomeContaining(String nome);

     List<Cidade> findByHabitantes(Long habitantes);

     @Query("select c from Cidade c where lower(c.nome) like lower(?1)")
     List<Cidade> findByLikeNome(String nome, Sort sort);

     @Query("select c from Cidade c where lower(c.nome) like lower(?1)")
     List<Cidade> findByLikeNome(String nome, Pageable pageble);
    
     List<Cidade> findByHabitantesLessThan(Long habitantes);

     List<Cidade> findByHabitantesGreaterThan(Long habitantes);

     @Query(nativeQuery = true, value = "select * c.id_cidade as id, c.nome as nome_cidade from tb_cidade as c where c.nome =nome")
     List<CidadeProjection> findByNomeSqlNativo(@Param("nome")String nome);

}
