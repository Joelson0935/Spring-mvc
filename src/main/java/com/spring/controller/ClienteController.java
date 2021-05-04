package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.domain.Cliente;
import com.spring.domain.repository.ClienteRepositorio;
import com.spring.domain.service.ClienteService;

@Controller
@RequestMapping("/Cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService servico;
	
	@Autowired
	private ClienteRepositorio repositorio;

	@GetMapping("/Cadastro")
	public String formulario() {
		
		return "/CadastroClientes";
	}
	
	@PostMapping("/Salvar")
	public String Salvar(Cliente cliente) {
		servico.Salvar(cliente);	
		return "redirect:/Cliente/Cadastro";
	}
	
	@GetMapping("/Listar")
	public ModelAndView Lista() {
		ModelAndView mv = new ModelAndView("ListaClientes");
	Iterable<Cliente> clientes = repositorio.findAll();
		mv.addObject("clientes", clientes);
		return mv;
	}
}
