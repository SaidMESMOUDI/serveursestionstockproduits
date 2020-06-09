package com.saidus.serveurgestionstockproduits.controller;

import com.saidus.serveurgestionstockproduits.entity.Product;
import com.saidus.serveurgestionstockproduits.service.ICrudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin
@RestController
@RequestMapping(value = "/api/product")
public class ProductController {
    //@Autowired
    private ICrudService<Product, Long> productService;

    public ProductController(ICrudService<Product, Long> productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Product product) {
        productService.add(product);
    }

    @PutMapping
    public void update(@RequestBody Product product) {
        productService.update(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        productService.delete(id);
    }
}
