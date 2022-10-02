package com.financeiro.contabilidade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContabilidadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContabilidadeApplication.class, args);
	}

	// @Configuration
	// public class Inicial implements CommandLineRunner {

	// @Autowired
	// private RoleRep roleRep;

	// @Override
	// public void run(String... args) throws Exception {
	// RoleModel gerente = new RoleModel();
	// gerente.setRoleName(RoleName.GERENTE);
	// RoleModel coordenador = new RoleModel();
	// coordenador.setRoleName(RoleName.COORDENADOR);
	// RoleModel supervisor = new RoleModel();
	// supervisor.setRoleName(RoleName.SUPERVISOR);
	// RoleModel operador = new RoleModel();
	// operador.setRoleName(RoleName.GERENTE);

	// roleRep.saveAll(Arrays.asList(gerente, coordenador, supervisor, operador));

	// }

	// }

}
