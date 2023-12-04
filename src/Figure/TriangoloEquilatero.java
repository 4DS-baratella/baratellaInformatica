package Figure;

public class TriangoloEquilatero extends FiguraPiana implements PoligonoRegolare{
    private double lato;

    public TriangoloEquilatero(String colore, double lato){
        super(colore);
        this.lato = lato;
    }

    @Override
    public double calcolaPerimetro(){
        return numFissoTriangolo * lato;
    }

    @Override
    public double calcolaArea(){
        return Math.round((Math.sqrt(3) / 4) * Math.pow(lato, 2) * 100.0) / 100.0;
    }

    @Override
    public double calcolaApotema() {
        return Math.round(lato * Math.sqrt(3) / 2 * 100.0) / 100.0;
    }

    public double calcolaAltezza(){
        return calcolaApotema();
    }
}