package PoligoniRegolariEreditari;

public class Quadrato extends PoligonoRegolare{
    public Quadrato(double lato, char simbolo) {
        super(4, lato, simbolo);
    }

    public double area(){
        return Math.pow(getLato(), 2);
    }

    public double diagonale(){
        return Math.sqrt((Math.pow(getLato(), 2)) + Math.pow(getLato(), 2));
    }

    public String disegna() {
        String result = "";
        for (int riga = 1; riga <= getLato(); riga++) {
            for (int colonna = 1; colonna <= getLato(); colonna++) {
                if (riga == 1 || riga == getLato() || colonna == 1 || colonna == getLato()) {
                    result += getSimbolo();
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Quadrato{" + super.toString() + "}";
    }
}