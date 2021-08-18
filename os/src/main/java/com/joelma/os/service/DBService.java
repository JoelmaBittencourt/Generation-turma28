package com.joelma.os.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joelma.os.domain.Cliente;
import com.joelma.os.domain.Os;
import com.joelma.os.domain.Tecnico;
import com.joelma.os.domain.enuns.Prioridade;
import com.joelma.os.domain.enuns.Status;
import com.joelma.os.repository.ClienteRepository;
import com.joelma.os.repository.OsRepository;
import com.joelma.os.repository.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository colaboradoraRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private OsRepository ordemServicoRepository;
	
	
	public void instanciaBD() {
		
Tecnico co = new Tecnico(null, "joelma Bittencourt", "12306593825", "(11) 71234-5678");
		
		Cliente cl= new Cliente(null, "joelma", "46039145803","(11)920025585");
						
		Os os= new Os(null, Prioridade.ALTA,"teste create OD", Status.ANDAMENTO, co, cl);
		
		colaboradoraRepository.saveAll(Arrays.asList(co));
		clienteRepository.saveAll(Arrays.asList(cl));
		ordemServicoRepository.saveAll(Arrays.asList(os));
}
}