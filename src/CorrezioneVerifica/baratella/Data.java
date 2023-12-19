package CorrezioneVerifica.baratella;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Data {
    private String data;
    private Integer giorno;
    private Integer mese;
    private Integer anno;

    public Data(){
        GregorianCalendar dataOggi = new GregorianCalendar();
        giorno = dataOggi.get(GregorianCalendar.DAY_OF_MONTH);
        mese = dataOggi.get(GregorianCalendar.MONTH);
        anno = dataOggi.get(GregorianCalendar.YEAR);
    }

    public Data(String data) throws Exception {
        setData(data);
        String[] dataInfo = data.split("/|-");
        setGiorno(Integer.parseInt(dataInfo[0]));
        setMese(Integer.parseInt(dataInfo[1]));
        setAnno(Integer.parseInt(dataInfo[2]));
    }

    public Data(Integer giorno, Integer mese, Integer anno){
        setGiorno(giorno);
        setMese(mese);
        setAnno(anno);
    }

    public Data(Data data){
        this.data = data.data;
        this.giorno = data.giorno;
        this.mese = data.mese;
        this.anno = data.anno;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception{
        //Regex per il controllo della data con anche l'anno bisestile per il controllo di febbraio
        if(verificaData(data)){
            this.data = data;
        }else{
            throw new Exception("\nFormato data non valido.");
        }
    }

    public Integer getGiorno() {
        return giorno;
    }

    public void setGiorno(Integer giorno) {
        this.giorno = giorno;
    }

    public Integer getMese() {
        return mese;
    }

    public void setMese(Integer mese) {
        this.mese = mese;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    private boolean verificaData(String data) throws Exception{
        if(!data.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")){
            throw new Exception("\nFormato data non valido.");
        }
    }
}
