package com.financeiro.contabilidade.model.dto;

import java.util.List;

public class CoordenadorDto extends FuncionarioDto {

    private Double metaAnual;
    private List<SupervisorDto> supervisoresDto;
    private GerenteDto gerenteDto;

    public CoordenadorDto() {
    }

    public Double getMetaAnual() {
        return metaAnual;
    }

    public CoordenadorDto(Integer matricula, String nome, String sexo, Double salario, String cargo, String usuario,
            String senha, Double metaAnual, GerenteDto gerenteDto) {
        super(matricula, nome, sexo, salario, cargo, usuario, senha);
        this.metaAnual = metaAnual;
        this.gerenteDto = gerenteDto;
    }

    public void setMetaAnual(Double metaAnual) {
        this.metaAnual = metaAnual;
    }

    public List<SupervisorDto> getSupervisoresDto() {
        return supervisoresDto;
    }

    public void setSupervisoresDto(List<SupervisorDto> supervisoresDto) {
        this.supervisoresDto = supervisoresDto;
    }

    public GerenteDto getGerenteDto() {
        return gerenteDto;
    }

    public void setGerenteDto(GerenteDto gerenteDto) {
        this.gerenteDto = gerenteDto;
    }

}
