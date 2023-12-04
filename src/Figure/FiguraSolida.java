package Figure;

public abstract class FiguraSolida extends FiguraPiana{
    public FiguraSolida(String colore){
        super(colore);
    }

    abstract double calcolaVolume();
}
