package com.financeiro.contabilidade.model.dto;

public class UserDtoEditar {

    private String username;
    private String oldPassword;
    private String newPassword;
    private String role;

    public UserDtoEditar() {
    }

    public UserDtoEditar(String username, String oldPassword, String newPassword, String role) {
        this.username = username;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.role = role;
    }

    public UserDtoEditar(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
