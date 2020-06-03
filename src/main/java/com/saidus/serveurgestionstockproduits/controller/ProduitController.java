package com.saidus.serveurgestionstockproduits.controller;

import com.saidus.serveurgestionstockproduits.entities.Produit;
import com.saidus.serveurgestionstockproduits.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin
public class ProduitController {
    @Autowired
    private IProduitService produitService;

    @GetMapping
    public List<Produit> getProduits() {
        return produitService.getProduits();
    }

    @PostMapping
    public void addProduit(@RequestBody Produit produit){
        produitService.addProduit(produit);
    }

    @PutMapping
    public void updateProduit(@RequestBody Produit produit){
        produitService.updateProduit(produit);
    }

    @DeleteMapping("/{ref}")
    public void deleteProduit(@PathVariable("ref") String ref){
        produitService.deleteProduit(ref);
    }
}
