package org.example;
import javax.swing.text.html.HTMLDocument;
import java.time.LocalDateTime;
import java.util.Objects;


public class Transaction {
    private double prixExecution;
    private double montantTotal;
    private LocalDateTime dateExecution;

    // Constructor

    public Transaction(double montantTotal, double prixExecution) {
        this.montantTotal = montantTotal;
        this.prixExecution = prixExecution;
        this.dateExecution = LocalDateTime.now();
    }

    // Setters and Getters

    public double getPrixExecution() {
        return prixExecution;
    }

    public void setPrixExecution(double prixExecution) {
        this.prixExecution = prixExecution;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public LocalDateTime getDateExecution() {
        return dateExecution;
    }

    public void setDateExecution(LocalDateTime dateExecution) {
        this.dateExecution = dateExecution;
    }

    // Basic Methods

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(prixExecution, that.prixExecution) == 0 && Double.compare(montantTotal, that.montantTotal) == 0 && Objects.equals(dateExecution, that.dateExecution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prixExecution, montantTotal, dateExecution);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "prixExecution=" + prixExecution +
                ", montantTotal=" + montantTotal +
                ", dateExecution=" + dateExecution +
                '}';
    }
}
