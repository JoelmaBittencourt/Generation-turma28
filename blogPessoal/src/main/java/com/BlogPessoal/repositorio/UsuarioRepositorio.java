package com.BlogPessoal.repositorio;

import java.util.List;
import java.util.Optional;

import com.BlogPessoal.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>
{

	/**
	 * Metodo utilizado para selecionar apenas um Usuario pelo email (Chave unica)
	 * 
	 * @param email
	 * @return Optional com Usuario unico
	 * @since 1.0
	 * @author Turma28
	 */
	Optional<Usuario> findByEmail(String email);

	/**
	 * Metodo utilizado para pesquisar coluna nome da tabela Usuario
	 * 
	 * @param nome
	 * @return Lista de Usuario
	 * @since 1.0
	 * @author Turma28
	 */
	List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}