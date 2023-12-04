package Figure;

public class Cerchio extends FiguraPiana{
    private double raggio;

    public Cerchio(String colore, double raggio){
        super(colore);
        this.raggio = raggio;
    }

    @Override
    public double calcolaPerimetro(){
        return 2 * 3.14 * raggio;
    }

    @Override
    public double calcolaArea(){
        return 3.14 * Math.pow(raggio, 2);
    }
}
