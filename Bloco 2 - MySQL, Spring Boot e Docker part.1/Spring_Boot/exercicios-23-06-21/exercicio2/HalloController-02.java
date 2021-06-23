package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atv1")
public class HalloController {
	
	@GetMapping
	public String atv1() {
		return "Objetivos de aprendizagem para essa semana:"
				+ "SpringBoot, Maven, Postman, API's, REST, Frameworks";
	}
	
}


