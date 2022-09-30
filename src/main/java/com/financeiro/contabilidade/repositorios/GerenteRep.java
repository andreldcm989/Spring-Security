package com.financeiro.contabilidade.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeiro.contabilidade.model.Gerente;

public interface GerenteRep extends JpaRepository<Gerente, Long> {

}
