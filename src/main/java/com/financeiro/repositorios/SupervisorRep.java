package com.financeiro.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeiro.contabilidade.model.Supervisor;

public interface SupervisorRep extends JpaRepository<Supervisor, Long> {

}
