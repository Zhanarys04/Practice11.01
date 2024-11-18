public class Book {
    private String title;
    private String ISBN;
    private Author author;
    private int publicationYear;
    private boolean availabilityStatus;

    public Book(String title, String ISBN, Author author, int publicationYear) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.publicationYear = publicationYear;
        this.availabilityStatus = true;
    }

    public void changeAvailabilityStatus(boolean status) {
        this.availabilityStatus = status;
    }

    public String getBookInfo() {
        return "Title: " + title + ", ISBN: " + ISBN + ", Author: " + author.getName() + ", Year: " + publicationYear;
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }

    public String getTitle() {
        return title;
    }
}

