package com.financeiro.contabilidade.repositorios;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeiro.contabilidade.enums.RoleName;
import com.financeiro.contabilidade.model.RoleModel;

public interface RoleRep extends JpaRepository<RoleModel, UUID> {

    public RoleModel findByRoleName(RoleName role);

}
