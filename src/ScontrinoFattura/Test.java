package ScontrinoFattura;

public class Test {
    public static void main(String[] args) {
        Prodotto[] prodottiScontrino = {new Prodotto("Pasta", 2.5, 5), new Prodotto("Sugo", 1.5, 5), new Prodotto("Formaggio", 3.0, 5)};

        Azienda aziendaScontrino = new Azienda("Supermercato XYZ", "Via Roma 123", "123456789", "0123456789");

        Scontrino scontrino = new Scontrino(prodottiScontrino, aziendaScontrino, "2024-01-14");

        System.out.println(scontrino.stampa());

        Prodotto[] prodottiFattura = {new Prodotto("TV", 500.0, 18), new Prodotto("Computer", 800.0, 18), new Prodotto("Stampante", 150.0, 18)};

        Azienda aziendaFattura = new Azienda("Elettronica srl", "Via Verdi 456", "987654321", "9876543210");

        Fattura fattura = new Fattura(prodottiFattura, aziendaFattura, "2024-01-15", "Mario Rossi", "Carta");

        System.out.println(fattura.stampa());
    }
}
