package com.br.pbpostodecombustivel.domain.entity;

import com.br.pbpostodecombustivel.enums.TipoPessoa;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_completo", length = 200, nullable = false)
    private String nomeComplete;

    @Column(name = "cpf_cnpj", length = 14, nullable = false)
    private String CpfCnpj;

    @Column(length = 200, nullable = false)
    private String nomeCompleto;

    @Column(length = 14, nullable = false)
    private String cpfCnpj;

    @Column(length = 12)
    private Long numeroCtps;

    @Column(name = "data_nascimento", length = 10, nullable = false)
    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pessoa", nullable = false, length = 15 )
    private TipoPessoa tipoPessoa;

    public Pessoa(String nomeCompleto, String cpfCnpj, Long numeroCtps, LocalDate dataNascimento) {
        super();
        this.numeroCtps = numeroCtps;
        this.dataNascimento = dataNascimento;
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
    }

    public Pessoa() {

    }
    public Long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getCpfCnpj() {
        return cpfCnpj;
    }
    public void getCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
    public Long getNumeroCtps() {
        return numeroCtps;
    }
    public void setNumeroCtps(Long numeroCtps) {
        this.numeroCtps = numeroCtps;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}