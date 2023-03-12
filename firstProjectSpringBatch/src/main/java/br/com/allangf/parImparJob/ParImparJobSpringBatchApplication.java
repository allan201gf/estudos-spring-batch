package br.com.allangf.parImparJob;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class ParImparJobSpringBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParImparJobSpringBatchApplication.class, args);
	}

}
