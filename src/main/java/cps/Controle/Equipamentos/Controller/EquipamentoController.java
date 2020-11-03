package cps.Controle.Equipamentos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cps.Controle.Equipamentos.Model.Equipamento;
import cps.Controle.Equipamentos.Model.Funcionario;
import cps.Controle.Equipamentos.Service.IEquipamentoService;

@Controller
public class EquipamentoController {

	@Autowired
	private IEquipamentoService equipamentoService;
	
	@GetMapping("/")
	public String viewEquipamentos(Model model)
	{
		model.addAttribute("listEquipamentos", equipamentoService.getAllEquipamentos());
		return "index";
	}

	@GetMapping("/showNewEquipamentoForm")
	public String showNewFuncionarioForm(Model model)
	{
		Equipamento equipamento = new Equipamento();
		model.addAttribute("equipamento",equipamento);
		return "new_equipamento";
	}
	
	@PostMapping("/saveEquipamento")
	public String saveEquipamento(@ModelAttribute("equipamento")Equipamento equipamento)
	{
		equipamentoService.addEquipamento(equipamento);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForEquipamentoUpdate/{id}")
    public String showFormForEquipamentoUpdate(@PathVariable(value = "id") long id, Model model) {

        
		Equipamento equipamento = equipamentoService.getEquipamentoById(id);

        model.addAttribute("equipamento", equipamento);
        return "update_equipamento";
    }
	
    @GetMapping("/deleteEquipamento/{id}")
    public String deleteEquipamento(@PathVariable(value = "id") long id) {

        this.equipamentoService.deleteEquipamentoById(id);
        return "redirect:/";
    }
}
