package br.com.estagio.ecommerce.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
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

}
