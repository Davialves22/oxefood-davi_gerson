package br.com.ifpe.oxefood.api.Entregador;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.Produto.Produto;
import br.com.ifpe.oxefood.modelo.cliente.Cliente;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorRequest { // vai converter num objeto que tenha os atributos

  private String nome;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataNascimento;

  private String cpf;

  private String foneCelular;

  private String foneFixo;

  private Integer qtdEntregasRealizadas;

  private Double valorFrete;

  private String enderecoRua;

  private String enderecoComplemento;

  private String enderecoNumero;

  private String enderecoBairro;

  private String enderecoCidade;

  private String enderecoCep;

  private String enderecoUf;

  private Boolean ativo;

  public Cliente build() {

    return Cliente.builder()
        .nome(nome)
        .dataNascimento(dataNascimento)
        .cpf(cpf)
        .foneCelular(foneCelular)
        .foneFixo(foneFixo)
        .qtdEntregasRealizadas(qtdEntregasRealizadas)
        .valorFrete(valorFrete)
        .enderecoRua()
        .enderecoComplemento()
        .enderecoNumero()
        .enderecoBairro()
        .enderecoCidade()
        .enderecoCep()
        .enderecoUf()
        .ativo()
        .build()
  }

}
