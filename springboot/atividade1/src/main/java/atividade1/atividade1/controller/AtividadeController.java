package atividade1.atividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade1")

public class AtividadeController {

	@GetMapping
	public String atividade() {
		return "Habilidades: atenção aos detalhes, proatividade. "
				+ "Mentalidades: persistência, responsabilidade pessoal.";
	}
}
