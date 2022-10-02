package com.financeiro.contabilidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeiro.contabilidade.model.RoleModel;
import com.financeiro.contabilidade.services.RoleService;

@RestController
@RequestMapping("api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PreAuthorize("ADMIN")
    @GetMapping
    public ResponseEntity<List<RoleModel>> listarRoles() {
        return ResponseEntity.ok().body(roleService.listarRoles());
    }
}
