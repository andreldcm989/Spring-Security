package com.financeiro.contabilidade.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeiro.contabilidade.model.User;
import com.financeiro.contabilidade.model.dto.UserDtoEditar;
import com.financeiro.contabilidade.model.dto.UserDtoRetorno;
import com.financeiro.contabilidade.model.dto.UserDtoSalvar;
import com.financeiro.contabilidade.services.RoleService;
import com.financeiro.contabilidade.services.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @PostMapping
    public ResponseEntity<UserDtoRetorno> salvarUsuario(@RequestBody UserDtoSalvar usuario) {
        User novo = new User();
        novo.setUsername(usuario.getUsername());
        novo.setPassword(usuario.getPassword());
        novo.addRole(roleService.buscarRolePorNome(usuario.getRole()));
        userService.salvarUsuario(novo);
        List<String> roles = novo.getRoles().stream().map((role) -> role.getRoleName().toString()).toList();
        UserDtoRetorno retorno = new UserDtoRetorno(usuario.getUsername(), roles);
        return ResponseEntity.ok().body(retorno);
    }

    @GetMapping
    public ResponseEntity<List<UserDtoRetorno>> listarUsuarios() {
        List<User> usuarios = userService.listarUsuarios();
        List<UserDtoRetorno> listaDto = new ArrayList<>();
        usuarios.forEach(user -> {
            List<String> roles = user.getRoles().stream().map((role) -> role.getRoleName().toString()).toList();
            UserDtoRetorno dto = new UserDtoRetorno(user.getUsername(), roles);
            listaDto.add(dto);
        });
        return ResponseEntity.ok().body(listaDto);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Object> excluirUsuario(@PathVariable(name = "username") String username) {
        userService.excluirUsuario(username);
        return ResponseEntity.ok().body("Usuário excluído com sucesso!");
    }

    @PutMapping("/{username}/editar")
    public ResponseEntity<Object> editarUsuario(@PathVariable(name = "username") String username,
            @RequestBody UserDtoEditar userDto) {
        User usuario = userService.buscarUsuarioPorUsername(username);
        String senhaAntiga = usuario.getPassword();
        if (!userDto.getNewPassword().isBlank()) {
            if (new BCryptPasswordEncoder().matches(userDto.getOldPassword(), senhaAntiga)) {
                if (usuario.getUsername() == userDto.getUsername())
                    usuario.setUsername(userDto.getUsername());
                usuario.setPassword(userDto.getNewPassword());
                return ResponseEntity.ok().body(userService.editarUsuario(username, usuario));
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("A senha antiga não confere com o banco de dados.");
            }
        }
        usuario.setUsername(userDto.getUsername());
        return ResponseEntity.ok().body(userService.editarUsuario(username, usuario));

    }
}
