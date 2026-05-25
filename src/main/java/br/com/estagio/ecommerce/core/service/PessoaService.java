package br.com.estagio.ecommerce.core.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import br.com.estagio.ecommerce.core.entity.PessoaEntity;
import br.com.estagio.ecommerce.core.exception.EcommerceException;
import br.com.estagio.ecommerce.core.repository.PessoaRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class PessoaService {

	private final PessoaRepository repository;

	public PessoaService(PessoaRepository repository) {
		this.repository = repository;
	}

	private boolean existe(PessoaEntity pessoa) {
		Integer id = ObjectUtils.isEmpty(pessoa.getId()) ? 0 : pessoa.getId();
		return repository.countByCpfAndIdNot(pessoa.getCpf(), id) > 0;
	}

	public void salvar(PessoaEntity pessoa) {
		if (existe(pessoa)) {
			throw new EcommerceException("Já existe pessoa cadastrada com este cpf");
		}
		repository.save(pessoa);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}

	public PessoaEntity buscarPorId(Integer id) {
		return repository.findById(id).orElseThrow(EntityNotFoundException::new);
	}

	public List<PessoaEntity> buscarTodos() {
		return repository.findAll();
	}

}
