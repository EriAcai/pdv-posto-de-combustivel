package com.br.pbpostodecombustivel;

import com.br.pbpostodecombustivel.domain.entity.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PbpcombustivelApplication {
	public static void main(String[] args) {

        SpringApplication.run(PbpcombustivelApplication.class, args);
        Pessoa pessoa1 =  new Pessoa();
        pessoa1.setNomeCompleto("Erick");
        System.out.println("Nome Completo:" + pessoa1.getNomeCompleto());
	}
}
