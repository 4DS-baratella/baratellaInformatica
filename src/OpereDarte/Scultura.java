package OpereDarte;

public class Scultura extends OperaDarte{
    private double lunghezza, larghezza, profondita;

    public Scultura(String titolo, String artista, double lunghezza, double larghezza, double profondita){
        super(titolo, artista);
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

    @Override
    public String toString() {
        return "Scultura[" + super.toString() + ", Dimensioni: " + lunghezza + "cm x " + larghezza + "cm x " + profondita + "cm, per un ingombro totale di: " + ingombro() + "cm^3]";
    }
}
