package br.com.clb.lista_telefonica_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clb.lista_telefonica_api.model.Telefone;
import br.com.clb.lista_telefonica_api.repository.TelefoneRepository;


@Service
public class TelefoneService {

	@Autowired
	private TelefoneRepository telefoneRepository;
	
	public void salvar(Telefone user) {
		telefoneRepository.save(user);
	}
}
