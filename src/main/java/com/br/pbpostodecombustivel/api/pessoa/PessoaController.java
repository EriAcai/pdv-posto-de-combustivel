
package com.br.pbpostodecombustivel.api.pessoa;

import com.br.pbpostodecombustivel.domain.dto.PessoaRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pessoas")
public class PessoaController {

    private PessoaController service;

    // O proprio construtor e pesquisar que porra é um construtor aqui e ver por que a porra do service e PessoaConstroller não ta sendo usado.

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PessoaResponse> listar() {
        return service.listarTodos();
    }

    private List<PessoaResponse> listarTodos() {

        return List.of();
    }

    // CREATE === Pesquisar que porra é um CREATE nesse contexto.

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PessoaResponse create(@RequestBody PessoaRequest req) {
        return service.create(req);
    }
}