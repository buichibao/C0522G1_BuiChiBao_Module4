package com.example.demo.service;


import com.example.demo.model.Product;

import java.util.List;


public interface IProductService {

    List<Product> findAll();

    void add(Product product);


     Product findById(int id);

    void delete(int id);


    void update(Product product);

    List<Product> searchByName(String name);
}
