package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {

	@GetMapping("/HolaMundo")
	public String HolaMundo(@RequestParam(name="name", required=false, defaultValue="Mundo") String name, Model model) {
		model.addAttribute("name", name);
		return "Hola";
	}
}

