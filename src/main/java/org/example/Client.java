package org.example;

import java.util.*;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private Adresse adresse;

    private final List<Enveloppe> enveloppes = new ArrayList<>();
    private Set<Adresse> adresses = new HashSet<>();

    // Constructor

    public Client(int id, String nom, String prenom, Adresse adresseInitiale) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresses.add(adresseInitiale);
    }

    // Setters end Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public List<Enveloppe> getEnveloppes() {
        return enveloppes;
    }

    public Set<Adresse> getAdresses() {
        return adresses;
    }

    public void setAdresses(Set<Adresse> adresses) {
        this.adresses = adresses;
    }

    // Basic Methods

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(nom, client.nom) && Objects.equals(prenom, client.prenom) && Objects.equals(adresse, client.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, adresse);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +
                '}';
    }

    // Class Method
    public void afficherAdresses() {
        System.out.println("Adresses de " + prenom + " " + nom + " :");
        for (Adresse a : adresses) {
            System.out.println(" - " + a);
        }
    }

    public void ajouterEnveloppe(Enveloppe e) {
        this.enveloppes.add(e);
    }
}


