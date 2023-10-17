package PoligoniRegolariEreditari;

public class Quadrato extends PoligonoRegolare{
    public Quadrato(double lato) {
        super(4, lato);
    }

    public double area(){
        return Math.pow(getLato(), 2);
    }

    public double diagonale(){
        return Math.sqrt((Math.pow(getLato(), 2)) + Math.pow(getLato(), 2));
    }
}