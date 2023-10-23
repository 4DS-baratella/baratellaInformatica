package PoligoniRegolariEreditari;

public class Quadrato extends PoligonoRegolare{
    public Quadrato(double lato) throws Exception {
        super(4, lato);
    }

    public double area(){
        return Math.pow(getLato(), 2);
    }

    public double diagonale(){
        return Math.sqrt((Math.pow(getLato(), 2)) + Math.pow(getLato(), 2));
    }

    @Override
    public String toString() {
        return "\nQuadrato{nLati=" + getnLati() + " , lato=" + getLato() + "}";
    }
}