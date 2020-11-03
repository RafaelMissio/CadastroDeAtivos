package cps.Controle.Equipamentos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cps.Controle.Equipamentos.Model.Equipamento;


@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long>{
	
	

}
