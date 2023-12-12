package InterfacciaConfrontabile;

public class Veicoli implements Confrontabile{
    private double velMassima;

    public Veicoli(double velMassima) throws Exception{
        setVelMassima(velMassima);
    }

    public double getVelMassima() {
        return velMassima;
    }

    public void setVelMassima(double velMassima) throws Exception{
        if(velMassima < 0){
            throw new Exception("\nLa velocità massima non può essere minore di 0.");
        }else{
            this.velMassima = velMassima;
        }
    }

    @Override
    public boolean confrontaMaggiore(Confrontabile oggetto) throws Exception{
        if(oggetto == null){
            throw new Exception("\nOggetto null");
        }
        if(oggetto instanceof Veicoli){
            if(getVelMassima() > ((Veicoli) oggetto).getVelMassima()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public boolean confrontaMinore(Confrontabile oggetto) throws Exception{
        if(oggetto == null){
            throw new Exception("\nOggetto null");
        }
        if(oggetto instanceof Veicoli){
            if(getVelMassima() < ((Veicoli) oggetto).getVelMassima()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public boolean confrontaUguale(Confrontabile oggetto) throws Exception{
        if(oggetto == null){
            throw new Exception("\nOggetto null");
        }
        if(oggetto instanceof Veicoli){
            if(getVelMassima() == ((Veicoli) oggetto).getVelMassima()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nVeicoli[velocità massima: " + velMassima + "]";
    }
}
