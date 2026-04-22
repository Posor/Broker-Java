package org.example;

import org.example.enums.TypeDistribution;
import org.example.enums.TypeReplication;

import java.util.Objects;

public class ETF {
    private double tailleFondsM;
    private double pourcentageFrais;
    private TypeDistribution typeDistribution;
    private TypeReplication typeReplication;

    // Constructeur
    public ETF(double taille, double frais, TypeDistribution dist, TypeReplication repli) {
        this.tailleFondsM = taille;
        this.pourcentageFrais = frais;
        this.typeDistribution = dist;
        this.typeReplication = repli;
    }

    // Getters and Setters
    public TypeDistribution getTypeDistribution() {
        return typeDistribution;
    }

    public void setTypeDistribution(TypeDistribution typeDistribution) {
        this.typeDistribution = typeDistribution;
    }

    public double getTailleFondsM() {
        return tailleFondsM;
    }

    public void setTailleFondsM(double tailleFondsM) {
        this.tailleFondsM = tailleFondsM;
    }

    public TypeReplication getTypeReplication() {
        return typeReplication;
    }

    public void setTypeReplication(TypeReplication typeReplication) {
        this.typeReplication = typeReplication;
    }

    public double getPourcentageFrais() {
        return pourcentageFrais;
    }

    public void setPourcentageFrais(double pourcentageFrais) {
        this.pourcentageFrais = pourcentageFrais;
    }

    // Default Methods


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ETF etf = (ETF) o;
        return Double.compare(tailleFondsM, etf.tailleFondsM) == 0 && Double.compare(pourcentageFrais, etf.pourcentageFrais) == 0 && typeDistribution == etf.typeDistribution && typeReplication == etf.typeReplication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tailleFondsM, pourcentageFrais, typeDistribution, typeReplication);
    }

    @Override
    public String toString() {
        return "ETF{" +
                "tailleFondsM=" + tailleFondsM +
                ", pourcentageFrais=" + pourcentageFrais +
                ", typeDistribution=" + typeDistribution +
                ", typeReplication=" + typeReplication +
                '}';
    }
}
