package PoligoniRegolariEreditari;

public class Rombo extends PoligonoRegolare{
    private double dMagg, dMin;
    public Rombo(double dMagg, double dMin, char simbolo) {
        super(4, Math.sqrt((Math.pow(dMagg / 2, 2)) + (Math.pow(dMin / 2, 2))), simbolo);
        this.dMagg = dMagg;
        this.dMin = dMin;

    }

    private double calcoloLato(){
        return Math.sqrt((Math.pow(dMagg / 2, 2)) + (Math.pow(dMin / 2, 2)));
    }

    public double getdMagg() {
        return dMagg;
    }

    public double getdMin() {
        return dMin;
    }

    public double area(){
        return (dMagg * dMin) / 2;
    }

    public double diagonale(){
        return (area() * 2) / dMin;
    }

    public String disegna(){
        String result = "";
        for(int i = 0; i < dMagg; i++){
            for(int j = 0; j < dMagg - i; j++){
                result += " ";
            }
            for(int j = 0; j <= i; j++){
                result = result + getSimbolo() + " ";
            }
            result += "\n";
        }

        for(int i = (int)dMagg - 2; i >= 0; i--){
            for(int j = 0; j < dMagg - i; j++){
                result += " ";
            }
            for(int j = 0; j <= i; j++){
                result = result + getSimbolo() + " ";
            }
            result += "\n";
        }
        return result;
    }

    @Override
    public String toString() {
        return "Rombo{" + super.toString() + ", diagonale maggiore: " + dMagg + ", diagonale minore: " + dMin + "}";
    }
}