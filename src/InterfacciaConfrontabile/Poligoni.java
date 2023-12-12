package InterfacciaConfrontabile;

import Figure.PoligonoRegolare;

public abstract class Poligoni implements Confrontabile{
    private double lato;
    private int nLati;

    public Poligoni(double lato, int nLati) throws Exception{
        setLato(lato);
        setnLati(nLati);
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) throws Exception{
        if(lato < 1){
            throw new Exception("\nLa lunghezza del lato non può essere minore di 1.");
        }else{
            this.lato = lato;
        }
    }

    public int getnLati() {
        return nLati;
    }

    public void setnLati(int nLati) throws Exception{
        if(lato < 2){
            throw new Exception("\nIl numero di lati non può essere minore di 2.");
        }else{
            this.nLati = nLati;
        }
    }

    @Override
    public boolean confrontaMaggiore(Confrontabile oggetto) throws Exception{
        if(oggetto == null){
            throw new Exception("\nOggetto null");
        }
        if(oggetto instanceof Poligoni){
            if(area() > ((Poligoni)oggetto).area()){
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
        if(oggetto instanceof Poligoni){
            if(area() < ((Poligoni)oggetto).area()){
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
        if(oggetto instanceof Poligoni){
            if(area() == ((Poligoni)oggetto).area()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public abstract double area();

    public double calcolaPerimetro(){
        return lato * nLati;
    }

    @Override
    public String toString() {
        return "\nlato: " + lato + ", numero lati: " + nLati;
    }
}
