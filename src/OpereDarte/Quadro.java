package OpereDarte;

public class Quadro extends OperaDarte{
    private double lunghezza, larghezza;
    private Cornice cornice;

    public Quadro(String titolo, String artista, double lunghezza, double larghezza, Cornice cornice){
        super(titolo, artista);
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.cornice = new Cornice(cornice);
    }

    public double ingombro(){
        return (lunghezza * larghezza) + cornice.ingombro();
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    @Override
    public String toString() {
        return "\nQuadro[" + super.toString() +
                ", Dimensioni quadro: " + lunghezza + "cm x " + larghezza + "cm" +
                ", Dimensioni cornice: " + cornice.getLunghezza() + "cm x " + cornice.getLarghezza() + "cm x " + cornice.getProfondita() + "cm" +
                ", Per un ingombro totale di: " + ingombro() + "cm^2]";
    }
}
