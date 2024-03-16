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

    }

    public void rimuoviPasseggero(Persona passeggero) throws Exception{
        if(passeggeri.remove(passeggero)){
            throw new Exception("\nPasseggero rimosso con successo.");
        }else{
            throw new Exception("\nPasseggero non trovato.");
        }
    }

    public void ordinaPasseggeriCrescente(){
        Collections.sort
    }

    public void ordinaPasseggeriDecrescente(){

    }

    @Override
    public String toString() {
        return "[Passeggeri automobile: " + passeggeri + "]";
    }
}
