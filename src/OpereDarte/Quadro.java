package OpereDarte;

public class Quadro extends OperaDarte{
    private double lunghezza, larghezza;

    public Quadro(String titolo, String artista, double lunghezza, double larghezza){
        super(titolo, artista);
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    public double ingombro(){
        return lunghezza * larghezza;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    @Override
    public String toString() {
        return "Quadro[" + super.toString() + ", Dimensioni: " + lunghezza + "cm x " + larghezza + "cm, per un ingombro totale di: " + ingombro() + "cm^2]";
    }
}
