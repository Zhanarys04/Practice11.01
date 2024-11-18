import java.time.LocalDate;

public class Loan {
    private Book book;
    private Reader reader;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public Loan(Book book, Reader reader) {
        this.book = book;
        this.reader = reader;
        this.loanDate = LocalDate.now();
    }

    public void issueLoan() {
        System.out.println("Книга выдан на " + book.getBookInfo() + " к " + reader.name);
    }

    public void returnBook() {
        System.out.println("Книга возвращена: " + book.getBookInfo());
    }
}
