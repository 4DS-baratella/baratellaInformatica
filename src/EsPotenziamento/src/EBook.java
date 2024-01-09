package EsPotenziamento.src;

public class EBook extends Book {

    private boolean audio;


    public EBook(String title, String author, String isbn, boolean audio) {
        super(title, author, isbn);
        this.audio = audio;
    }

    public String getDetails(){
        String str = "[" + super.toString() + " | Audio availability: " + audio + "]";
        return str;
    }
}
