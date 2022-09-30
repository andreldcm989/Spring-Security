package com.financeiro.contabilidade.model.dto;

import java.util.List;

public class GerenteDto extends FuncionarioDto {

    private Double metaAnual;
    private List<CoordenadorDto> coordenadorDto;

    public GerenteDto() {
    }

    public GerenteDto(Integer matricula, String nome, String sexo, Double salario, String cargo, Double metaAnual,
            List<CoordenadorDto> coordenadorDto) {
        super(matricula, nome, sexo, salario, cargo);
        this.metaAnual = metaAnual;
        this.coordenadorDto = coordenadorDto;
    }

    public Double getMetaAnual() {
        return metaAnual;
    }

    public void setMetaAnual(Double metaAnual) {
        this.metaAnual = metaAnual;
    }

    public List<CoordenadorDto> getCoordenadorDto() {
        return coordenadorDto;
    }

    public void setCoordenadorDto(List<CoordenadorDto> coordenadorDto) {
        this.coordenadorDto = coordenadorDto;
    }

}
