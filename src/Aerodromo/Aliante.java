package Aerodromo;

import java.util.Objects;

public class Aliante extends Aeromobile{
    private int effAerodinamica;

    public Aliante(String sigla, int effAerodinamica) throws Exception{
        super(sigla);
        setEffAerodinamica(effAerodinamica);
    }

    public int getEffAerodinamica() {
        return effAerodinamica;
    }

    public void setEffAerodinamica(int effAerodinamica) throws Exception{
        if(effAerodinamica > 0){
            this.effAerodinamica = effAerodinamica;
        }else{
            throw new Exception("\nL'efficienza aerodinamica non può essere minore di 1.");
        }
    }

    @Override
    public boolean confrontaMaggiore(CMP x) throws Exception{
        boolean flag = false;
        if(x instanceof Aliante){ //in questo caso non serve fare il controllo x != null perché con instanceof verifico già che l'oggetto non sia null
            if(this.effAerodinamica > ((Aliante) x).effAerodinamica){
                flag = true;
            }
        }else{
            throw new Exception("\nL'oggetto passato non è di tipo Aliante.");
        }
        return flag;
    }

    @Override
    public boolean equals(Object oggetto) {
        boolean verifica = false;
        if(oggetto instanceof Aliante){
            Aliante aliante = (Aliante) oggetto;
            if(getEffAerodinamica() == aliante.effAerodinamica){
                verifica = true;
            }
        }
        return verifica;
    }

    @Override
    public String toString(){
        return "Aliante[" + super.toString() + ", efficienza aerodinamica: " + getEffAerodinamica() + "]";
    }
}
