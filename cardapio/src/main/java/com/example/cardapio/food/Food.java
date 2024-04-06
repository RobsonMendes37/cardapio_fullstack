package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "foods")
@Entity(name = "foods")
@Getter     //em run time gera metodos get
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id") //diz que o id é a  representação unica de food
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.title = data.title();
        this.price = data.price();
    }
}
