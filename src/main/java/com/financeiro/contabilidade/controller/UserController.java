package com.financeiro.contabilidade.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeiro.contabilidade.model.User;
import com.financeiro.contabilidade.model.dto.UserDtoRetorno;
import com.financeiro.contabilidade.model.dto.UserDtoSalvar;
import com.financeiro.contabilidade.services.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDtoRetorno> salvarUsuario(@RequestBody UserDtoSalvar usuario) {
        User novo = new User();
        novo.setUsername(usuario.getUsername());
        novo.setPassword(usuario.getPassword());
        userService.salvarUsuario(novo);
        UserDtoRetorno retorno = new UserDtoRetorno(usuario.getUsername());
        return ResponseEntity.ok().body(retorno);
    }

    @GetMapping
    public ResponseEntity<List<UserDtoRetorno>> listarUsuarios() {
        List<User> usuarios = userService.listarUsuarios();
        List<UserDtoRetorno> listaDto = new ArrayList<>();
        usuarios.forEach(user -> {
            UserDtoRetorno dto = new UserDtoRetorno(user.getUsername());
            listaDto.add(dto);
        });
        return ResponseEntity.ok().body(listaDto);
    }
}
