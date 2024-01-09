package EsPotenziamento.src;

public abstract class Book implements IBorrowable{
    private String title;
    private String author;
    private String isbn;
    private boolean availabilityStatus;
    private User user;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availabilityStatus = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable(){
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public void borrow(User user){
        setAvailabilityStatus(false);
        this.user = user;
    }

    public void returnItem(){
        setAvailabilityStatus(true);
        this.user = null;
    }

    public abstract String getDetails();

    @Override
    public String toString() {
        return "[Title: " + title + " | Author: " + author + " | ISBN: " + isbn + " | Availability status: " + isAvailable() + " | User: " + user + "]";
    }


}

