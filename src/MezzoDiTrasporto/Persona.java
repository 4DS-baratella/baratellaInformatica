package MezzoDiTrasporto;

import java.util.Objects;

public class Persona{
    private String cognome, nome, codFisc;
    protected int numIstanze, eta;

    public Persona(){
        numIstanze++;
    }

    public Persona(String cognome, String nome, String codFisc, int eta) throws Exception{
        this();
        controlloNominativi(cognome);
        controlloNominativi(nome);
        controlloCodFisc(codFisc);
        setEta(eta);
        this.cognome = cognome;
        this.nome = nome;
        this.codFisc = codFisc;

    }

    public Persona(Persona pers){
        this();
        this.cognome = pers.cognome;
        this.nome = pers.nome;
        this.codFisc = pers.codFisc;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public boolean verificaOmonimia(Persona pers) throws Exception{
        return this.equals(pers);
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) throws Exception{
        if(eta > 0){
            this.eta = eta;
        }else{
            throw new Exception("\nL'età non può essere minore di 0.");
        }
    }

    public boolean equals(Object ogg){
        boolean flag = false;
        if(ogg instanceof Persona){
            Persona persona = (Persona) ogg;
            if(Objects.equals(this.getCognome(), persona.getCognome()) && Objects.equals(this.getNome(), persona.getNome()) && Objects.equals(this.getCodFisc(), persona.getCodFisc())){
                flag = true;
            }
        }
        return flag;
    }

    private void controlloNominativi(String nominativo) throws Exception{
        try{
            controlloStringa(nominativo);

            String[] tmp = nominativo.split(" ");

            for(int i = 0; i < tmp.length; i++){
                if(tmp[i].charAt(0) > 64 && tmp[i].charAt(0) < 91){
                    for(int j = 1; j < tmp[i].length(); j++){
                        if(!(tmp[i].charAt(j) > 96 && tmp[i].charAt(j) < 123)){
                            throw new Exception("Le lettere dopo la prima non sono minuscole.");
                        }
                    }
                }else{
                    throw new Exception("La prima lettera non è maiuscola.");
                }
            }
        }catch (NullPointerException e){
            throw new NullPointerException(e.getMessage());
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "[" + cognome + ", " + nome + ", " + codFisc + "]";
    }

    private void controlloStringa(String str) throws Exception{
        if(str == null){
            throw new Exception("\nParametro nullo.");
        }
        if(str.equals("")){
            throw new Exception("\nParametro vuoto.");
        }
    }

    private void controlloCodFisc(String codFisc) throws Exception{
        controlloStringa(codFisc);
        if(!(codFisc.matches("[a-zA-Z]{6}[0-9]{2}[a-zA-Z][0-9]{2}[a-zA-Z][0-9]{3}[a-zA-Z]"))){
            throw new Exception("\nErrore nel codice fiscale inserito.");
        }
    }
}
