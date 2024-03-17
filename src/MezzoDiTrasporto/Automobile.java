package MezzoDiTrasporto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Automobile extends MezzoDiTrasporto{
    ArrayList<Persona> passeggeri;

    Automobile(){
        numIstanze++;
    }

    Automobile(int cavalli, String marca) throws Exception{
        super(cavalli, marca);
        passeggeri = new ArrayList<Persona>(4);
    }

    public ArrayList<Persona> getPassegeri() {
        return passeggeri;
    }

    public void setPassegeri(ArrayList<Persona> passegeri) {
        this.passeggeri = passegeri;
    }

    public void aggiungiPasseggero(Persona passeggero) throws Exception{
        if(passeggeri.size() < 4){
            passeggeri.add(passeggero);
        }else{
            throw new Exception("\nMacchina piena.");
        }
    }

    public void rimuoviUltimoPasseggero(){
        passeggeri.remove(3);
    }

    public void rimuoviPasseggero(Persona passeggero) throws Exception{
        passeggeri.remove(passeggero);
    }

    public void ordinaPasseggeriCrescente(){
        Collections.sort(passeggeri, new Comparator<Persona>(){
            @Override
            public int compare(Persona p1, Persona p2){
                return Integer.compare(p1.getEta(), p2.getEta());
            }
        });
    }

    public void ordinaPasseggeriDecrescente() {
        Collections.sort(passeggeri, new Comparator<Persona>(){
            @Override
            public int compare(Persona p1, Persona p2){
                return Integer.compare(p2.getEta(), p1.getEta());
            }
        });
    }

    @Override
    public String toString(){
        try{
            return super.info() + "[Passeggeri automobile: " + passeggeri + "]";
        }catch (Exception e){
            return "C'è un errore nei dati forniti";
        }
    }
}
