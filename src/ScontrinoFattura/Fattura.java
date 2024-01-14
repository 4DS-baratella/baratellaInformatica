package ScontrinoFattura;

public class Fattura extends DocumentoFiscale{
    private String condizionePagamento;
    private String persona;

    public Fattura(Prodotto[] prodotti, Azienda azienda, String data, String persona, String condizionePagamento) {
        super(prodotti, azienda, data);
        this.persona = persona;
        this.condizionePagamento = condizionePagamento;
    }

    public String getCondizionePagamento() {
        return condizionePagamento;
    }

    public String getPersona() {
        return persona;
    }

    @Override
    public int conteggioProdotti() {
        return prodotti.length;
    }

    @Override
    public double calcoloPrezzo() {
        double totale = 0;
        for (Prodotto prodotto : prodotti) {
            totale += prodotto.getPrezzo();
        }
        return totale;
    }

    @Override
    public String stampa() {
        String str = "Fattura:\nData: " + getData() + "\nAzienda: " + azienda.getNome() + "\nPersona: " + getPersona() + "\nCondizione di pagamento: " + getCondizionePagamento() + "\nProdotti: \n";
        for(int i = 0; i < prodotti.length; i++){
            str += ("- " + prodotti[i].getNome() + ": " + prodotti[i].getPrezzo() + "\n");
        }
        str += "Totale: " + calcoloPrezzo() + "\n";
        return str;
    }
}
