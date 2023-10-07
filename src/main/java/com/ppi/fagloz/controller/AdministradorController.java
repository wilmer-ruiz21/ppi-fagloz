package com.ppi.fagloz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ppi.fagloz.model.Producto;
import com.ppi.fagloz.service.ProductoService;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {
	
	@Autowired
	private ProductoService producService;
	
	@GetMapping("")
	public String home(Model model) {
		
		List<Producto> productos = producService.findAll();
		model.addAttribute("productos", productos);
		
		return "administrador/home";
	}

}
