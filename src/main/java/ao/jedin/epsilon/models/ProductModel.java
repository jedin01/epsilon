package ao.jedin.epsilon.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "products")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Double preco;

    public ProductModel(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
