package com.financeiro.contabilidade.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.financeiro.contabilidade.enums.Cargo;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime dataCadastro;
    @Column(nullable = false, unique = true)
    private Integer matricula;
    private String nome;
    private String sexo;
    private Double Salario;
    private Cargo cargo;
    private UserModel usuario;

    public Funcionario() {
    }

    public Funcionario(Long id, LocalDateTime dataCadastro, Integer matricula, String nome, String sexo, Double salario,
            Cargo cargo, UserModel usuario) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        Salario = salario;
        this.cargo = cargo;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Integer getMatricula() {
        return matricula;
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
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
        this.usuario = usuario;
    }

}
