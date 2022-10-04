package com.financeiro.contabilidade.model.dto;

import java.util.List;

public class UserDtoRetorno {

    private String username;
    private List<String> roles;

    public UserDtoRetorno() {
    }

    public UserDtoRetorno(String username, List<String> roles) {
        this.username = username;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRole() {
        return roles;
    }

    public void addRole(String role) {
        roles.add(role);
    }

}
