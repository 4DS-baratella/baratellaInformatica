package ClasseStudente;

public class Studente {
    private String nome, cognome;

    public Studente(String cognome, String nome) throws Exception{
        setNome(nome);
        setCognome(cognome);
    }

    public Studente(Studente studente){
        this.nome = studente.getNome();
        this.cognome = studente.getCognome();
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome = '" + nome + '\'' +
                ", cognome = '" + cognome + '\'' +
                '}';
    }

    public void setNome(String nome) throws Exception {
        if(controllaStringa2(nome)){
            this.nome = nome.trim();
        }
    }

    public void setCognome(String cognome) throws Exception {
        if(controllaStringa2(cognome)){
            this.cognome = cognome.trim();
        }
    }

    private boolean controllaStringa(String s) throws Exception{
        try{
            if(s == null){
                throw new NullPointerException("\nStringa null.");
            }
            if(s.length() < 2){
                throw new Exception("\nStringa troppo corta.");
            }
            String[] tmp = s.split(" ");
            for(int i = 0; i < tmp.length; i++){
                if(!tmp[i].matches("[A-Z][a-z]*")) { //L'asterisco indica il resto dei caratteri nella stringa perché la prima è controllata dalla prima parentesi quadra
                    throw new Exception("\nIniziali sbagliate.");
                }
            }
        }catch (NullPointerException e){
            throw new Exception("\nTipo di dato non valido.");
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return true;
    }

    //Esercitazione fatta in classe
    private boolean controllaStringa2(String s) throws Exception {
        try{
            if(s == null){
                throw new NullPointerException();
            }

            if(s.length() < 2){
                throw new Exception("\nStringa troppo corta.");
            }

            String[] tmp = s.split(" ");
            for(int i = 0; i < tmp.length; i++){
                if(tmp[i].equals("")){
                    throw new Exception("\nTroppi spazi inseriti.");
                }
                if(tmp[i].charAt(0) >= 65 && tmp[i].charAt(0) <= 90){
                    for(int j = 1; j < tmp[i].length(); j++) {
                        if (tmp[i].charAt(j) == 39) {
                            checkApostrofo(tmp[i], j);  //chiamo il metodo per controllare che dopo l'apostrofo ci siano una lettera maiuscola e minimo una minuscola
                            j++;  //incremento il counter perché ho già controllato che la lettera dopo l'apostrofo sia maiuscola
                        }else if(!(tmp[i].charAt(j) >= 97 && tmp[i].charAt(j) <= 122) && (tmp[i].charAt(tmp[i].length() - 1) == 130 || tmp[i].charAt(tmp[i].length() - 1) == 133 || tmp[i].charAt(tmp[i].length() - 1) == 141 || tmp[i].charAt(tmp[i].length() - 1) == 149 || tmp[i].charAt(tmp[i].length() - 1) == 151)){
                            throw new Exception("\nLe lettere dopo la prima non sono minuscole.");
                        }
                    }
                }else{
                    throw new Exception("\nLa prima lettera non è maiuscola.");
                }
            }

        }catch (NullPointerException e){
            throw new Exception("\nElemento null.");
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return true;
    }

    private void checkApostrofo(String s, int j) throws Exception{
        if(s.charAt(s.length() - 1) == 39){
            throw new Exception("\nNon devono esserci spazi dopo l'apostrofo.");
        }
        if(!(s.charAt(j + 1) >= 65 && s.charAt(j) <= 90)){
            throw new Exception("\nDopo l'apostrofo la lettera deve essere maiuscola.");
        }
    }
}
