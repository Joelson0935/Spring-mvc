package com.spring.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.Cliente;
import com.spring.domain.repository.ClienteRepositorio;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepositorio repositorio;

	public Cliente Salvar(Cliente cliente) {
		
		return repositorio.save(cliente);
	}
}
