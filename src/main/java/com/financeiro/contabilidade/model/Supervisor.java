package com.financeiro.contabilidade.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.financeiro.contabilidade.enums.Cargo;

@Entity
@Table(name = "TB_SUPERVISORES")
public class Supervisor extends Funcionario {

    @Column(nullable = false)
    private int cargaHoraria;

    @Column(nullable = false)
    private int entrada;

    @Column(nullable = false)
    private int saida;

    @ManyToOne
    @JoinColumn(name = "coordenador_id")
    private Coordenador coordenador;

    @OneToMany(mappedBy = "supervisor")
    private List<Operador> operadores = new ArrayList<>();

    public Supervisor() {
    }

    public Supervisor(Long id, LocalDateTime dataCadastro, Integer matricula, String nome, String sexo, Double salario,
            Cargo cargo, UserModel usuario, int cargaHoraria, int entrada, int saida, Coordenador coordenador) {
        super(id, dataCadastro, matricula, nome, sexo, salario, cargo, usuario);
        this.cargaHoraria = cargaHoraria;
        this.entrada = entrada;
        this.saida = saida;
        this.coordenador = coordenador;
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

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

}
