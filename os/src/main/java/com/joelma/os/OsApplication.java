package com.joelma.os;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//informa que é uma aolicaçao spring boot
public class OsApplication {

	public static void main(String[] args) {//compilar com spring boot
		SpringApplication.run(OsApplication.class, args);
	}

}
