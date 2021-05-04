package com.spring.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.domain.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

}
