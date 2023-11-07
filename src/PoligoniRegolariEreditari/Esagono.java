package PoligoniRegolariEreditari;

public class Esagono extends PoligonoRegolare{

    public Esagono(double lato, char simbolo) {
        super(6, lato, simbolo);
    }

    public double area() {
        return (3 * Math.sqrt(3) * Math.pow(getLato(), 2)) / 2;
    }

    public double diagonale() {
        return 2 * getLato();
    }

    public String disegna() {
        return null;
    }

    public double apotema() {
        return getLato() * Math.sqrt(3);
    }

    @Override
    public String toString() {
        return "Esagono{" + super.toString() + "}";
    }
}