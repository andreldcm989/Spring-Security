package com.financeiro.contabilidade.repositorios;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeiro.contabilidade.model.User;

public interface UserRep extends JpaRepository<User, UUID> {

    public Optional<User> findByUsername(String username);
}
