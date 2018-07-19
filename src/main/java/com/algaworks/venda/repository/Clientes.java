package com.algaworks.venda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.venda.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
