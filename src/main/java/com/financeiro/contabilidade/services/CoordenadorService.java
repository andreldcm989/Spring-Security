package com.financeiro.contabilidade.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeiro.contabilidade.model.Coordenador;
import com.financeiro.contabilidade.repositorios.CoordenadorRep;

@Service
public class CoordenadorService {

    @Autowired
    private CoordenadorRep coordenadorRep;

    public Coordenador salvarCoordenador(Coordenador coordenador) {
        return coordenadorRep.save(coordenador);
    }

    public List<Coordenador> listarCoordenadores() {
        return coordenadorRep.findAll();
    }

    public Coordenador buscarCoordenadorPorId(Long id) {
        return coordenadorRep.findById(id).orElseThrow(() -> new RuntimeException("Coordenador não encontrado."));
    }

    public Coordenador editarCoordenador(Long id, Coordenador coordenador) {
        Coordenador obj = coordenadorRep.getReferenceById(id);
        BeanUtils.copyProperties(coordenador, obj);
        return coordenadorRep.save(obj);
    }

    public void excluirCoordenador(Long id) {
        coordenadorRep.deleteById(id);
    }
}
