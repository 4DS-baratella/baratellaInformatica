package CorrezioneVerifica.baratella;

import java.util.Objects;

public class StudenteObj extends Studente{
    protected int numIstanze;

    public StudenteObj(){
    }

    public StudenteObj(Integer classe, boolean isRipetente, String cognome, String nome, Data dataDiNascita) throws Exception {
        super(classe, isRipetente, cognome, nome, dataDiNascita);
        this.numIstanze++;
    }

    @Override
    protected StudenteObj clone(){
        StudenteObj studenteObj = (StudenteObj) clone();
        this.numIstanze++;
        return studenteObj;
    }

    @Override
    public boolean equals(Object oggetto){
        boolean flag = false;
        if(oggetto instanceof StudenteObj){
            if(getCognome().equals(((StudenteObj) oggetto).getCognome()) && Objects.equals(getNome(), ((StudenteObj) oggetto).getNome()) && Objects.equals(getDataDiNascita(), ((StudenteObj) oggetto).getDataDiNascita()) && Objects.equals(getClasse(), ((StudenteObj) oggetto).getClasse())){
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        try {
            return super.info();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}