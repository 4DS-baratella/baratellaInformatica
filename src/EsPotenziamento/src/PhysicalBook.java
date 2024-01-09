package EsPotenziamento.src;

public class PhysicalBook extends Book {
    private int shelfNumber;
    private String condition;

    public PhysicalBook(String title, String author, String isbn, int shelfNumber, String condition) {
        super(title, author, isbn);
        this.shelfNumber = shelfNumber;
        this.condition = condition;
    }

    public String getDetails(){
        String str = "[" + super.toString() + " | Shelf number: " + shelfNumber + " | Condition: " + condition + "]";
        return str;
    }
}
