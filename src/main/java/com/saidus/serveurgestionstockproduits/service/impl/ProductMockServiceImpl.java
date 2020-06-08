package com.saidus.serveurgestionstockproduits.service.impl;

import com.saidus.serveurgestionstockproduits.entity.Product;
import com.saidus.serveurgestionstockproduits.service.ICrudService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ProductMockServiceImpl implements ICrudService<Product, Long> {
    private List<Product> products;

    public ProductMockServiceImpl() {
        this.products = new ArrayList<Product>();
        this.products.add(new Product("Livre", 50, 20.75f));
        this.products.add(new Product("Cahier", 200, 8.25f));
        this.products.add(new Product("Stylo", 50, 2.10f));
        this.products.add(new Product("Crayon", 34, 1.10f));
    }

    @Override
    public List<Product> getAll() {
        return this.products;
    }

    @Override
    public void add(Product product) {
        this.products.add(product);
    }

    @Override
    public void update(Product product) {
        this.products.remove(product);
        this.products.add(product);
    }

    @Override
    public void delete(Long id) {
        Product product = new Product();
        product.setId(id);
        products.remove(product);
    }

    @Override
    public void saveAll(Iterable<Product> iterable) {
        products.addAll((Collection<? extends Product>) iterable);
    }


}
