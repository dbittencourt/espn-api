package com.example.espn_api;

import com.example.espn_api.repositories.GameRepository;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EspnApiApplication extends ResourceConfig {

	public EspnApiApplication(){
		register(GameController.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(EspnApiApplication.class, args);
	}

}

