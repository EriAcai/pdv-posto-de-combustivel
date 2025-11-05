package com.br.pbpostodecombustivel.domain.repository;

import com.br.pbpostodecombustivel.domain.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    Optional<Pessoa> findByName(String nome);
    Optional<Pessoa> findByCpfCpnj(String cpfCnpj);
    boolean existsByCpfCnpj(String cpfCnpj);



}
