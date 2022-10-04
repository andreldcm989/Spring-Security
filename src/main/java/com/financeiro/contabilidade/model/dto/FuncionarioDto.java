package com.financeiro.contabilidade.model.dto;

public class FuncionarioDto {

    private Integer matricula;
    private String nome;
    private String sexo;
    private Double salario;
    private String cargo;
    private String usuario;
    private String senha;

    public FuncionarioDto() {
    }

    public Integer getMatricula() {
        return matricula;
    }

    public FuncionarioDto(Integer matricula, String nome, String sexo, Double salario, String cargo, String usuario,
            String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
        this.cargo = cargo;
        this.usuario = usuario;
        this.senha = senha;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
