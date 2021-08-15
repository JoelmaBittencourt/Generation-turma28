package com.BlogPessoal.repositorio;

import java.util.List;

import com.BlogPessoal.model.Postagem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepositorio extends JpaRepository<Postagem, Long>
{
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}
