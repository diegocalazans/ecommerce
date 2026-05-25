package br.com.estagio.ecommerce.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estagio.ecommerce.core.entity.PessoaEntity;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Integer> {

	boolean existsByCpf(String cpf);
	
	long countByCpfAndIdNot(String cpf, Integer id);
	
}
