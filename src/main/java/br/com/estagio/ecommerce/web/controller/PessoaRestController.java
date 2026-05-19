package br.com.estagio.ecommerce.web.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estagio.ecommerce.core.entity.PessoaEntity;
import br.com.estagio.ecommerce.core.service.PessoaService;

@RestController
@RequestMapping("/v1/pessoa")
public class PessoaRestController {

	private final PessoaService service;

	public PessoaRestController(PessoaService service) {
		this.service = service;
	}

	@PostMapping
	public void cadastrar(@RequestBody PessoaEntity pessoa) {
		service.salvar(pessoa);
	}
	
	@PutMapping
	public void alteracao(@RequestBody PessoaEntity pessoa) {
		service.salvar(pessoa);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PessoaEntity> buscarPeloId(@PathVariable Integer id) {
		PessoaEntity pessoa = service.buscarPorId(id);
		return ResponseEntity.ok(pessoa);
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<PessoaEntity>> listar() {
		List<PessoaEntity> pessoas = service.buscarTodos();
		return ResponseEntity.ok(pessoas);
	}


}
