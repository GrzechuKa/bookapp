public class Book {

    private final String title;
    private final String author;
    private final Integer relaceDate;
    private final Integer nuberOfPages;
    private final String publishingHouse;
    private final String typeBook;
    private final String isbn;

    public Book(String title, String author, Integer dateOfRead, Integer nuberOfPages, String publishinHouse, String typeBook, String isbn) {
        this.title = title;
        this.author = author;
        this.relaceDate = dateOfRead;
        this.nuberOfPages = nuberOfPages;
        this.publishingHouse = publishinHouse;
        this.typeBook = typeBook;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getRelaceDate() {
        return relaceDate;
    }

    public Integer getNuberOfPages() {
        return nuberOfPages;
    }

    public String getPublishinHouse() {
        return publishingHouse;
    }

    public String getTypeBook() {
        return typeBook;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", relaceDate = " + relaceDate +
                ", nuberOfPages = " + nuberOfPages +
                ", publishingHouse = '" + publishingHouse + '\'' +
                ", typeBook = '" + typeBook + '\'' +
                ", isbn = '" + isbn + '\'' +
                '}';
    }
}
