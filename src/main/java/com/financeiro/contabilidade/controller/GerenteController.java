package com.financeiro.contabilidade.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeiro.contabilidade.model.Gerente;
import com.financeiro.contabilidade.model.User;
import com.financeiro.contabilidade.model.dto.GerenteDto;
import com.financeiro.contabilidade.services.GerenteService;
import com.financeiro.contabilidade.services.UserService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_GERENTE')")
@RequestMapping("api/funcionarios/gerentes")
public class GerenteController {

    @Autowired
    private GerenteService gerenteService;

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<Gerente>> listarGerentes() {
        return ResponseEntity.ok().body(gerenteService.listarGerentes());
    }

    @PostMapping
    public ResponseEntity<Gerente> salvarGerente(@RequestBody GerenteDto gerenteDto) {
        Gerente gerente = new Gerente();
        BeanUtils.copyProperties(gerenteDto, gerente);
        User novo = new User();
        novo.setUsername(gerenteDto.getUsuario());
        novo.setPassword(gerenteDto.getSenha());
        novo.addRole(null);
        User usuarioSalvo = userService.salvarUsuario(novo);
        gerente.setUsuario(usuarioSalvo);
        return ResponseEntity.ok().body(gerenteService.salvarGerente(gerente));
    }
}
