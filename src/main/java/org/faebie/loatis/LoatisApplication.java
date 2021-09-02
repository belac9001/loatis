package org.faebie.loatis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LoatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoatisApplication.class, args);
	}
	
	@Bean
	CommandLineRunner loadDefaultData(BaseDataService baseDataService) {
		return (args) -> baseDataService.createDefaultData();
	}
}
