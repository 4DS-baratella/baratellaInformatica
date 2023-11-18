package OpereDarte;

public class SculturaDeperibile extends Scultura{
    private int eta;
    private double deperibilitaMateriale;

    public SculturaDeperibile(String titolo, String artista, double lunghezza, double larghezza, double profondita, int eta, double deperibilitaMateriale) throws Exception{
        super(titolo, artista, lunghezza, larghezza, profondita);
        controlloEta(eta);
        controlloMateriale(deperibilitaMateriale);
    }

    public double ingombro(){
        double volumePerso = eta * deperibilitaMateriale;
        return super.ingombro() - volumePerso;
    }

    @Override
    public String toString() {
        return "Scultura Deperibile[" +
                "\n" + super.toString() +
                "\nDimensioni scultura: " + super.getLunghezza() + "cm x " + super.getLarghezza() + "cm x " + super.getProfondita() + "cm" +
                "\nDimensioni supporto: " + super.getDimSupporto() +
                "\nPer un ingombro totale di: " + ingombro() + "cm^3]";
    }

    private void controlloEta(int eta) throws Exception{
        if(eta < 0){
            throw new Exception("\nL'età dell'opera non è valida, non può essere negativa.");
        }else{
            this.eta = eta;
        }
    }

    private void controlloMateriale(double deperibilitaMateriale) throws Exception{
        if(deperibilitaMateriale < 0){
            throw new Exception("\nIl materiale nel tempo deve rovinarsi, non può generarne di nuovo.");
        }else{
            this.deperibilitaMateriale = deperibilitaMateriale;
        }
    }
}
