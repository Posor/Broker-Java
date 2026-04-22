package org.example;

import org.example.enums.Devise;
import org.example.enums.TypeOrdre;
import java.time.LocalDateTime;

public class Broker {
    
    public static Client chargerDonneesSimulees() {
        System.out.println("--- Chargement des données du Broker ---");
        
        Adresse adresse = new Adresse("12", "Rue de la Bourse", "Bat A", "75002", "Paris");
        Client client = new Client(1, "Dupont", "Marie", adresse);
        
        Action apple = new Action("AAPL", "Apple Inc.", 150.0, "USA");
        Action total = new Action("TTE", "TotalEnergies", 60.0, "France");
        
        CTO cto = new CTO("CTO-MARIE-001", 10000.0, 0.0);
        PEA pea = new PEA("PEA-MARIE-002", 5000.0); // En supposant que tu as fait la classe PEA
        
        client.ajouterEnveloppe(cto);
        client.ajouterEnveloppe(pea);
        
        try {
            cto.passerUnOrdre(new Ordre(apple, LocalDateTime.now(), TypeOrdre.ACHAT, 10, Devise.USD, 150.0));
            cto.passerUnOrdre(new Ordre(total, LocalDateTime.now(), TypeOrdre.ACHAT, 20, Devise.EUR, 60.0));
        } catch (ActifNonEligibleException | SoldeInsuffisantException e) {
            System.err.println("Erreur lors du passage de l'ordre : " + e.getMessage());
        }
        
        return client;
    }

    public static void afficherBilanClient(Client client) {
        System.out.println("Bilan du client : " + client.getPrenom() + " " + client.getNom());
        
        client.afficherAdresses();
        
        System.out.println("\n Enveloppes du client :");
        for (Enveloppe env : client.getEnveloppes()) {
            System.out.println("\nEnveloppe N° " + env.getNumero() + " (" + env.getClass().getSimpleName() + ")");
            System.out.println("Solde espèces : " + env.getSoldeEspeces() + " €");
            System.out.println("Valeur totale brute : " + env.getValeurTotaleBrute() + " €");
            
            System.out.println("Positions :");
            if (env.getPortefeuille().isEmpty()) {
                System.out.println(" (Aucune position)");
            } else {
                for (Position pos : env.getPortefeuille().values()) {
                    System.out.println("     * " + pos.getQuantite() + "x " + pos.getActif().getNom() + " (Ticker: " + pos.getActif().getTicker() + ")");
                }
            }
            
            System.out.println("  Historiques :");
            env.afficherOrdreEnCours();
        }
    }
}