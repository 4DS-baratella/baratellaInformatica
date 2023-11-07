package PoligoniRegolariEreditari;

public class PoligonoRegolare {
    private int nLati;
    private double lato;

    public PoligonoRegolare(int nLati, double lato) {
        this.nLati = nLati;
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public int getnLati() {
        return nLati;
    }

    public double perimetro(){
        return lato*nLati;
    }

    @Override
    public String toString() {
        return "PoligonoRegolare{" +
                "nLati=" + nLati +
                ", lato=" + lato +
                '}';
    }
}
