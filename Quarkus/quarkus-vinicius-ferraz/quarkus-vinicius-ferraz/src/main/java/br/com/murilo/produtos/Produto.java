package br.com.murilo.produtos;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "PRODUTO")
@Data
@Table(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;



}
