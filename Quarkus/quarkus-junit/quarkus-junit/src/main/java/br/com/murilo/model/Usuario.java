package br.com.murilo.model;


import lombok.Data;


import javax.persistence.*;

@NamedNativeQueries({
        @NamedNativeQuery(name="LISTAR_USUARIOS", query = "SELECT id, nome, sexo from teste.USUARIOS", resultClass = Usuario.class),
})
@Data
@Entity
@Table(name = "USUARIOS", schema = "teste")
public class Usuario {

    @Id
    private Long id;

    private String nome;

    private String sexo;

}
