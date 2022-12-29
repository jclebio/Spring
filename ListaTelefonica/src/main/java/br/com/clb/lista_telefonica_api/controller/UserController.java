package br.com.clb.lista_telefonica_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clb.lista_telefonica_api.model.User;
import br.com.clb.lista_telefonica_api.service.UserService;



@RestController()
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public void salvar(@RequestBody User user) {
		userService.salvar(user);
	}
}
