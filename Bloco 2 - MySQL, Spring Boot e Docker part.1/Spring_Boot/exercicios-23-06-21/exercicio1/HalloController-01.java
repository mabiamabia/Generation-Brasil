package com.halloworld.hallo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atv1")
public class HalloController {
	
	@GetMapping
	public String atv1() {
		return "Habilidades e mentalidades utilizadas para realizar essa atividade: "
			+	"Mentalidade de crescimento, Persistência, Orientação aos detalhes";
	}
	
}


