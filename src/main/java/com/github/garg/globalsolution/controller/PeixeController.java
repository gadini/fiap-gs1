package com.github.garg.globalsolution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.garg.globalsolution.controller.dto.FormPeixe;
import com.github.garg.globalsolution.model.Peixe;
import com.github.garg.globalsolution.repository.PeixeRepository;

@Controller
@RequestMapping("peixes")
public class PeixeController {

	@Autowired
	private PeixeRepository peixeRepository;
	
	@GetMapping("add")
	public String create(Model model) {
		
		model.addAttribute("peixe", new FormPeixe());
		
		return "peixe/form";
	}

	@PostMapping("save")
	public String save(@ModelAttribute FormPeixe peixe) {			
		Peixe entity = peixe.toModel();
		peixeRepository.save(entity);
		return "redirect:/peixes/add";
	}
	
}
