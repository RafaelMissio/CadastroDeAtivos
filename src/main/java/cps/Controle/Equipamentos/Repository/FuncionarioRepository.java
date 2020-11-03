package cps.Controle.Equipamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cps.Controle.Equipamentos.Model.Funcionario;


@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	
	

}
