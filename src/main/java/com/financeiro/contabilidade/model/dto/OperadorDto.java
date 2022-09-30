package com.financeiro.contabilidade.model.dto;

import com.financeiro.contabilidade.model.Supervisor;

public class OperadorDto extends FuncionarioDto {

    private Integer cargaHoraria;
    private Integer entrada;
    private Integer saida;
    private Supervisor supervisor;

    public OperadorDto() {
    }

    public OperadorDto(Integer matricula, String nome, String sexo, Double salario, String cargo,
            Integer cargaHoraria, Integer entrada, Integer saida, Supervisor supervisor) {
        super(matricula, nome, sexo, salario, cargo);
        this.cargaHoraria = cargaHoraria;
        this.entrada = entrada;
        this.saida = saida;
        this.supervisor = supervisor;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }

    public Integer getSaida() {
        return saida;
    }

    public void setSaida(Integer saida) {
        this.saida = saida;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

}
