package com.saidus.serveurgestionstockproduits.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ref;
    private int quantite;
    private float prixUnitaire;

    public Produit() {
    }

    public Produit(String ref, int quantite, float prixUnitaire) {
        super();
        this.ref = ref;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", ref='" + ref + '\'' +
                ", quantite=" + quantite +
                ", prixUnitaire=" + prixUnitaire +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produit produit = (Produit) o;

        return id.equals(produit.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
