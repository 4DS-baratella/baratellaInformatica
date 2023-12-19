package CorrezioneVerifica.baratella;

public class Persona {
    private String cognome;
    private String nome;
    private Data dataDiNascita;
    protected int numeroIstanze;

    public Persona(){
        numeroIstanze++;
    }

    public Persona(String cognome, String nome, Data dataDiNascita){
        this();
        this.cognome = cognome;
        this.nome = nome;
        this.dataDiNascita = new Data(dataDiNascita);
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public Data getDataDiNascita() {
        return dataDiNascita;
    }

    public boolean verificaOmonimia(Persona persona){
        boolean flag = false;
        if(getCognome().equals(persona.getCognome()) && getNome().equals(persona.getNome())){
            flag = true;
        }
        return flag;
    }

    /*
    public Integer calcolaEta() throws Exception {

    }

     */

    public String info() throws Exception{
        String str = "";
        if(cognome != null && nome != null && dataDiNascita != null){
            str = "\nCognome: " + getCognome() + "\nNome: " + getNome() + "\nData di nascita: " + getDataDiNascita();
        }else{
            throw new Exception("\nUno o più attributi sono null.");
        }
        return str;
    }
}