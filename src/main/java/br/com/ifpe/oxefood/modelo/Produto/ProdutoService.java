package br.com.ifpe.oxefood.modelo.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ProdutoService {

  @Autowired
  private ProdutoRepository repository;

  @Transactional // escopo de transação no banco de dados
  public Produto save(Produto produto) {

    produto.setHabilitado(Boolean.TRUE);
    return repository.save(produto);
  }

}
