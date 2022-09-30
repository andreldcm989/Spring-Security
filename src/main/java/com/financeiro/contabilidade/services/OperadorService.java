package com.financeiro.contabilidade.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeiro.contabilidade.model.Operador;
import com.financeiro.contabilidade.repositorios.OperadorRep;

@Service
public class OperadorService {

    @Autowired
    private OperadorRep operadorRep;

    public Operador salvarOperador(Operador operador) {
        return operadorRep.save(operador);
    }

    public List<Operador> listarOperadores() {
        return operadorRep.findAll();
    }

    public Operador buscarOperadorPorId(Long id) {
        return operadorRep.findById(id).orElseThrow(() -> new RuntimeException("Operador não encontrado."));
    }

    public Operador editarOperador(Long id, Operador operador) {
        Operador obj = operadorRep.getReferenceById(id);
        BeanUtils.copyProperties(operador, obj);
        return operadorRep.save(obj);
    }

    public void excluirOperador(Long id) {
        operadorRep.deleteById(id);
    }
}
