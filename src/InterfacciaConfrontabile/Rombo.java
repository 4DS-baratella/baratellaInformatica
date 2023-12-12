package InterfacciaConfrontabile;

public class Rombo extends Poligoni{
    private double dMagg, dMin;
    public Rombo(double dMagg, double dMin) throws Exception{
        super(Math.sqrt((Math.pow(dMagg / 2, 2)) + (Math.pow(dMin / 2, 2))), 4);
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

    @Override
    public String toString() {
        return "Rombo[" + super.toString() + ", diagonale maggiore: " + dMagg + ", diagonale minore: " + dMin + "]";
    }
}
