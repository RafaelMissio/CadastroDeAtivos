package cps.Controle.Equipamentos.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cps.Controle.Equipamentos.Model.Equipamento;
import cps.Controle.Equipamentos.Repository.EquipamentoRepository;

@Service
public class EquipamentoService implements IEquipamentoService {

	
	@Autowired
	private EquipamentoRepository equipamentoRepository;
	
	@Override
	public List<Equipamento> getAllEquipamentos() {
		return equipamentoRepository.findAll();
	}

	@Override
	public void addEquipamento(Equipamento equipamento) {
		this.equipamentoRepository.save(equipamento);
		
	}

	@Override
	public Equipamento getEquipamentoById(long id) {
		Optional<Equipamento> optional = equipamentoRepository.findById(id);
		Equipamento equipamento =null;
		if(optional.isPresent())
		{
			equipamento = optional.get();
		}
		else 
		{
			throw new RuntimeException("Funcionario não encontrado.");	
		}
		return equipamento;
	}

	@Override
	public void deleteEquipamentoById(long id) {
		this.equipamentoRepository.deleteById(id);
		
	}

}
