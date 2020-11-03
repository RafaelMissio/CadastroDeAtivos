package cps.Controle.Equipamentos.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cps.Controle.Equipamentos.Model.Funcionario;
import cps.Controle.Equipamentos.Repository.FuncionarioRepository;

@Service
public class FuncionarioService implements IFuncionarioService{

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	@Override
	public List<Funcionario> getAllFuncionarios() {
		return funcionarioRepository.findAll();
	}


	@Override
	public void addFuncionario(Funcionario funcionario) {
			this.funcionarioRepository.save(funcionario);
	}

	@Override
	public Funcionario getFuncionarioById(long id) {
		Optional<Funcionario> optional = funcionarioRepository.findById(id);
		Funcionario funcionario =null;
		if(optional.isPresent())
		{
			funcionario = optional.get();
		}
		else 
		{
			throw new RuntimeException("Funcionario não encontrado.");	
		}
		return funcionario;
		
	}


	@Override
	public void deleteFuncionarioById(long id) {
		this.funcionarioRepository.deleteById(id);
		
	}

}
