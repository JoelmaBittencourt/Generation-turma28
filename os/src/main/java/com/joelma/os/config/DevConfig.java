package com.joelma.os.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;




@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
		private com.joelma.os.service.DBService dbservice;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String ddl;
	
	@Bean
	public boolean instanciaDB() {
		
	
	
		
		if (ddl.equals("create")) {
			this.dbservice.instanciaBD();
		}
		return false;
	}
	
}
