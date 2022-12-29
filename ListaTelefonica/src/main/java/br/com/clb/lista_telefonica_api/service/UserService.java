package br.com.clb.lista_telefonica_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clb.lista_telefonica_api.model.User;
import br.com.clb.lista_telefonica_api.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void salvar(User user) {
		userRepository.save(user);
	}
}
