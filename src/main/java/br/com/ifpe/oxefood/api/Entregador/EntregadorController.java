package br.com.ifpe.oxefood.api.Entregador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.modelo.;
import br.com.ifpe.oxefood.modelo.Produto.ProdutoService;

@RestController
@RequestMapping("/api/produto") // mapeamento por rotas
@CrossOrigin

public class EntregadorController {
  @Autowired
  private EntregadorService entregadorService;

  @PostMapping
  public ResponseEntity<Produto> save(@RequestBody EntregadorRequest request) {

    Entregador entregador = entregadorService.save(request.build());
    return new ResponseEntity<Entregador>(entregador, HttpStatus.CREATED);
  }

}
