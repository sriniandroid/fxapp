package com.fxsignal.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FxSignalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FxSignalAppApplication.class, args);
	}

}
