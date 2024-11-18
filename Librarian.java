public class Librarian extends User {
    public Librarian(int id, String name, String email) {
        super(id, name, email);
        this.userType = "Librarian";
    }

    @Override
    public void register() {
    }

    @Override
    public void login() {
    }

    public void addBook(Book book, Library library) {
        library.addBook(book);
        System.out.println("Добавлена книга: " + book.getBookInfo());
    }

    public void removeBook(Book book, Library library) {
        library.removeBook(book);
        System.out.println("Удалена книга: " + book.getBookInfo());
    }

    public void editBook(Book book, String newTitle, int newYear) {
        book.changeAvailabilityStatus(false);
        System.out.println("Редактирование книги: " + book.getBookInfo());
        book.changeAvailabilityStatus(true);
    }
}
