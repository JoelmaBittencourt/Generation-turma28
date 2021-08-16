package com.joelma.os.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.helpdelas.HelpdelasApplication;
import com.helpdelas.domain.Cliente;
import com.helpdelas.domain.Colaboradora;
import com.helpdelas.domain.OrdemServico;
import com.helpdelas.domain.enuns.Prioridade;
import com.helpdelas.domain.enuns.Status;
import com.helpdelas.repositories.ClienteRepository;
import com.helpdelas.repositories.ColaboradoraRepository;
import com.helpdelas.repositories.OrdemServicoRepository;

@Configuration
@Profile("test")//identifica que é um perfil de test
public class TestConfig {

	

		
	
		
	
	