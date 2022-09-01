public class Book {
    private String bookTitle;
    private Author author;
    int publishingYear;

    public Book (String bookTitle, Author author, int publishingYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getBookTitle () {
        return this.bookTitle;
    }
    public Author getAuthor () {
        return this.author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
