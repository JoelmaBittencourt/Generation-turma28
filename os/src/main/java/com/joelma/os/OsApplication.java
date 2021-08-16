package com.joelma.os;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joelma.os.domain.Cliente;
import com.joelma.os.domain.Os;
import com.joelma.os.domain.Tecnico;
import com.joelma.os.domain.enuns.Prioridade;
import com.joelma.os.domain.enuns.Status;
import com.joelma.os.repository.ClienteRepository;
import com.joelma.os.repository.OsRepository;
import com.joelma.os.repository.TecnicoRepository;

@SpringBootApplication//informa que é uma aolicaçao spring boot
public class OsApplication implements CommandLineRunner{
	
	@Autowired//quem vai gerenciar é o spring boot
	private TecnicoRepository tecnicoRepository;//instanciando
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private OsRepository osRepository;
	

	public static void main(String[] args) {//compilar com spring boot
		SpringApplication.run(OsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Tecnico t1 = new Tecnico(null, "joelma Bittencourt", "46039145803", "(11) 71234-5678");
		
		Cliente c1= new Cliente (null, "Diego","12306593825","(11) 98888-1234");
		
		Os os1= new Os(null, Prioridade.ALTA,"teste create OD", Status.ANDAMENTO, t1, c1);
		
		t1.getList().add(os1);//lista de ordens
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1));//lista de instancias
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}

}
