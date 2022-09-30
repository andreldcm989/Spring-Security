package com.financeiro.contabilidade.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_GERENTES")
public class Gerente extends Funcionario {

    @Column(nullable = false)
    private Double metaAnual;

    @OneToMany(mappedBy = "gerente")
    private List<Coordenador> coordenadores;

    public Gerente() {
    }

    public Gerente(LocalDateTime dataCadastro, Integer matricula, String nome, String sexo, Double salario,
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

    public List<Coordenador> getCoordenador() {
        return coordenadores;
    }

    public void addCoordenador(Coordenador coordenador) {
        coordenadores.add(coordenador);
    }

    public void excluirCoordenador(Coordenador coordenador) {
        coordenadores.remove(coordenador);
    }

}
