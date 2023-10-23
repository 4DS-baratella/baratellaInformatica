package PoligoniRegolariEreditari;

public class Pentagono extends PoligonoRegolare{
    public Pentagono(double lato) throws Exception {
        super(5, lato);
    }

    public double area(){
        return Math.pow(getLato(), 2) * 1.72; //1.72 = costante d'area del pentagono
    }

    public double diagonale(){
        return (getLato()*(Math.sqrt(5) + 1)) / 2;
    }

    public double apotema(){
        return getLato() * 0.688; //0.688 = numero fisso del pentagono
    }

    @Override
    public String toString() {
        return "\nPentagono{nlati=" + getnLati() + " , lato=" + getLato() + "}";
    }
}