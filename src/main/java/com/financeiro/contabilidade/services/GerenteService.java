package com.financeiro.contabilidade.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeiro.contabilidade.model.Gerente;
import com.financeiro.contabilidade.repositorios.GerenteRep;

@Service
public class GerenteService {

    @Autowired
    private GerenteRep gerenteRep;

    public Gerente salvarGerente(Gerente gerente) {
        return gerenteRep.save(gerente);
    }

    public List<Gerente> listarGerentees() {
        return gerenteRep.findAll();
    }

    public Gerente buscarGerentePorId(Long id) {
        return gerenteRep.findById(id).orElseThrow(() -> new RuntimeException("Gerente não encontrado."));
    }

    public Gerente editarGerente(Long id, Gerente Gerente) {
        Gerente obj = gerenteRep.getReferenceById(id);
        BeanUtils.copyProperties(Gerente, obj);
        return gerenteRep.save(obj);
    }

    public void excluirGerente(Long id) {
        gerenteRep.deleteById(id);
    }
}
