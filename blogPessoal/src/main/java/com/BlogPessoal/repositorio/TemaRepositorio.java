package com.BlogPessoal.repositorio;

import java.util.List;

import com.BlogPessoal.model.Tema;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TemaRepositorio  extends JpaRepository<Tema, Long>
{
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}

