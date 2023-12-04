package Figure;

public class Sfera extends FiguraSolida{
    private double raggio;

    public Sfera(String colore, double raggio){
        super(colore);
        this.raggio = raggio;
    }

    @Override
    public double calcolaVolume(){
        return Math.round((4.0 / 3.0) * 3.14 * Math.pow(raggio, 3) * 100.0) / 100.0;
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
