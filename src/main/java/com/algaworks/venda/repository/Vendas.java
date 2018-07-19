package com.algaworks.venda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.venda.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
