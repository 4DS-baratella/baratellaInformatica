package Studente;

public class Studente extends Persona implements Cloneable{

    private String dataDiNascita;
    private int numIstanze;

    public Studente(){
    }

    public Studente(String cognome, String nome, String codFisc, String dataDiNascita) throws Exception{
        super(cognome, nome, codFisc);
        controlloData(dataDiNascita);
        this.dataDiNascita = dataDiNascita;
        numIstanze++;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }



    @Override
    protected Studente clone(){
        numIstanze++;
        try{
            return (Studente) super.clone();
        }catch (CloneNotSupportedException e){
            throw new InternalError(e);
        }
    }

    @Override
    public boolean equals(Object oggetto){
        boolean flag = false;
        if(oggetto instanceof Studente){
            if(getNome().equals(((Studente) oggetto).getNome()) && getCognome().equals(((Studente) oggetto).getCognome()) && getCodFisc().equals(((Studente) oggetto).getCodFisc()) && dataDiNascita.equals(((Studente) oggetto).dataDiNascita)){
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public int hashCode() {
        int result = getCognome().hashCode();
        result = 31 * result + getNome().hashCode(); //Moltiplico per 31 per distribuire i valori su un intervallo più ampio, riducento la probabilità di collisione
        result = 31 * result + getCodFisc().hashCode();
        result = 31 * result + dataDiNascita.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "[" + super.toString() + ", Data di nascita: " + dataDiNascita + "]";
    }

    @Override
    protected void finalize() throws Throwable {
        try{
            //Pulizia del codice, come la chiusura di un file o il rilascio di una risorsa.
            System.out.println("Finalizing Studente object: " + this.toString());
            numIstanze--;
        }catch(Throwable throwable){ //Throwable è la superclasse della classe "Exception" e serve per catturare tutte le eccezioni e gli errori che potrebbero verificarsi
            throw new Exception("\nErrore nel metodo finalize.");
        }finally{
            //Richiamare il metodo finalize della superclasse
            super.finalize();
        }
    }

    private void controlloData(String data) throws Exception{
        try{
            if(data == null){
                throw new NullPointerException("L'attributo non può essere di tipo null.");
            }
            if(data.matches("")){
                throw new Exception("L'attributo non può essere vuoto.");
            }

            String[] tmp = data.split("/");

            int mese = Integer.parseInt(tmp[1]);
            int giorno = Integer.parseInt(tmp[0]);

            if(controlloBisestile(tmp[2])){
                if(mese == 2){
                    if(giorno <= 0 || giorno >= 30){
                        throw new Exception("Data non valida.");
                    }
                }else if(mese == 1 || mese == 3 || mese == 5 || mese == 7 || mese == 8 || mese == 10 || mese == 12){
                    if(giorno <= 0 || giorno >= 32){
                        throw new Exception("Data non valida.");
                    }
                }else if(mese == 4 || mese == 6 || mese == 9 || mese == 11){
                    if(giorno <= 0 || giorno >= 31){
                        throw new Exception("Data non valida.");
                    }
                }else{
                    throw new Exception("Data non valida.");
                }
            }else {
                if (mese == 2) {
                    if (giorno <= 0 || giorno >= 29) {
                        throw new Exception("Data non valida.");
                    }
                } else if (mese == 1 || mese == 3 || mese == 5 || mese == 7 || mese == 8 || mese == 10 || mese == 12) {
                    if (giorno <= 0 || giorno >= 32) {
                        throw new Exception("Data non valida.");
                    }
                } else if (mese == 4 || mese == 6 || mese == 9 || mese == 11) {
                    if (giorno <= 0 || giorno >= 31) {
                        throw new Exception("Data non valida.");
                    }
                }
            }
        }catch (NullPointerException e){
            throw new NullPointerException(e.getMessage());
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    private boolean controlloBisestile(String aa){
        int anno = Integer.parseInt(aa);
        boolean flagAnno = false;
        if(anno % 4 == 0){
            flagAnno = true;
        }
        return flagAnno;
    }
}
