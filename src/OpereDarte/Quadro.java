package OpereDarte;

public class Quadro extends OperaDarte{
    private double lunghezza, larghezza;

    public Quadro(OperaDarte opera, double lunghezza, double larghezza){
        super(opera.titolo, opera.artista);
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
}
