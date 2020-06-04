package com.saidus.serveurgestionstockproduits.repository;

import com.saidus.serveurgestionstockproduits.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduitRepository extends JpaRepository<Produit, Long> {
}
