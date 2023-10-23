package PoligoniRegolariEreditari;

public class Esagono extends PoligonoRegolare{
    public Esagono(double lato) throws Exception{
        super(6, lato);
    }

    public double area(){
        return (Math.pow(getLato(), 2)) * 2.598; //2.598 è la costante d'area dell'esagono
    }

    public double apotema(){
        return getLato() * 0.866; //0.866 è il numero fisso dell'esagono
    }

    @Override
    public String toString() {
        return "\nEsagono{nLati= " + getnLati() + " , lato=" + getLato() + "}";
    }
}