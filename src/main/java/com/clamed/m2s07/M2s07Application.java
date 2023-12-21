package com.clamed.m2s07;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class M2s07Application {
	private Aplicacao app;

	public static void main(String[] args) {
		SpringApplication.run(M2s07Application.class, args);
	}

	@Bean
	CommandLineRunner run(Aplicacao app) {
		return args -> {
			app.executar();
		};
	}
}
