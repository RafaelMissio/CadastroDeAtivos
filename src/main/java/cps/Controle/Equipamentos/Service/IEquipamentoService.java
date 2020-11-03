package cps.Controle.Equipamentos.Service;

import java.util.List;

import cps.Controle.Equipamentos.Model.Equipamento;

public interface IEquipamentoService {

	List<Equipamento> getAllEquipamentos();
	void addEquipamento(Equipamento equipamento);
	Equipamento getEquipamentoById(long id);
	void deleteEquipamentoById(long id);
}