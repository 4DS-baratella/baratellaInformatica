package Aerodromo;

public class Aeromotore extends Aeromobile{
    private double potenza;

    public Aeromotore(String sigla, double potenza) throws Exception{
        super(sigla);
        setPotenza(potenza);
    }

    public double getPotenza() {
        return potenza;
    }

    public void setPotenza(double potenza) throws Exception{
        if(potenza >= 0){
            this.potenza = potenza;
        }else{
            throw new Exception("\nLa potenza non può essere minore di 0.");
        }
    }

    @Override
    public boolean superiore(CMP x) throws Exception{
        boolean flag = false;
        if(x instanceof Aeromotore){ //in questo caso non serve fare il controllo x != null perché con instanceof verifico già che l'oggetto non sia null
            if(this.potenza > ((Aeromotore) x).potenza){
                flag = true;
            }
        }else{
            throw new Exception("\nL'oggetto passato non è di tipo Aeromotore.");
        }
        return flag;
    }

    @Override
    public boolean equals(Object oggetto) {
        boolean verifica = false;
        if(oggetto instanceof Aeromotore){
            Aeromotore aeromotore = (Aeromotore) oggetto;
            if(getPotenza() == aeromotore.getPotenza()){
                verifica = true;
            }
        }
        return verifica;
    }

    @Override
    public String toString(){
        return "Aeromotore[" + super.toString() + ", potenza: " + getPotenza() + "]";
    }
}
