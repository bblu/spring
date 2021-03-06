package com.bblu.patrol;

import com.bblu.patrol.service.storage.StorageProperties;
import com.bblu.patrol.service.storage.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class PatrolApplication {

	private final static Logger logger = LoggerFactory
			.getLogger(PatrolApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PatrolApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}
}
