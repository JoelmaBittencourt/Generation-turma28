package com.BlogPessoal.seguranca;

import java.util.Optional;

import com.BlogPessoal.model.Usuario;
import com.BlogPessoal.repositorio.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService
{

	@Autowired
	private UsuarioRepositorio userRepositorio;
	
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<Usuario>user = userRepositorio.findByEmail(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "Not Found"));
		
		return user.map(UserDatailsImpl::new).get();
	}
}
