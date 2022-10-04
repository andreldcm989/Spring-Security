package com.financeiro.contabilidade.model.dto;

import java.util.List;

public class GerenteDto extends FuncionarioDto {

    private Double metaAnual;
    private List<CoordenadorDto> coordenadorDto;

    public GerenteDto() {
    }

    public Double getMetaAnual() {
        return metaAnual;
    }

    public GerenteDto(Integer matricula, String nome, String sexo, Double salario, String cargo, String usuario,
            String senha, Double metaAnual) {
        super(matricula, nome, sexo, salario, cargo, usuario, senha);
        this.metaAnual = metaAnual;
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
