public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("George Orwell");

        Book book1 = new Book("Harry Potter", "12345", author1, 1997);
        Book book2 = new Book("1984", "67890", author2, 1949);

        author1.addBook(book1);
        author2.addBook(book2);

        Library library = new Library();

        Reader reader = new Reader(1, "Alice", "alice@example.com");
        Librarian librarian = new Librarian(2, "Bob", "bob@example.com");

        librarian.addBook(book1, library);
        librarian.addBook(book2, library);

        reader.borrowBook(book1);

        reader.borrowBook(book1);

        reader.returnBook(book1);

        librarian.removeBook(book2, library);
    }
}
