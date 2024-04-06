package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("com/example/cardapio/food")
public class FoodController {
    @Autowired //indica pro spring como instanciar

    private FoodRepository repository;
    @GetMapping
    public List<Food> getAll(){ //é usado quando o request puca o food



        List<Food> foodList = repository.findAll();//pega todos os dados
        return foodList;
    }
}
