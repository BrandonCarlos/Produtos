package com.example.Produtos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class Products {

    @GetMapping("/produtos")
    public List<Object> getProducts() {
        String uri = "https://dummyjson.com/products";
        RestTemplate template = new RestTemplate();
        Object[] objects = new Object[]{template.getForObject(uri, Object.class)};
        return Arrays.asList(objects);
    }

    @GetMapping("/produtos/{id}")
    public ResponseEntity<?> detalhar(@PathVariable("id") Integer id) {
        usuario =
    }


}
