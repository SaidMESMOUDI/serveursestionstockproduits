package com.saidus.serveurgestionstockproduits.service;


import com.saidus.serveurgestionstockproduits.entity.Produit;
import com.saidus.serveurgestionstockproduits.repository.IProduitRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ProduitServiceImpl implements IProduitService {

    private IProduitRepository produitRepository;

    public ProduitServiceImpl(IProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public List<Produit> getProduits() {
        return this.produitRepository.findAll();
    }

    @Override
    public void addProduit(Produit produit) {
        this.produitRepository.save(produit);
    }

    @Override
    public void updateProduit(Produit produit) {
        this.produitRepository.save(produit);
    }

    @Override
    public void deleteProduit(Long id) {
        /*
        Produit produit = new Produit();
        produit.setId(id);
        this.produitRepository.delete(produit);
        */
        this.produitRepository.deleteById(id);
    }
}
