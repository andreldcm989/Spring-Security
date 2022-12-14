package com.financeiro.contabilidade.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.financeiro.contabilidade.model.User;
import com.financeiro.contabilidade.repositorios.UserRep;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRep userRep;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User salvarUsuario(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRep.save(user);
    }

    public List<User> listarUsuarios() {
        return userRep.findAll();
    }

    public User buscarUsuarioPorUsername(String username) {
        return userRep.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado."));
    }

    public User editarUsuario(String username, User user) {
        User usuario = userRep.getReferenceByUsername(username);
        BeanUtils.copyProperties(user, usuario);
        usuario.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRep.save(usuario);
    }

    public void excluirUsuario(String username) {
        User user = userRep.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));
        userRep.delete(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRep.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário " + username + "não encontrado."));
        return user;
    }
}
