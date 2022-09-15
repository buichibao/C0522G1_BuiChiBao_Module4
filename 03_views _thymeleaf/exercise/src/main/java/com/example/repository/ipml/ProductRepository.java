package com.example.repository.ipml;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private  static Map<Integer,Product> productMap = new HashMap<>();
    static {
        productMap.put(1, new Product(1, "TH-True Milk", 7500, "No sugar", "TH company"));
        productMap.put(2, new Product(2, "TH-True Milk", 7500, "less sugar", "TH company"));
        productMap.put(3, new Product(3, "TH-True Milk", 7500, "more sugar", "TH company"));
        productMap.put(4, new Product(4, "Tiger", 15000, "Platinum", "Tiger company"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
       productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }
}
