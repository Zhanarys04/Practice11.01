public class Reader extends User {
    public Reader(int id, String name, String email) {
        super(id, name, email);
        this.userType = "Reader";
    }

    @Override
    public void register() {

    }

    @Override
    public void login() {

    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            System.out.println(name + " взял книгу: " + book.getBookInfo());
            book.changeAvailabilityStatus(false);
        } else {
            System.out.println("Книга на данный момент недоступна.");
        }
    }

    public void returnBook(Book book) {
        System.out.println(name + " вернул книгу: " + book.getBookInfo());
        book.changeAvailabilityStatus(true);
    }
}

