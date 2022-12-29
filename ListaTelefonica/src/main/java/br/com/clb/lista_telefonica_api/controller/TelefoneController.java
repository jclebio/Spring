package br.com.clb.lista_telefonica_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clb.lista_telefonica_api.model.Telefone;
import br.com.clb.lista_telefonica_api.service.TelefoneService;



@RestController()
@RequestMapping("Telefone")
public class TelefoneController {

	@Autowired
	private TelefoneService telefoneService;
	
	@PostMapping
	public void salvar(@RequestBody Telefone telefone) {
		telefoneService.salvar(telefone);
	}
}
