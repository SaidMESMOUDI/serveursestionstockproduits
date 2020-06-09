package com.saidus.serveurgestionstockproduits.repository;

import com.saidus.serveurgestionstockproduits.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
}
