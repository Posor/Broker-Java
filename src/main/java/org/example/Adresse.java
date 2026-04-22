package org.example;

import java.util.Objects;

public class Adresse {
    private String numeroRue;
    private String rue;
    private String complement;
    private String codePostal;
    private String pays;

    // Constructor

    public Adresse(String numeroRue, String rue, String complement, String codePostal, String pays) {
        this.numeroRue = numeroRue;
        this.rue = rue;
        this.complement = complement;
        this.codePostal = codePostal;
        this.pays = pays;
    }

    // Setters and Getters

    public String getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(String numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
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
        Adresse adresse = (Adresse) o;
        return Objects.equals(numeroRue, adresse.numeroRue) && Objects.equals(rue, adresse.rue) && Objects.equals(complement, adresse.complement) && Objects.equals(codePostal, adresse.codePostal) && Objects.equals(pays, adresse.pays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroRue, rue, complement, codePostal, pays);
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numeroRue='" + numeroRue + '\'' +
                ", rue='" + rue + '\'' +
                ", complement='" + complement + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}
