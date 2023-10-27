package com.example.Produtos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class Products {

    @CrossOrigin
    @GetMapping("/produtos")
    public List<Object> getProducts() {
        String uri = "https://dummyjson.com/products";
        RestTemplate template = new RestTemplate();
        Object[] objects = new Object[]{template.getForObject(uri, Object.class)};
        return Arrays.asList(objects);
    }

    @CrossOrigin
    @GetMapping("/produtos/{id}")
    public Object[] detalhar(@PathVariable("id") Integer id) {
        String uri = "https://dummyjson.com/products/" + id;
        RestTemplate template = new RestTemplate();
        return new Object[]{template.getForObject(uri, Object.class)};
    }

    @CrossOrigin
    @GetMapping("/produtos/search/{search}")
    public List<Object> searchOfProduct(@PathVariable("search") String search) {
        String uri = "https://dummyjson.com/products/search?q=" + search;
        RestTemplate template = new RestTemplate();
        Object[] objects = new Object[]{template.getForObject(uri, Object.class)};
        return Arrays.asList(objects);
    }

}
