package ScontrinoFattura;

public class Azienda {
    private String nome;
    private String indirizzo;
    private String partitaIVA;
    private String numTelefono;

    public Azienda(String nome, String indirizzo, String partitaIVA, String numTelefono) {
        setNome(nome);
        setIndirizzo(indirizzo);
        this.partitaIVA = partitaIVA;
        setNumTelefono(numTelefono);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
}
