package PoligoniRegolariEreditari;

public class Rombo extends PoligonoRegolare{
    private double dMagg, dMin;
    public Rombo(double dMagg, double dMin) {
        super(4, Math.sqrt((Math.pow(dMagg / 2, 2)) + (Math.pow(dMin / 2, 2))));
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
        return "Rombo{" +
                "dMagg=" + dMagg +
                ", dMin=" + dMin +
                '}';
    }
}