package com.br.pbpostodecombustivel.enums;

/**
 * Define os tipos de Pessoa que podem ser cadastrados no sistema (Ex: Cliente, Funcionário, Fornecedor).
 */

public enum TipoPessoa {
    CLIENTE("Cliente"),
    FUNCIONARIO("Funcionário"),
    FORNECEDOR("Fornecedor");

    private final String descricao;
    TipoPessoa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}