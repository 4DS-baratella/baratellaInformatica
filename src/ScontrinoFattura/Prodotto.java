package ScontrinoFattura;

public class Prodotto {
    private String nome;
    private double prezzo;
    private int tasse; //L'attributo tasse varia in base alle tasse imposte sul prodotto che vende l'azienda

    public Prodotto(String nome, double prezzo, int tasse) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.tasse = tasse;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
