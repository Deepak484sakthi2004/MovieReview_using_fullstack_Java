package com.example.movies;


import org.springframework.boot.SpringApplication; // It has a run method, that helps to run the java application!!

import org.springframework.boot.autoconfigure.SpringBootApplication; // it provides the annotations (@override,...etc) -> that helps the compiler
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//${env.MONGO_DATABASE}
//spring.data.mongodb.uri=mongodb+srv://${env.MONGO_USER}:${env.MONGO_PASSWORD}@${env.MONGO_CLUSTER}
//spring.data.mongodb.database= movieAPI-db
//spring.data.mongodb.uri = mongodb+srv://deepak1997sakthi:6mog4b82IoWj2ZO6@movieapidb.ibiidp5.mongodb.net

@SpringBootApplication // => this the annotation!

@RestController // rest api controlling class
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/") // routing the applications home page (same as in flask)
	public static String getHome()
	{
		return "Hello, Welcome to the Home Page";
	}

}
