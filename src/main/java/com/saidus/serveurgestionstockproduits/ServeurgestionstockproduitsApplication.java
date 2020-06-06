package com.saidus.serveurgestionstockproduits;

import com.saidus.serveurgestionstockproduits.entity.Produit;
import com.saidus.serveurgestionstockproduits.repository.IProduitRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ServeurgestionstockproduitsApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =
        SpringApplication.run(ServeurgestionstockproduitsApplication.class, args);
        IProduitRepository produitRepository = ctx.getBean(IProduitRepository.class);

/*
        produitRepository.save(new Produit("Livre", 50, 20.75f));
        produitRepository.save(new Produit("Cahier", 200, 8.25f));
        produitRepository.save(new Produit("Stylo", 50, 2.10f));
        produitRepository.save(new Produit("Crayon", 34, 1.10f));
        */
    }

}
