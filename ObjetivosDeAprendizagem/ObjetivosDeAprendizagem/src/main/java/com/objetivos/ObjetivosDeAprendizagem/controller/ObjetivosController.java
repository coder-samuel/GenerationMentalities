package com.objetivos.ObjetivosDeAprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public String objetivos() {
		return "Os objetivos de aprendizagem desta semana é aprender a criar controllers de resquisição para URL!";

	}
}