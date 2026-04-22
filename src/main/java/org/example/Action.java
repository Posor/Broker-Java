package org.example;


public class Action extends Actif {

    // Constructor
    public Action(String ticker, String nom, double prixCourant, String pays) {
        super(ticker, nom, prixCourant, pays);
    }

    @Override
    public String toString() {
        return "Action{" +
                "ticker='" + getTicker() + '\'' +
                ", nom='" + getNom() + '\'' +
                ", prix=" + getPrixCourant() +
                '}';
    }
}