package com.financeiro.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financeiro.contabilidade.model.Operador;

@Repository
public interface OperadorRep extends JpaRepository<Operador, Long> {

}
