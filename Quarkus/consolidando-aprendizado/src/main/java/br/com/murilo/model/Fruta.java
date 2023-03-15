package br.com.murilo.model;

import lombok.Data;
import org.junit.Ignore;

import javax.persistence.*;

@Data
@Ignore
@Table(name = "FRUTA")
@Entity(name = "FRUTA")
public class Fruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Long peso;


}
