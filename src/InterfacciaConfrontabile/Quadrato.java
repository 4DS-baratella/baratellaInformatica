package InterfacciaConfrontabile;

public class Quadrato extends Poligoni{
    public Quadrato(double lato) throws Exception {
        super(lato, 4);
    }

    public double area(){
        return Math.pow(getLato(), 2);
    }

    public double diagonale(){
        return Math.sqrt((Math.pow(getLato(), 2)) + Math.pow(getLato(), 2));
    }

    @Override
    public String toString() {
        return "Quadrato[" + super.toString() + "]";
    }
}
