package com.pyry.springApp;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.util.Properties;

@SpringBootConfiguration
@ComponentScan()
@EnableAutoConfiguration
public class ServerMain {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(ServerMain.class);
		application.run(args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
	
		return args -> {
		};
	}
}
