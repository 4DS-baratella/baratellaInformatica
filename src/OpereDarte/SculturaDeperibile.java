package OpereDarte;

public class SculturaDeperibile extends Scultura{
    private int eta;
    private double deperibilitaMateriale;

    public SculturaDeperibile(String titolo, String artista, double lunghezza, double larghezza, double profondita, int eta, double deperibilitaMateriale) throws Exception{
        super(titolo, artista, lunghezza, larghezza, profondita);
        controlloEta(eta);
        this.deperibilitaMateriale = deperibilitaMateriale;
    }

    public double ingombro(){

    }

    private void controlloEta(int eta) throws Exception{
        if(eta < 0){
            throw new Exception("\nL'età dell'opera non è valida, deve essere maggiore di 0 anni.");
        }
    }
}
