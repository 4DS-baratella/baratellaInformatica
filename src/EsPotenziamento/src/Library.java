package EsPotenziamento.src;

public class Library {
    private Book[] books;
    private User[] users;

    public Library() {
        this.books = new Book[0];
        this.users = new User[0];
    }

    public void addUser(User user){
        User[] tmp = new User[this.users.length + 1];
        for(int i = 0; i < users.length; i++){
            tmp[i] = users[i];
        }
        tmp[users.length] = user;
        users = new User[users.length + 1];
        users = tmp;
    }

    public Book[] getBooks() {
        return books;
    }

    public User[] getUsers() {
        return users;
    }

    public void addBook(Book book){
        Book[] tmp = new Book[this.books.length + 1];
        for(int i = 0; i < books.length; i++){
            tmp[i] = books[i];
        }
        tmp[books.length] = book;
        books = new Book[books.length + 1];
        books = tmp;
    }

    public void borrowBook(User user, Book book){
        book.borrow(user);
    }

    public void returnBook(Book book){
        book.returnItem();
    }

}
