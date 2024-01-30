package TipiGenerici;

public class Stampa {
    public static <T> String stampaElemento(Integer elemento) throws Exception{
        String testo;
        if(elemento != null){
            testo = "[" + String.valueOf(elemento) + "]";
        }else{
            throw new Exception("L'oggetto non può essere null");
        }
        return testo;
    }
    // Analogamente per tutte le altre classi wrapper e classi create da noi
}
