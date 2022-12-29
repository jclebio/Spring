package br.com.clb.lista_telefonica_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.clb.lista_telefonica_api.model.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository <Telefone, Long> {

}
