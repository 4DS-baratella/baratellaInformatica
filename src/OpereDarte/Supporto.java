package OpereDarte;

public class Supporto {
    private double lunghezza, larghezza, profondita;

    public Supporto(int lunghezza, int larghezza, int profondita) throws Exception{
        checkDim(lunghezza);
        checkDim(larghezza);
        checkDim(profondita);
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }

    public Supporto(Supporto supp){
        this.lunghezza = supp.getLunghezza();
        this.larghezza = supp.getLarghezza();
        this.profondita = supp.getProfondita();
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
        return "\nDimensioni supporto[lunghezza: " + this.lunghezza + " | larghezza: " + this.larghezza + " | profondità: " + this.profondita;
    }

    private void checkDim(int dim) throws Exception{
        if(dim < 1){
            throw new Exception("\nUna delle dimensioni del supporto non può essere minore minore di 1.");
        }
    }
}
