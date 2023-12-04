package Figure;

public abstract class FiguraSolida extends FiguraGeometrica{
    public FiguraSolida(String colore){
        super(colore);
    }

    abstract double calcolaVolume();
}
