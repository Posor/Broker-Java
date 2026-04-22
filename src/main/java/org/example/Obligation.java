package org.example;

import java.util.Objects;

public class Obligation {
    private double tauxInteret;

    // Constructeur
    public Obligation(double interet){
        this.tauxInteret=interet;
    }

    // Getters and Setters
    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    // Default Methods

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Obligation that = (Obligation) o;
        return Double.compare(tauxInteret, that.tauxInteret) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tauxInteret);
    }

    @Override
    public String toString() {
        return "Obligation{" +
                "tauxInteret=" + tauxInteret +
                '}';
    }
}
