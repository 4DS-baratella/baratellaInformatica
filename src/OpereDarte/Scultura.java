package OpereDarte;

public class Scultura extends OperaDarte{
    private double lunghezza, larghezza, profondita;
    private Supporto supporto;

    public Scultura(String titolo, String artista, double lunghezza, double larghezza, double profondita, Supporto supporto){
        super(titolo, artista);
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
        this.supporto = new Supporto(supporto);
    }

    public double ingombro(){
        return (lunghezza * larghezza * profondita) + supporto.ingombro();
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

    public String getDimSupporto(){
        return "Dimensioni supporto: " + supporto.getLunghezza() + "cm x " + supporto.getLarghezza() + "cm x " + supporto.getProfondita() + "cm";
    }

    @Override
    public String toString() {
        return "Scultura[" +
                "\n" + super.toString() +
                "\nDimensioni scultura: " + lunghezza + "cm x " + larghezza + "cm x " + profondita + "cm" +
                "\nDimensioni supporto: " + supporto.getLunghezza() + "cm x " + supporto.getLarghezza() + "cm x " + supporto.getProfondita() + "cm" +
                "\nPer un ingombro totale di: " + ingombro() + "cm^3]";
    }
}
