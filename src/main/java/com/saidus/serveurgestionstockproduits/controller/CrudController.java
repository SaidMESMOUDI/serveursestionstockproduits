package com.saidus.serveurgestionstockproduits.controller;

import com.saidus.serveurgestionstockproduits.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CrudController<T, ID> {

    @Autowired
    private ICrudService<T, ID> crudService;

    @GetMapping
    public List<T> getAll() {
        return this.crudService.getAll();
    }

    @PostMapping
    public void add(@RequestBody T entity) {
        this.crudService.add(entity);
    }

    @PutMapping
    public void update(@RequestBody T entity) {
        this.crudService.update(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) {
        this.crudService.delete(id);
    }

    @PostMapping("/all")
    public ResponseEntity<List<T>> addAll(@RequestBody List<T> list) {
        this.crudService.saveAll(list);
        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
    }
}
