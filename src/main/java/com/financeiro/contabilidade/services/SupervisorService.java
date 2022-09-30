package com.financeiro.contabilidade.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financeiro.contabilidade.model.Supervisor;
import com.financeiro.contabilidade.repositorios.SupervisorRep;

@Service
public class SupervisorService {

    @Autowired
    private SupervisorRep supervisorRep;

    public Supervisor salvarSupervisor(Supervisor supervisor) {
        return supervisorRep.save(supervisor);
    }

    public List<Supervisor> listarSupervisores() {
        return supervisorRep.findAll();
    }

    public Supervisor buscarSupervisorPorId(Long id) {
        return supervisorRep.findById(id).orElseThrow(() -> new RuntimeException("Supervisor não encontrado."));
    }

    public Supervisor editarsupervisor(Long id, Supervisor supervisor) {
        Supervisor obj = supervisorRep.getReferenceById(id);
        BeanUtils.copyProperties(supervisor, obj);
        return supervisorRep.save(obj);
    }

    public void excluirSupervisor(Long id) {
        supervisorRep.deleteById(id);
    }
}
