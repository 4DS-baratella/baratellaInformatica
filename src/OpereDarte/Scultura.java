package OpereDarte;

public class Scultura extends OperaDarte{
    private double lunghezza, larghezza, profondita;

    public Scultura(OperaDarte opera, double lunghezza, double larghezza, double profondita){
        super(opera.titolo, opera.artista);
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }

    public double ingombro(){
        return lunghezza * larghezza * profondita;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getProfondita() {
        return profondita;
    }
}
