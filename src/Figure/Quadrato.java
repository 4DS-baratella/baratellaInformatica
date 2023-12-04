package Figure;

public class Quadrato extends FiguraPiana implements PoligonoRegolare{
    private double lato;

    public Quadrato(String colore, double lato){
        super(colore);
        this.lato = lato;
    }

    @Override
    public double calcolaPerimetro(){
        return numFissoQuadrato * lato;
    }

    @Override
    public double calcolaArea(){
        return Math.pow(lato, 2);
    }

    @Override
    public double calcolaApotema(){
        return lato / 2;
    }

    public double calcolaDiagonale(){
        return Math.round(Math.sqrt(2) * lato * 100.0) / 100.0;
    }
}
