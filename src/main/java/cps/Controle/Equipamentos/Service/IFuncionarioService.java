package cps.Controle.Equipamentos.Service;

import java.util.List;

import cps.Controle.Equipamentos.Model.Funcionario;

public interface IFuncionarioService {

	List<Funcionario> getAllFuncionarios();
	void addFuncionario(Funcionario funcionario);
	Funcionario getFuncionarioById(long id);
	void deleteFuncionarioById(long id);
}

