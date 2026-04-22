package org.example;

public class Main {
    public static void main(String[] args) {
        Client clientTest = Broker.chargerDonneesSimulees();
        Broker.afficherBilanClient(clientTest);
    }
}