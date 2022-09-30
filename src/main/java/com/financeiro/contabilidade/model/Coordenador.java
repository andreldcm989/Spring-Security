package com.financeiro.contabilidade.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_COORDENADORES")
public class Coordenador extends Funcionario {

    @Column(nullable = false)
    private Double metaAnual;

    @OneToMany(mappedBy = "coordenador")
    private List<Supervisor> supervisores;

    @ManyToOne
    @JoinColumn(name = "gerente_id")
    private Gerente gerente;

    public Coordenador() {
    }

    public Coordenador(LocalDateTime dataCadastro, Integer matricula, String nome, String sexo, Double salario,
            String cargo, Double metaAnual) {
        super(dataCadastro, matricula, nome, sexo, salario, cargo);
        this.metaAnual = metaAnual;
    }

    public Double getMetaAnual() {
        return metaAnual;
    }

    public void setMetaAnual(Double metaAnual) {
        this.metaAnual = metaAnual;
    }

    public List<Supervisor> getSupervisores() {
        return supervisores;
    }

    public void addSupervisor(Supervisor supervisor) {
        supervisores.add(supervisor);
    }

    public void excluirSupervisor(Supervisor supervisor) {
        supervisores.remove(supervisor);
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

}
