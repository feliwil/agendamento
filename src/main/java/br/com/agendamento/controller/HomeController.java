package br.com.agendamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin ("*")
public class HomeController {
	@Autowired
	@GetMapping ("/")
	public String index () {
		return "Api de Teste Agendamento";
	}
}
