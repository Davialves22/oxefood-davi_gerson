package br.com.ifpe.oxefood.api.Entregador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.modelo.entregador.Entregador;
import br.com.ifpe.oxefood.modelo.entregador.EntregadorService;

@RestController
@RequestMapping("/api/entregador") // mapeamento por rotas
@CrossOrigin

public class EntregadorController {
  @Autowired
  private EntregadorService entregadorService;

  @PostMapping
  public ResponseEntity<Entregador> save(@RequestBody EntregadorRequest request) {

    Entregador entregador = entregadorService.save(request.build());
    return new ResponseEntity<Entregador>(entregador, HttpStatus.CREATED);
  }

}
