package com.financeiro.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeiro.contabilidade.model.Operador;

public interface OperadorRep extends JpaRepository<Operador, Long> {

}
