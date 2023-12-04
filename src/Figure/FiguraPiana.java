package Figure;

public abstract class FiguraPiana extends FiguraGeometrica{
    public FiguraPiana(String colore){
        super(colore);
    }

    abstract double calcolaPerimetro();
    abstract double calcolaArea();
}
