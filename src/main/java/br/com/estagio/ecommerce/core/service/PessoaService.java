package br.com.estagio.ecommerce.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.estagio.ecommerce.core.entity.PessoaEntity;
import br.com.estagio.ecommerce.core.repository.PessoaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class PessoaService {
	
	private final PessoaRepository repository;

	public PessoaService(PessoaRepository repository) {		
		this.repository = repository;
	}
	
	public void salvar(PessoaEntity pessoa) {
		repository.save(pessoa);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	public PessoaEntity buscarPorId(Integer id) {				
		return repository.findById(id)
				.orElseThrow(EntityNotFoundException::new);
	}
	
	public List<PessoaEntity> buscarTodos() {
		return repository.findAll();
	}
	
	
}
