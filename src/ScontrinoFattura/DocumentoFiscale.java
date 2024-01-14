package ScontrinoFattura;

public abstract class DocumentoFiscale implements IProdotti{
    protected Prodotto[] prodotti;
    protected Azienda azienda;
    protected String data;

    public DocumentoFiscale(Prodotto[] prodotti, Azienda azienda, String data) {
        this.prodotti = prodotti;
        this.azienda = azienda;
        this.data = data;
    }

    public Prodotto[] getProdotti() {
        return prodotti;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public String getData() {
        return data;
    }

    public abstract int conteggioProdotti();

    public abstract double calcoloPrezzo();

    public abstract String stampa();
}
