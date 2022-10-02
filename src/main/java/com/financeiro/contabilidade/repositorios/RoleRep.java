package com.financeiro.contabilidade.repositorios;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeiro.contabilidade.model.RoleModel;

public interface RoleRep extends JpaRepository<RoleModel, UUID> {

}
