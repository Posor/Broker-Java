package org.example;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PEA extends Enveloppe {

    public PEA(String numero, double soldeEspeces) {
        super(numero, soldeEspeces, 0.0);
    }

    @Override
    public boolean estActifEligible(Actif actif) {
        return actif.getPays().equals("France");
    }

    @Override
    public double calculerFiscalite() {
        long anneesDetention = ChronoUnit.YEARS.between(getDateOuverte(), LocalDateTime.now());
        double taux;
        if (anneesDetention >= 5) {
            taux = 0.186;
        } else {
            taux = 0.314;
        }
        return getValeurTotaleBrute() * taux;
    }
}