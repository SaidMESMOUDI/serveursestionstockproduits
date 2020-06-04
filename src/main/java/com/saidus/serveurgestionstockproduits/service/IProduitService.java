package com.saidus.serveurgestionstockproduits.service;

import com.saidus.serveurgestionstockproduits.entity.Produit;

import java.util.List;

public interface IProduitService {

    List<Produit> getProduits();

    void addProduit(Produit produit);

    void updateProduit(Produit produit);

    void deleteProduit(Long id);
}
