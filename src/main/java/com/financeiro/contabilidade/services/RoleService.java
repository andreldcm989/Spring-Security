package com.financeiro.contabilidade.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeiro.contabilidade.model.RoleModel;
import com.financeiro.contabilidade.repositorios.RoleRep;

@Service
public class RoleService {

    @Autowired
    private RoleRep roleRep;

    public List<RoleModel> listarRoles() {
        return roleRep.findAll();
    }
}
