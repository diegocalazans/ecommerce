package br.com.estagio.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"br.com.estagio.ecommerce"})
@EntityScan({"br.com.estagio.ecommerce.core.entity"})
@EnableJpaRepositories({"br.com.estagio.ecommerce.core.repository"})
@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);	
	}

}
