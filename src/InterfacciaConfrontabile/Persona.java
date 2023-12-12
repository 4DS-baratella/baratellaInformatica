package InterfacciaConfrontabile;

public class Persona implements Confrontabile{
    private int eta;

    public Persona(int eta) throws Exception{
        setEta(eta);
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) throws Exception{
        if(eta < 0){
            throw new Exception("\nL'età non può essere minore di 0");
        }else{
            this.eta = eta;
        }
    }

    @Override
    public boolean confrontaMaggiore(Confrontabile oggetto) throws Exception{
        if(oggetto == null){
            throw new Exception("\nOggetto null");
        }
        if(oggetto instanceof Veicoli){
            if(getEta() > ((Persona) oggetto).getEta()){
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
            if(getEta() < ((Persona) oggetto).getEta()){
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
            if(getEta() == ((Persona) oggetto).getEta()){
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
        return "\nPersona[età: " + eta + "]";
    }
}
