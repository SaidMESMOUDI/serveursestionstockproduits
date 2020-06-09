package com.saidus.serveurgestionstockproduits.service.impl;


import com.saidus.serveurgestionstockproduits.entity.Product;
import com.saidus.serveurgestionstockproduits.repository.IProductRepository;
import com.saidus.serveurgestionstockproduits.service.ICrudService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ProductServiceImpl implements ICrudService<Product, Long> {

    private IProductRepository productRepository;

    public ProductServiceImpl(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return this.productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public void update(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        /*
        Product produit = new Product();
        produit.setId(id);
        this.productRepository.delete(produit);
        */
        this.productRepository.deleteById(id);
    }

    @Override
    public void saveAll(Iterable<Product> iterable) {
        this.productRepository.saveAll(iterable);
    }


}
