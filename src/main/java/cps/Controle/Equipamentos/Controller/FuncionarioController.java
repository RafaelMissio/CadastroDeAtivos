package cps.Controle.Equipamentos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cps.Controle.Equipamentos.Model.Funcionario;
import cps.Controle.Equipamentos.Service.IFuncionarioService;

@Controller
public class FuncionarioController {

	@Autowired
	private IFuncionarioService funcionarioService;
	
	@GetMapping("/Funcionario")
	public String viewFuncionario(Model model)
	{
		model.addAttribute("listFuncionarios", funcionarioService.getAllFuncionarios());
		return "index_funcionario";
	}
	
	@GetMapping("/showNewFuncionarioForm")
	public String showNewFuncionarioForm(Model model)
	{
		Funcionario funcionario = new Funcionario();
		model.addAttribute("funcionario",funcionario);
		return "new_funcionario";
	}
	
	@PostMapping("/saveFuncionario")
	public String saveFuncionario(@ModelAttribute("funcionario")Funcionario funcionario)
	{
		funcionarioService.addFuncionario(funcionario);
		return "redirect:/";
	}
	
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        
        Funcionario funcionario = funcionarioService.getFuncionarioById(id);

        model.addAttribute("funcionario", funcionario);
        return "update_funcionario";
    }
    
    @GetMapping("/deletefuncionario/{id}")
    public String deletefuncionario(@PathVariable(value = "id") long id) {

        this.funcionarioService.deleteFuncionarioById(id);
        return "redirect:/";
    }
}
