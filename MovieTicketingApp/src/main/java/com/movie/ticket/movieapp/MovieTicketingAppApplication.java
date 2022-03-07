package com.movie.ticket.movieapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class MovieTicketingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketingAppApplication.class, args);
	}

}
