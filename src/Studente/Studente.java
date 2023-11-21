package Studente;

public class Studente extends Persona implements Cloneable{
    private String cognome, nome, codFisc, dataDiNascita;

    public Studente(){
    }

    public Studente(String cognome, String nome, String codFisc, String dataDiNascita){
        this.cognome = cognome;
        this.nome = nome;
        this.codFisc = codFisc;
        this.dataDiNascita = dataDiNascita;
    }

    public Studente(Studente stud){
        this.cognome = stud.cognome;
        this.nome = stud.nome;
        this.codFisc = stud.codFisc;
        this.dataDiNascita = stud.dataDiNascita;
    }

    @Override
    protected Studente clone(){
        Studente tmp = new Studente(cognome, nome, codFisc, dataDiNascita);
        return tmp;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    @Override
    public boolean equals(Object oggetto){
        boolean flag = false;
        if(oggetto instanceof Studente){
            if(nome.equals(((Studente) oggetto).getNome()) && cognome.equals(((Studente) oggetto).getCognome()) && codFisc.equals(((Studente) oggetto).codFisc) && dataDiNascita.equals(((Studente) oggetto).dataDiNascita)){
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public int hashCode(){
        return hashCode();
    }

    @Override
    public String toString() {
        return "Studente{" +
                "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", codFisc='" + codFisc + '\'' +
                ", dataDiNascita='" + dataDiNascita + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Exception{
        finalize();
    }
}
