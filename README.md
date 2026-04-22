# Java Financial Broker

## À propos du projet

Ce projet a été réalisé dans le cadre du module de Java durant le semestre 8 à Télécom Saint-Étienne. Ce projet est une modélisation d'un système de courtage financier développé en Java. Il simule la gestion de différents comptes d'investissement (PEA, CTO, Assurance Vie) et permet la manipulation d'actifs financiers (Actions, Obligations, ETF) en appliquant des règles métier.

L'objectif principal de ce développement était de mettre en pratique des concepts d'ingénierie logicielle et de conception orientée objet.

## Fonctionnalités Principales

- **Gestion des Enveloppes Fiscales :** Hiérarchie de comptes (PEA, CTO, Assurance Vie) avec implémentation de contraintes d'éligibilité spécifiques à chaque type.
- **Moteur de Transactions :** Traitement des ordres d'achat et de vente, incluant la vérification des soldes disponibles et le calcul des valorisations des portefeuilles.
- **Catalogue d'Actifs Diversifié :** Prise en charge d'instruments (Actions, Obligations, ETF) modélisés avec précision (devise, type de réplication, type de distribution).
- **Robustesse & Sécurité :** Implémentation d'exceptions métier personnalisées (ex: `SoldeInsuffisantException`, `ActifNonEligibleException`) pour garantir l'intégrité des opérations financières.

## Architecture et Concepts Techniques

- **Polymorphisme et Héritage :** Utilisation de classes abstraites (`Enveloppe`, `Actif`) et d'interfaces pour définir des comportements communs tout en respectant le principe de ségrégation.
- **Collections Optimisées :** Utilisation de `Map<String, Position>` au sein des portefeuilles pour garantir un accès en `O(1)` aux différentes lignes d'investissement.
- **Qualité du Code :** Respect des principes d'encapsulation, création de POJO propres, et validation des données via le principe du "Fail-Fast".
- **Tests Unitaires :** Validation de la logique métier (calculs, déclenchement d'exceptions) à l'aide de tests automatisés avec **JUnit 5**. `(Se lançant avec "mvn test")`

---

*Projet réalisé par Paulin Gasquet*