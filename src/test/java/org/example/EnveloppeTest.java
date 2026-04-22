package org.example;

import org.example.enums.TypeOrdre;
import org.example.enums.Devise;
import org.example.CTO;
import org.example.Action;
import org.example.Ordre;
import org.example.SoldeInsuffisantException;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class EnveloppeTest {

    @Test
    void testAchatSoldeInsuffisant() {
        // 1. Préparation (On utilise CTO au lieu de CompteTitres et Action au lieu d'Actif)
        CTO cto = new CTO("CTO-001", 10.0, 0.0);
        Action apple = new Action("Apple Inc.", "AAPL", 150.0, "USA"); // Utilisation d'Action car Actif est abstrait
        
        Ordre grosOrdre = new Ordre(apple, LocalDateTime.now(), TypeOrdre.ACHAT, 10, Devise.USD, 150.0);

        // 2. Action & Vérification
        assertThrows(SoldeInsuffisantException.class, () -> {
            cto.passerUnOrdre(grosOrdre);
        });
    }
}