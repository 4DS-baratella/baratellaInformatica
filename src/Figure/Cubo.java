package Figure;

public class Cubo extends FiguraSolida{
    private double lato;

    public Cubo(String colore, double lato){
        super(colore);
        this.lato = lato;
    }

    @Override
    public double calcolaVolume(){
        return Math.pow(lato, 3);
    }

    @Override
    public double calcolaPerimetro(){
        return 0;
    }

    @Override
    public double calcolaArea(){
        return 0;
    }
}
