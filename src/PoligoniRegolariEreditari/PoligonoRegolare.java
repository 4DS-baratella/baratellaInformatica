package PoligoniRegolariEreditari;

public class PoligonoRegolare {
    private int nLati;
    private double lato;

    public PoligonoRegolare(int nLati, double lato) throws Exception{
        this.nLati = nLati;
        setLato(lato);
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) throws Exception{
        if(lato > 0){
            this.lato = lato;
        }else{
            throw new Exception("\nLa lunghezza del lato non può essere minore di 0.");
        }
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
                ", lunghezza lato=" + lato +
                "}\n";
    }
}
