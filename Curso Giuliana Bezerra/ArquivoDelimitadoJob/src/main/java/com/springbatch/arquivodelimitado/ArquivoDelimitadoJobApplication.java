package com.springbatch.arquivodelimitado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ArquivoDelimitadoJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquivoDelimitadoJobApplication.class, args);
	}

}
