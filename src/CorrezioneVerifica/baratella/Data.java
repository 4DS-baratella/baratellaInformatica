package CorrezioneVerifica.baratella;

import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.Objects;

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

    public Data(Integer giorno, Integer mese, Integer anno) throws Exception{
        String tmp = giorno + "/" + mese + "/" + anno;
        if(verificaData(tmp)){
            setGiorno(giorno);
            setMese(mese);
            setAnno(anno);
            setData(tmp);
        }
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

    public Integer differenzaInGiorni(Data dataAntecedente, Data dataSuccessiva) throws Exception{
        int giorni = 0;
        Integer annoAntecedente = dataAntecedente.getAnno();
        Integer meseAntecedente = dataAntecedente.getMese();
        Integer giornoAntecedente = dataAntecedente.getGiorno();
        Integer annoSuccessivo = dataSuccessiva.getAnno();
        Integer meseSuccessivo = dataSuccessiva.getMese();
        Integer giornoSuccessivo = dataSuccessiva.getGiorno();

        if (annoSuccessivo > annoAntecedente || (annoSuccessivo.equals(annoAntecedente) && meseSuccessivo > meseAntecedente) || (annoSuccessivo.equals(annoAntecedente) && meseSuccessivo.equals(meseAntecedente) && giornoSuccessivo >= giornoAntecedente)) {
            for(int anno = annoAntecedente; anno < annoSuccessivo; anno++){
                giorni += isAnnoBisestile(anno) ? 366 : 365;
            }
            for(int mese = meseAntecedente; mese < meseSuccessivo; mese++){
                giorni += giorniInMese(annoSuccessivo, mese);
            }
            giorni += giornoSuccessivo - giornoAntecedente;
        }else{
            throw new Exception("\nLa data successiva deve essere maggiore o uguale alla precedente per calcolare i giorni.");
        }
        return giorni;
    }

    public Integer differenzeInMesi(Data dataAntecedente, Data dataSuccessiva) throws Exception{
        int mesi = 0;
        Integer annoAntecedente = dataAntecedente.getAnno();
        Integer meseAntecedente = dataAntecedente.getMese();
        Integer annoSuccessivo = dataSuccessiva.getAnno();
        Integer meseSuccessivo = dataSuccessiva.getMese();
        if (annoSuccessivo > annoAntecedente || (annoSuccessivo.equals(annoAntecedente) && meseSuccessivo > meseAntecedente) || (annoSuccessivo.equals(annoAntecedente) && meseSuccessivo.equals(meseAntecedente))) {
            for(int anno = annoAntecedente; anno < annoSuccessivo; anno++){
                mesi += 12;
            }
            for(int mese = meseAntecedente; mese < meseSuccessivo; mese++){
                mesi += 1;
            }
        }else{
            throw new Exception("\nLa data successiva deve essere maggiore o uguale alla precedente per calcolare i giorni.");
        }
        return mesi;
    }

    public Integer differenzaInAnni(Data dataAntecedente, Data dataSuccessiva) throws Exception{
        int anni = 0;
        Integer annoAntecedente = dataAntecedente.getAnno();
        Integer annoSuccessivo = dataSuccessiva.getAnno();

        if (annoSuccessivo > annoAntecedente || annoSuccessivo.equals(annoAntecedente)) {
            for(int anno = annoAntecedente; anno < annoSuccessivo; anno++){
                anni += 12;
            }
        }else{
            throw new Exception("\nLa data successiva deve essere maggiore o uguale alla precedente per calcolare i giorni.");
        }
        return anni;
    }

    private boolean verificaData(String data) throws Exception{
        if(data.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")){
            return true;
        }else{
            throw new Exception("\nFormato data non valido.");
        }
    }

    private boolean isAnnoBisestile(Integer anno) {
        return anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0);
    }

    private int giorniInMese(Integer anno, Integer mese) {
        int[] giorniInMese = {0, 31, isAnnoBisestile(anno) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return giorniInMese[mese];
    }
}
