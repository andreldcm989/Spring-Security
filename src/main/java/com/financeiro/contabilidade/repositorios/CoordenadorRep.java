package com.financeiro.contabilidade.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeiro.contabilidade.model.Coordenador;

public interface CoordenadorRep extends JpaRepository<Coordenador, Long> {

}
