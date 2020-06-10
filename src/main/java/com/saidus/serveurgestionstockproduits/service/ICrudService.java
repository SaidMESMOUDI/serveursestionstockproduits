package com.saidus.serveurgestionstockproduits.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICrudService<T, ID> {

    List<T> getAll();

    void add(T entity);

    void update(T entity);

    void delete(ID id);

    void saveAll(Iterable<T> iterable);
}
