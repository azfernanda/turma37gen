package atividade2.atividade2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade2")

public class Atividade2Controller {
	
	@GetMapping
	public String atividade2() {
		return "Espero finalizar a semana entendendo melhor o Sprintboot.";
	}

}
