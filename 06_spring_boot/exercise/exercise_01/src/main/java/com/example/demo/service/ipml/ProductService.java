package com.example.demo.service.ipml;


import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void add(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public void update(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public List<Product> searchByName(String name) {
        return iProductRepository.findByNameContaining(name);
    }

}
