package org.example;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AssuranceVie extends Enveloppe {

    public AssuranceVie(String numero, double soldeEspeces) {
        super(numero, soldeEspeces, 1.0);
    }

    @Override
    public boolean estActifEligible(Actif actif) {
        return true;
    }

    @Override
    public double calculerFiscalite() {
        long anneesDetention = ChronoUnit.YEARS.between(getDateOuverte(), LocalDateTime.now());
        double abattement = 4600.0 * (anneesDetention + 1); // +1 pour compter l'année en cours
        double valeurTaxable = getValeurTotaleBrute() - abattement;
        if (valeurTaxable < 0) {
            return 0.0;
        }
        return valeurTaxable * 0.314;
    }
}