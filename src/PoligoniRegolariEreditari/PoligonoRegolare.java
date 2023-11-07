package PoligoniRegolariEreditari;

public abstract class PoligonoRegolare {
    private int nLati;
    private double lato;

    private char simbolo;

    public PoligonoRegolare(int nLati, double lato, char carattere) {
        this.nLati = nLati;
        this.lato = lato;
        this.simbolo = carattere;
    }

    public double getLato() {
        return lato;
    }

    public char getSimbolo(){
        return simbolo;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public int getnLati(){
        return nLati;
    }

    public double perimetro(){
        return lato * nLati;
    }

    public abstract double area();

    public abstract double diagonale();

    public abstract String disegna();

    @Override
    public String toString() {
        return "Numero lati: " + nLati + ", lato: " + lato;
    }
}
