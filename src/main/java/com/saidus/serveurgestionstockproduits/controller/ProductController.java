package com.saidus.serveurgestionstockproduits.controller;

import com.saidus.serveurgestionstockproduits.entity.Product;
import com.saidus.serveurgestionstockproduits.service.ICrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin
@RestController
@RequestMapping(value = "/api/product")
public class ProductController extends CrudController<Product, Long> {

    public ProductController(ICrudService<Product, Long> crudService) {

    }
}
