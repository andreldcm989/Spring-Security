package com.financeiro.contabilidade.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_OPERADORES")
public class Operador extends Funcionario {

    @Column(nullable = false)
    private int cargaHoraria;

    @Column(nullable = false)
    private int entrada;

    @Column(nullable = false)
    private int saida;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Supervisor supervisor;

    public Operador() {
    }

    public Operador(LocalDateTime dataCadastro, Integer matricula, String nome, String sexo, Double salario,
            String cargo, int cargaHoraria, int entrada, int saida, Supervisor supervisor) {
        super(dataCadastro, matricula, nome, sexo, salario, cargo);
        this.cargaHoraria = cargaHoraria;
        this.entrada = entrada;
        this.saida = saida;
        this.supervisor = supervisor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

}
