package CorrezioneVerifica.baratella;

import java.util.Arrays;

public class Studente extends Persona{
    private String SCUOLA;
    private Integer classe;
    private boolean isRipetente;
    private float[] voti;


    public Studente(){
    }

    public Studente(Integer classe, boolean isRipetente, String cognome, String nome, Data dataDiNascita) throws Exception{
        super(cognome, nome, dataDiNascita);
        SCUOLA = "I.T.T. Buonarroti";
        setClasse(classe);
        this.isRipetente = isRipetente;
        voti = new float[0];
    }

    public String getSCUOLA() {
        return SCUOLA;
    }

    //Non è presente il metdo getSCUOLA() perché la scuola è sempre I.T.T. Buonarroti e non ha senso dare la possibilità di cambiarla

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) throws Exception{
        if(classe < 1 || classe > 5){
            throw new Exception("\nLa classe deve essere un numero compreso tra 1 e 5.");
        }
        this.classe = classe;
    }

    public boolean isRipetente() {
        return isRipetente;
    }

    public void setRipetente(boolean ripetente) {
        isRipetente = ripetente;
    }

    public float[] getVoti() {
        return voti;
    }

    public void setVoti(float[] voti) {
        this.voti = voti;
    }

    public boolean verificaOmonimia(Studente studente){
        boolean flag = false;
        if(getCognome().equals(studente.getCognome()) && getNome().equals(studente.getNome())){
            flag = true;
        }
        return flag;
    }

    public void aggiungiVoto(float voto){
        float[] tmp = new float[voti.length + 1];
        for(int i = 0; i < voti.length; i++){
            tmp[i] = voti[i];
        }
        tmp[tmp.length - 1] = voto;
        voti = tmp;
    }

    public void rimuoviVoto(Integer posizione){
        float[] tmp = new float[voti.length - 1];
        for(int i = posizione; i < voti.length; i++){
            voti[i - 1] = voti[i];
        }
        for(int i = 0; i < voti.length - 1; i++){
            tmp[i] = voti[i];
        }
        voti = tmp;
    }

    public boolean promuovi(){
        boolean flag;
        if(classe++ > 5){
            flag = false;
        }else{
            classe++;
            flag = true;
        }
        return flag;
    }

    public boolean promuovi(Integer numeroClassi){
        boolean flag;
        if(classe + numeroClassi > 5){
            flag = false;
        }else{
            classe += numeroClassi;
            flag = true;
        }
        return flag;
    }

    @Override
    public String info() throws Exception{
        String str = "";
        if(voti.length > 0){
            str = "\nScuola: " + getSCUOLA() + "\nClasse: " + getClasse() + super.info() + "\nRipetente: " + (isRipetente? "si" : "no") + "\nVoti: " + Arrays.toString(voti);
        }else {
            str = "\nScuola: " + getSCUOLA() + "\nClasse: " + getClasse() + super.info() + "\nRipetente: " + (isRipetente? "si" : "no") + "\nVoti: nessun voto presente";
        }
        return str;
    }
}