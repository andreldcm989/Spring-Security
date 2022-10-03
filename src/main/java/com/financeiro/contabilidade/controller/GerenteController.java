package com.financeiro.contabilidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeiro.contabilidade.model.Gerente;
import com.financeiro.contabilidade.services.GerenteService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("api/funcionarios/gerentes")
public class GerenteController {

    @Autowired
    private GerenteService gerenteService;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping
    public ResponseEntity<List<Gerente>> listarGerentes() {
        return ResponseEntity.ok().body(gerenteService.listarGerentes());
    }
}
