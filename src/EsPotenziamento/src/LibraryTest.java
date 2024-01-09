package EsPotenziamento.src;

public class LibraryTest {
    public static void main(String[] args) {
        // Creazione di utenti
        User user1 = new User("Mario");
        User user2 = new User("Luigi");

        // Creazione di libri
        Book ebook = new EBook("Java Programming", "John Doe", "123456789", true);
        Book physicalBook = new PhysicalBook("Data Structures", "Jane Smith", "987654321", 42, "Good");

        // Creazione di una biblioteca
        Library library = new Library();

        // Aggiunta di utenti alla biblioteca
        library.addUser(user1);
        library.addUser(user2);

        // Aggiunta di libri alla biblioteca
        library.addBook(ebook);
        library.addBook(physicalBook);

        // Prestito di un libro da parte di un utente
        library.borrowBook(user1, ebook);

        // Stampa dei dettagli dei libri nella biblioteca
        System.out.println("Dettagli dei libri nella biblioteca:");
        for (Book book : library.getBooks()) {
            System.out.println(book.getDetails());
        }

        // Restituzione di un libro alla biblioteca
        library.returnBook(ebook);

        // Stampa dei dettagli aggiornati dei libri nella biblioteca
        System.out.println("\nDettagli aggiornati dei libri nella biblioteca:");
        for (Book book : library.getBooks()) {
            System.out.println(book.getDetails());
        }
    }
}
