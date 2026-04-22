package org.example;

public class CTO extends Enveloppe {

    public CTO(String numero, double soldeEspeces, double fraisDepot) {
        super(numero, soldeEspeces, fraisDepot);
    }

    @Override
    public boolean estActifEligible(Actif actif) {
        return true;
    }

    @Override
    public double calculerFiscalite() {
         return getValeurTotaleBrute() * 0.314;
    }
}