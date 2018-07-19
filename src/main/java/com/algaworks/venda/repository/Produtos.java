package com.algaworks.venda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.venda.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
