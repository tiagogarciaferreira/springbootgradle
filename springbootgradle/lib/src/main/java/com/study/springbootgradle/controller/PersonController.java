package com.study.springbootgradle.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Random;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.springbootgradle.model.Person;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	private Person person;
	
	@GetMapping
	public ResponseEntity<Person> viewPerson(){
		person = new Person(UUID.randomUUID().toString(), "Bores o cão", 
				 new Random().nextInt(100) * 1, LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
		return new ResponseEntity<Person>(person, HttpStatus.OK);		
	}

}
