package com.financeiro.contabilidade;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.financeiro.contabilidade.enums.Cargo;
import com.financeiro.contabilidade.model.Operador;
import com.financeiro.contabilidade.model.Supervisor;
import com.financeiro.contabilidade.repositorios.OperadorRep;
import com.financeiro.contabilidade.repositorios.SupervisorRep;

@Configuration
public class Testes implements CommandLineRunner {

    @Autowired
    private OperadorRep operadorRep;

    @Autowired
    private SupervisorRep supervisorRep;

    @Override
    public void run(String... args) throws Exception {

        Supervisor s1 = new Supervisor(LocalDateTime.now(), 1001, "Vitor Pereira", "M", 5000.0,
                Cargo.SUPERVISOR.toString(), 44, 8, 0, null);
        Operador o1 = new Operador(LocalDateTime.now(), 2001, "Roger Guedes", "M", 3000.0, Cargo.OPERADOR.toString(),
                36, 8, 14, s1);

        supervisorRep.save(s1);
        operadorRep.save(o1);

    }

}
