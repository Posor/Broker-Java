package org.example;

import org.example.enums.TypeOrdre;
import org.example.enums.Devise;
import java.util.Objects;
import java.time.LocalDateTime;



public class Ordre {
    private double prixMinMax;
    private Devise devise;
    private double quantite;
    private TypeOrdre type;
    private LocalDateTime date;

    private Actif actif;


    // Constructor

    public Ordre(Actif actif, LocalDateTime date, TypeOrdre type, double quantite, Devise devise, double prixMinMax) {
        this.actif = actif;
        this.date = date;
        this.type = type;
        this.quantite = quantite;
        this.devise = devise;
        this.prixMinMax = prixMinMax;
    }


    // Getters and Setters

    public double getPrixMinMax() {
        return prixMinMax;
    }

    public void setPrixMinMax(double prixMinMax) {
        this.prixMinMax = prixMinMax;
    }

    public Devise getDevise() {
        return devise;
    }

    public void setDevise(Devise devise) {
        this.devise = devise;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public TypeOrdre getType() {
        return type;
    }

    public void setType(TypeOrdre type) {
        this.type = type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Actif getActif() {
        return actif;
    }

    // Basic Methods

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ordre ordre = (Ordre) o;
        return Double.compare(prixMinMax, ordre.prixMinMax) == 0 && Double.compare(quantite, ordre.quantite) == 0 && Objects.equals(devise, ordre.devise) && Objects.equals(type, ordre.type) && Objects.equals(date, ordre.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prixMinMax, devise, quantite, type, date);
    }

    @Override
    public String toString() {
        return "Ordre{" +
                "prixMinMax=" + prixMinMax +
                ", devise=" + devise +
                ", quantite=" + quantite +
                ", type=" + type +
                ", date=" + date +
                '}';
    }
}
