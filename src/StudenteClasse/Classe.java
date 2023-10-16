package StudenteClasse;

import java.util.Arrays;

public class Classe {
    Studente capoClasse;
    Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti){
        this.capoClasse = capoClasse;
        this.studenti = studenti.clone();
    }

    public Studente getCapoClasse(){
        return new Studente(capoClasse);
    }

    public Studente[] getStudenti() {
        return studenti.clone();
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse = new Studente(capoClasse);
    }

    public void invertiAttributi() throws Exception{
        try{
            String tmp;
            tmp = capoClasse.getNome();
            capoClasse.setNome(capoClasse.getCognome());
            capoClasse.setCognome(tmp);

            for(int i = 0; i < studenti.length; i++){
                try{
                    tmp = studenti[i].getNome();
                    studenti[i].setNome(studenti[i].getCognome());
                    studenti[i].setCognome(tmp);
                }catch (Exception e){
                    throw new Exception(e.getMessage());
                }
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Classe{" +
                " capoClasse = " + capoClasse +
                ", studenti = " + Arrays.toString(studenti) +
                '}';
    }
}
