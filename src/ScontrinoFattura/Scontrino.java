package ScontrinoFattura;

import CorrezioneVerifica.baratella.Data;

public class Scontrino extends DocumentoFiscale{
    public Scontrino(Prodotto[] prodotti, Azienda azienda, String data) {
        super(prodotti, azienda, data);
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
        String str = "Scontrino:\nData: " + getData() + "\nAzienda: " + azienda.getNome() + "\nProdotti: \n";
        for(int i = 0; i < prodotti.length; i++){
            str += ("- " + prodotti[i].getNome() + ": " + prodotti[i].getPrezzo() + "\n");
        }
        str += "Totale: " + calcoloPrezzo() + "\n";
        return str;
    }
}
