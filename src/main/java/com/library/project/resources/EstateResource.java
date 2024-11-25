package com.library.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.project.entities.Estate;

@RestController
@RequestMapping(value = "/estate")
public class EstateResource {

	@GetMapping
	public ResponseEntity<Estate> findAll() {
		Estate estate = new Estate(1L, "Java Guia do Programador", "Novatec", 2, "Peter Jandl Junior", "Programação", "Livro", 5);
		return ResponseEntity.ok().body(estate);
	}
}
