package PoligoniRegolariEreditari;

public class Pentagono extends PoligonoRegolare{
    public Pentagono(double lato, char simbolo) {
        super(5, lato, simbolo);
    }

    public double area(){
        return Math.pow(getLato(), 2) * 1.72; //1.72 = costante d'area del pentagono
    }

    public double diagonale(){
        return (getLato()*(Math.sqrt(5) + 1)) / 2;
    }

    @Override
    public String disegna() {
        return null;
    }

    public double apotema(){
        return getLato() * 0.688; //0.688 = numero fisso del pentagono
    }

    @Override
    public String toString() {
        return "Pentagono{" + super.toString() + "}";
    }
}