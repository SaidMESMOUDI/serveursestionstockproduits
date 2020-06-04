package com.saidus.serveurgestionstockproduits.service;

import com.saidus.serveurgestionstockproduits.entity.Produit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduitMockServiceImpl implements IProduitService {
    private List<Produit> produits;

    public ProduitMockServiceImpl() {
        this.produits = new ArrayList<Produit>();
        this.produits.add(new Produit("Livre", 50, 20.75f));
        this.produits.add(new Produit("Cahier", 200, 8.25f));
        this.produits.add(new Produit("Stylo", 50, 2.10f));
        this.produits.add(new Produit("Crayon", 34, 1.10f));
    }

    @Override
    public List<Produit> getProduits() {
        return this.produits;
    }

    @Override
    public void addProduit(Produit produit) {
        this.produits.add(produit);
    }

    @Override
    public void updateProduit(Produit produit) {
        this.produits.remove(produit);
        this.produits.add(produit);
    }

    @Override
    public void deleteProduit(Long id) {
        Produit produit= new Produit();
        produit.setId(id);
        produits.remove(produit);
    }
}
