package InterfacciaConfrontabile;

public class Pentagono extends Poligoni{
    public Pentagono(double lato) throws Exception{
        super(lato, 5);
    }

    public double area(){
        return Math.pow(getLato(), 2) * 1.72; //1.72 = costante d'area del pentagono
    }

    @Override
    public String toString() {
        return "Pentagono[" + super.toString() + "]";
    }
}
