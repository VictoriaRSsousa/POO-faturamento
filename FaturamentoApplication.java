package com.Faturamento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
	public class FaturamentoApplication {
	private static final Logger logger = LoggerFactory.getLogger(FaturamentoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FaturamentoApplication.class, args);
		logger.info("OK!");
	}

}



