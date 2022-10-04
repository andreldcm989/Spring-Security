package com.financeiro.contabilidade.model.dto;

import java.util.ArrayList;
import java.util.List;

import com.financeiro.contabilidade.model.Operador;

public class SupervisorDto extends FuncionarioDto {

    private int cargaHoraria;
    private int entrada;
    private int saida;
    private CoordenadorDto coordenadordDto;
    private List<Operador> operadores = new ArrayList<>();

    public SupervisorDto() {
    }

    public SupervisorDto(Integer matricula, String nome, String sexo, Double salario, String cargo, String usuario,
            String senha, int cargaHoraria, int entrada, int saida, CoordenadorDto coordenadordDto,
            List<Operador> operadores) {
        super(matricula, nome, sexo, salario, cargo, usuario, senha);
        this.cargaHoraria = cargaHoraria;
        this.entrada = entrada;
        this.saida = saida;
        this.coordenadordDto = coordenadordDto;
        this.operadores = operadores;
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

    public CoordenadorDto getCoordenador() {
        return coordenadordDto;
    }

    public void setCoordenador(CoordenadorDto coordenadorDto) {
        this.coordenadordDto = coordenadorDto;
    }

    public List<Operador> getOperadores() {
        return operadores;
    }

    public void addOperador(Operador operador) {
        operadores.add(operador);
    }

    public void excluirOperador(Operador operador) {
        operadores.remove(operador);
    }

    public CoordenadorDto getCoordenadordDto() {
        return coordenadordDto;
    }
}
