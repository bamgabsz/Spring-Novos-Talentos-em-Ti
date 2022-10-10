package br.univille.novostalentos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.univille.novostalentos.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{
    
    List<Produto> findByNomeIgnoreCaseContaining(@Param("nome") String nome);
}
