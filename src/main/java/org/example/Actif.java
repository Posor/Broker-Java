package org.example;

import java.util.Objects;

public abstract class Actif implements Vendable {
    private String ticker;
    private String nom ;
    private double prixCourant;
    private String pays;

    // Constructor
    public Actif(String ticker, String nom, double prixCourant, String pays) {
        this.ticker = ticker;
        this.nom = nom;
        this.prixCourant = prixCourant;
        this.pays = pays;
    }

    // Setters and Getters

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixCourant() {
        return prixCourant;
    }

    public void setPrixCourant(double prixCourant) {
        this.prixCourant = prixCourant;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    // Basic Methods

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actif actif = (Actif) o;
        return Double.compare(prixCourant, actif.prixCourant) == 0 && Objects.equals(ticker, actif.ticker) && Objects.equals(nom, actif.nom) && Objects.equals(pays, actif.pays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticker, nom, prixCourant, pays);
    }

    @Override
    public String toString() {
        return "Actif{" +
                "ticker='" + ticker + '\'' +
                ", nom='" + nom + '\'' +
                ", prixCourant=" + prixCourant +
                ", pays='" + pays + '\'' +
                '}';
    }

    // vendre() method because Actif implements Vendable
    @Override
    public double vendre() {
        return this.prixCourant;
    }

    public void mettreAJourPrix(double nouveauPrix) {
        this.prixCourant = nouveauPrix;
    }
}
