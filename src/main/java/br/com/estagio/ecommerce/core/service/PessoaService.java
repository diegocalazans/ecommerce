package br.com.estagio.ecommerce.core.service;

import org.springframework.stereotype.Service;

import br.com.estagio.ecommerce.core.entity.PessoaEntity;
import br.com.estagio.ecommerce.core.repository.PessoaRepository;

@Service
public class PessoaService {
	
	private final PessoaRepository repository;

	public PessoaService(PessoaRepository repository) {		
		this.repository = repository;
	}
	
	public void salvar(PessoaEntity pessoa) {
		repository.save(pessoa);
	}
	
	
}
